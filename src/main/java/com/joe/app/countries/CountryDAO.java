package com.joe.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.joe.app.util.DBConnection;

public class CountryDAO {
	
	public void detail()throws Exception{
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID='US'";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			String name = rs.getString("COUNTRY_NAME");
			System.out.println(name);
		}else {
			System.out.println("없다");
		}
		
		rs.close();
		st.close();
		con.close();
	}
	
	
	public void list() throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			String name = rs.getString("COUNTRY_NAME");
			String id = rs.getString("COUNTRY_ID");
			System.out.println(id + " : "+name);
		}
		
		rs.close();
		st.close();
		con.close();
	}

	public int createCountry(CountryDTO countryDTO) throws Exception {
		DBConnection connection = new DBConnection();
		// DB 연결 객체를 만든다.
		Connection con = connection.getConnection();
		// Oracle HR 계정으로 실제 연결을 연다.

		String sql = "INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME) VALUES (?, ?)";
		// 사용자가 입력한 나라 코드와 나라 이름을 COUNTRIES 테이블에 넣는 SQL이다.

		PreparedStatement st = con.prepareStatement(sql);
		// SQL을 미리 전송할 준비를 한다.

		st.setString(1, countryDTO.getCountryId());
		// 첫 번째 물음표(?)에 나라 코드를 넣는다.
		st.setString(2, countryDTO.getCountryName());
		// 두 번째 물음표(?)에 나라 이름을 넣는다.

		int result = st.executeUpdate();
		// INSERT를 실행하고, 성공한 행 수를 result에 담는다.

		st.close();
		// PreparedStatement를 닫는다.
		con.close();
		// DB 연결을 닫는다.

		return result;
		// 1이면 성공, 0이면 실패로 보면 된다.
	}

	public ArrayList<CountryDTO> listCountry() throws Exception {
		DBConnection connection = new DBConnection();
		// DB 연결 객체를 만든다.
		Connection con = connection.getConnection();
		// 실제 Oracle 연결을 연다.

		String sql = "SELECT COUNTRY_ID, COUNTRY_NAME FROM COUNTRIES ORDER BY COUNTRY_ID";
		// COUNTRIES 전체를 나라 코드 순서로 조회한다.

		PreparedStatement st = con.prepareStatement(sql);
		// SQL을 실행 준비한다.
		ResultSet rs = st.executeQuery();
		// SELECT 결과를 rs로 받는다.

		ArrayList<CountryDTO> ar = new ArrayList<CountryDTO>();
		// JSP로 넘길 DTO 목록을 담을 리스트를 만든다.

		while (rs.next()) {
			CountryDTO countryDTO = new CountryDTO();
			// 한 행(row)을 담을 DTO를 새로 만든다.

			countryDTO.setCountryId(rs.getString("COUNTRY_ID"));
			// 현재 행의 COUNTRY_ID를 DTO에 넣는다.
			countryDTO.setCountryName(rs.getString("COUNTRY_NAME"));
			// 현재 행의 COUNTRY_NAME을 DTO에 넣는다.

			ar.add(countryDTO);
			// 완성된 DTO를 리스트에 추가한다.
		}

		rs.close();
		// ResultSet을 닫는다.
		st.close();
		// PreparedStatement를 닫는다.
		con.close();
		// DB 연결을 닫는다.

		return ar;
		// JSP가 출력할 전체 나라 목록을 돌려준다.
	}

	public CountryDTO detailCountry(String countryId) throws Exception {
		DBConnection connection = new DBConnection();
		// DB 연결 객체를 만든다.
		Connection con = connection.getConnection();
		// 실제 Oracle 연결을 연다.

		String sql = "SELECT COUNTRY_ID, COUNTRY_NAME FROM COUNTRIES WHERE COUNTRY_ID = ?";
		// 나라 코드 1개를 기준으로 한 건만 조회한다.

		PreparedStatement st = con.prepareStatement(sql);
		// SQL을 실행 준비한다.
		st.setString(1, countryId);
		// 물음표(?)에 브라우저에서 받은 나라 코드를 넣는다.

		ResultSet rs = st.executeQuery();
		// SELECT 결과를 rs로 받는다.
		CountryDTO countryDTO = null;
		// 결과가 없을 수도 있으므로 처음에는 null로 둔다.

		if (rs.next()) {
			countryDTO = new CountryDTO();
			// 결과가 있으면 DTO를 만든다.

			countryDTO.setCountryId(rs.getString("COUNTRY_ID"));
			// DB의 COUNTRY_ID를 DTO에 넣는다.
			countryDTO.setCountryName(rs.getString("COUNTRY_NAME"));
			// DB의 COUNTRY_NAME을 DTO에 넣는다.
		}

		rs.close();
		// ResultSet을 닫는다.
		st.close();
		// PreparedStatement를 닫는다.
		con.close();
		// DB 연결을 닫는다.

		return countryDTO;
		// JSP가 출력할 한 건의 나라 데이터를 돌려준다.
	}

}
