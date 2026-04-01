package com.joe.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.joe.app.util.DBConnection;

public class EmployeeDAO {

	private DBConnection connection;

	public EmployeeDAO() {
		this.connection = new DBConnection();
	}

	public EmployeeDTO login(EmployeeDTO employeeDTO) throws Exception {
		String sql = """
					SELECT * FROM EMPLOYEES
					WHERE EMPLOYEE_ID=? AND PASSWORD=?
					""";

		try (Connection con = connection.getConnection();
				PreparedStatement st = con.prepareStatement(sql)) {

			st.setInt(1, employeeDTO.getEmployeeId());
			st.setString(2, employeeDTO.getPassword());

			try (ResultSet rs = st.executeQuery()) {
				if (rs.next()) {
					employeeDTO.setFirstName(rs.getString("FIRST_NAME"));
					employeeDTO.setLastName(rs.getString("LAST_NAME"));
					employeeDTO.setHireDate(rs.getDate("HIRE_DATE"));
					employeeDTO.setSalary(rs.getDouble("SALARY"));
					employeeDTO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
					return employeeDTO;
				}
			}
		}

		return null;
	}
}
