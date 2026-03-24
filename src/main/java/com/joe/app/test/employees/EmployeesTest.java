package com.joe.app.test.employees;

import com.joe.app.employees.EmployeesDAO;

public class EmployeesTest {

	public static void main(String[] args) {
		EmployeesDAO dao = new EmployeesDAO();

		try {
			dao.detailByDepartment(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
