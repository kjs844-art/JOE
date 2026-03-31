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

	// [CODEX-ADD] 선생님 Git 기준 버전
	// 로그인 검증
	public EmployeeDTO login(EmployeeDTO employeeDTO) throws Exception {
		Connection con = connection.getConnection();
		String sql = """
					SELECT * FROM EMPLOYEES
					WHERE EMPLOYEE_ID=? AND PASSWORD=?
					""";
		PreparedStatement st = con.prepareStatement(sql);

		st.setInt(1, employeeDTO.getEmployeeId());
		st.setString(2, employeeDTO.getPassword());

		ResultSet rs = st.executeQuery();

		if (rs.next()) {
			employeeDTO.setFirstName(rs.getString("FIRST_NAME"));
			employeeDTO.setLastName(rs.getString("LAST_NAME"));
			employeeDTO.setHireDate(rs.getDate("HIRE_DATE"));
			employeeDTO.setSalary(rs.getDouble("SALARY"));
			employeeDTO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));

			return employeeDTO;
		}

		return null;
		
		
		
		HttpSession session = request.getSession();
		session.setAttribute("dto", employeeDTO);
		response.sendRedirect("/home");
		

	}

	/* [CODEX-OLD] 기존 내 버전 보존
	public EmployeesDTO login(EmployeesDTO employeesDTO) throws Exception {
		String sql = """
				SELECT FIRST_NAME, LAST_NAME, HIRE_DATE, SALARY, DEPARTMENT_ID
				FROM EMPLOYEES
				WHERE EMPLOYEE_ID = ?
				""";

		try (Connection con = connection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setInt(1, employeesDTO.getEmployeeId());

			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {
					EmployeesDTO result = new EmployeesDTO();
					result.setEmployeeId(employeesDTO.getEmployeeId());
					result.setFirstName(rs.getString("FIRST_NAME"));
					result.setLastName(rs.getString("LAST_NAME"));
					result.setHireDate(rs.getDate("HIRE_DATE"));
					result.setSalary(rs.getDouble("SALARY"));
					result.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
					return result;
				}
			}
		}

		return null;
	}
	*/
}
