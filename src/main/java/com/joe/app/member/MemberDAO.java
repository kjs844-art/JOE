package com.joe.app.member;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.joe.app.util.DBConnection;

public class MemberDAO {

	public int insertMember(MemberDTO dto) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO MEMBER (USER_ID, PASSWORD, NAME, EMAIL) VALUES (?, ?, ?, ?)";

		try {
			DBConnection dbConnection = new DBConnection();
			conn = dbConnection.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getUserId());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getEmail());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
			}

			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
			}
		}

		return result;
	}
}

/*
설명
- MemberDAO는 회원 관련 DB 작업을 담당한다.
- insertMember()는 DTO 값을 받아 MEMBER 테이블에 INSERT 한다.
- DBConnection 클래스로 오라클 연결을 가져온다.
- PreparedStatement로 물음표 자리에 값을 넣고 executeUpdate()로 실행한다.
- 성공하면 보통 1, 실패하면 0이 반환된다.

DAO 6단계
1. DB 연결
2. SQL 만들기
3. 미리 전송
4. 물음표 값 세팅
5. 최종 전송 및 결과 처리
6. 연결 해제

수정 직전 코드 보관

package com.joe.app.member;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.joe.app.util.DBConnection;

// 회원 관련 DB 작업을 담당하는 DAO 클래스
public class MemberDAO {

	// 회원가입 데이터를 MEMBER 테이블에 저장하는 메서드
	public int insertMember(MemberDTO dto) {
		// INSERT 성공 결과를 저장할 변수
		int result = 0;

		// DB 연결 객체
		Connection conn = null;

		// SQL 실행 준비 객체
		PreparedStatement pstmt = null;

		// 회원가입 INSERT SQL
		String sql = "INSERT INTO MEMBER (USER_ID, PASSWORD, NAME, EMAIL) VALUES (?, ?, ?, ?)";

		try {
			// 프로젝트에 이미 있는 DBConnection 유틸 객체 생성
			DBConnection dbConnection = new DBConnection();

			// DB 연결
			conn = dbConnection.getConnection();

			// SQL 미리 전송
			pstmt = conn.prepareStatement(sql);

			// 첫 번째 물음표에 아이디 세팅
			pstmt.setString(1, dto.getUserId());

			// 두 번째 물음표에 비밀번호 세팅
			pstmt.setString(2, dto.getPassword());

			// 세 번째 물음표에 이름 세팅
			pstmt.setString(3, dto.getName());

			// 네 번째 물음표에 이메일 세팅
			pstmt.setString(4, dto.getEmail());

			// 최종 전송 및 결과 처리
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			// 예외가 나면 콘솔에 에러 출력
			e.printStackTrace();

		} finally {
			// PreparedStatement 자원 해제
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
			}

			// Connection 자원 해제
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
			}
		}

		// 성공이면 1, 실패면 0 반환
		return result;
	}
}
*/
