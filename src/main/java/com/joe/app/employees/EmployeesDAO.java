package com.joe.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.joe.app.util.DBConnection;

public class EmployeesDAO {

	public void detailByDepartment(int departmentId) throws Exception {
		DBConnection connection = new DBConnection();
		Connection con = connection.getConnection();

		String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL "
				+ "FROM EMPLOYEES WHERE DEPARTMENT_ID = ?";

		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, departmentId);

		ResultSet rs = st.executeQuery();

		if (rs.next()) {
			int employeeId = rs.getInt("EMPLOYEE_ID");
			String firstName = rs.getString("FIRST_NAME");
			String lastName = rs.getString("LAST_NAME");
			String email = rs.getString("EMAIL");

			System.out.println("EMPLOYEE_ID : " + employeeId);
			System.out.println("FIRST_NAME : " + firstName);
			System.out.println("LAST_NAME : " + lastName);
			System.out.println("EMAIL : " + email);
		} else {
			System.out.println("직원 데이터가 없다");
		}

		rs.close();
		st.close();
		con.close();
	}
}
