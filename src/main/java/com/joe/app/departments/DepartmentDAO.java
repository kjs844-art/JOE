package com.joe.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.joe.app.util.DBConnection;

public class DepartmentDAO {
	private DBConnection connection;

	public DepartmentDAO() {
		this.connection = new DBConnection();
	}

	public int update(DepartmentDTO departmentDTO) throws Exception {
		Connection con = connection.getConnection();
		String sql = """
				UPDATE DEPARTMENTS
				SET
					DEPARTMENT_NAME=?,
					MANAGER_ID=?,
					LOCATION_ID=?
				WHERE DEPARTMENT_ID=?
				""";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, departmentDTO.getDepartmentName());
		st.setInt(2, departmentDTO.getManagerId());
		st.setInt(3, departmentDTO.getLocationId());
		st.setInt(4, departmentDTO.getDepartmentId());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	public int delete(DepartmentDTO departmentDTO) throws Exception {
		Connection con = connection.getConnection();
		String sql = "DELETE DEPARTMENTS WHERE DEPARTMENT_ID=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, departmentDTO.getDepartmentId());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	public int create(DepartmentDTO departmentDTO) throws Exception {
		Connection con = connection.getConnection();
		String sql = """
				INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
				VALUES (DEPARTMENTS_SEQ.NEXTVAL, ?, ?, ?)
				""";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, departmentDTO.getDepartmentName());
		st.setInt(2, departmentDTO.getManagerId());
		st.setInt(3, departmentDTO.getLocationId());

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	public DepartmentDTO detail(int departmentId) throws Exception {
		Connection con = connection.getConnection();
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, departmentId);

		ResultSet rs = st.executeQuery();
		DepartmentDTO dto = null;
		if (rs.next()) {
			dto = new DepartmentDTO();
			dto.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
			dto.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
			dto.setManagerId(rs.getInt("MANAGER_ID"));
			dto.setLocationId(rs.getInt("LOCATION_ID"));
		}

		rs.close();
		st.close();
		con.close();

		return dto;
	}

	public ArrayList<DepartmentDTO> list() throws Exception {
		Connection con = connection.getConnection();
		String sql = """
				SELECT * FROM DEPARTMENTS
				ORDER BY DEPARTMENT_ID DESC
				""";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();

		ArrayList<DepartmentDTO> ar = new ArrayList<>();
		while (rs.next()) {
			DepartmentDTO dto = new DepartmentDTO();
			dto.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
			dto.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
			dto.setManagerId(rs.getInt("MANAGER_ID"));
			dto.setLocationId(rs.getInt("LOCATION_ID"));
			ar.add(dto);
		}

		rs.close();
		st.close();
		con.close();

		return ar;
	}
}
