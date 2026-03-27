package com.joe.community;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.joe.app.util.DBConnection;

/*
 * CommunityDAO (Data Access Object)
 * DB에 실제로 SQL을 실행하는 역할이다.
 * Controller가 이 클래스를 만들어서 메서드를 호출한다.
 */
public class CommunityDAO {

	private DBConnection connection;

	public CommunityDAO() {
		this.connection = new DBConnection();
	}

	// ── 1. 등록 (INSERT) ─────────────────────────────────────────────────
	public int create(Community dto) throws Exception {
		/*
		 * 등록 흐름
		 * 1. CommunityCreateController 가 dto 를 만들어서 넘겨준다.
		 * 2. COMMUNITY 테이블에 한 행을 INSERT 한다.
		 * 3. COMMUNITY_SEQ.NEXTVAL 로 글번호를 자동 생성한다.
		 * 4. 작성시간(REG_DATE)은 DB가 SYSDATE 로 자동 입력한다.
		 */
		Connection con = connection.getConnection();
		String sql = """
				INSERT INTO COMMUNITY (NO, TITLE, NAME, CONTENTS, REG_DATE, STAR)
				VALUES (COMMUNITY_SEQ.NEXTVAL, ?, ?, ?, SYSDATE, ?)
				""";

		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, dto.getTitle());
		st.setString(2, dto.getName());
		st.setString(3, dto.getContents());
		st.setInt(4, dto.getStar());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	// ── 2. 목록 조회 (SELECT ALL) ────────────────────────────────────────
	public ArrayList<Community> list() throws Exception {
		/*
		 * 목록 흐름
		 * 1. COMMUNITY 테이블 전체를 글번호 내림차순으로 조회한다.
		 * 2. 최신 글이 위에 오도록 ORDER BY NO DESC 를 사용한다.
		 */
		Connection con = connection.getConnection();
		String sql = """
				SELECT NO, TITLE, NAME, REG_DATE, STAR
				FROM COMMUNITY
				ORDER BY NO DESC
				""";

		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();

		ArrayList<Community> list = new ArrayList<>();

		while (rs.next()) {
			Community dto = new Community();
			dto.setNo(rs.getInt("NO"));
			dto.setTitle(rs.getString("TITLE"));
			dto.setName(rs.getString("NAME"));
			dto.setRegDate(rs.getDate("REG_DATE"));
			dto.setStar(rs.getInt("STAR"));
			list.add(dto);
		}

		rs.close();
		st.close();
		con.close();

		return list;
	}

	// ── 3. 상세 조회 (SELECT ONE) ────────────────────────────────────────
	public Community detail(int no) throws Exception {
		/*
		 * 상세 흐름
		 * 글번호(NO) 1개를 받아서 그 행만 꺼낸다.
		 * 내용(CONTENTS)도 이 화면에서 보여준다.
		 */
		Connection con = connection.getConnection();
		String sql = "SELECT * FROM COMMUNITY WHERE NO = ?";

		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, no);

		ResultSet rs = st.executeQuery();
		Community dto = null;

		if (rs.next()) {
			dto = new Community();
			dto.setNo(rs.getInt("NO"));
			dto.setTitle(rs.getString("TITLE"));
			dto.setName(rs.getString("NAME"));
			dto.setContents(rs.getString("CONTENTS"));
			dto.setRegDate(rs.getDate("REG_DATE"));
			dto.setStar(rs.getInt("STAR"));
		}

		rs.close();
		st.close();
		con.close();

		return dto;
	}
}
