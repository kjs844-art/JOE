package com.joe.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;

import com.joe.app.util.DBConnection;

public class DepartmentDAO {

	public int create(DepartmentDTO departmentDTO) throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();

		String sql = """
				INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)
				VALUES (DEPARTMENTS_SEQ.NEXTVAL, ?, ?, ?)
				""";

		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, departmentDTO.getDepartmentName());

		if (departmentDTO.getManagerId() == null) {
			st.setNull(2, Types.INTEGER);
		} else {
			st.setInt(2, departmentDTO.getManagerId());
		}

		if (departmentDTO.getLocationId() == null) {
			st.setNull(3, Types.INTEGER);
		} else {
			st.setInt(3, departmentDTO.getLocationId());
		}

		int result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	public DepartmentDTO detail(int departmentId) throws Exception {
		DBConnection connection = new DBConnection();
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

			int managerId = rs.getInt("MANAGER_ID");
			if (rs.wasNull()) {
				dto.setManagerId(null);
			} else {
				dto.setManagerId(managerId);
			}

			int locationId = rs.getInt("LOCATION_ID");
			if (rs.wasNull()) {
				dto.setLocationId(null);
			} else {
				dto.setLocationId(locationId);
			}
		}

		rs.close();
		st.close();
		con.close();

		return dto;
	}

	public ArrayList<DepartmentDTO> list() throws Exception {
		DBConnection connection = new DBConnection();
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
			dto.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
			dto.setDepartmentName(rs.getString("DEPARTMENT_NAME"));

			int managerId = rs.getInt("MANAGER_ID");
			if (rs.wasNull()) {
				dto.setManagerId(null);
			} else {
				dto.setManagerId(managerId);
			}

			int locationId = rs.getInt("LOCATION_ID");
			if (rs.wasNull()) {
				dto.setLocationId(null);
			} else {
				dto.setLocationId(locationId);
			}

			ar.add(dto);
		}

		rs.close();
		st.close();
		con.close();

		return ar;
	}
}
