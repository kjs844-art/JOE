package com.joe.app.test.util;

import com.joe.app.departments.DepartmentDAO;

public class DBConnectionTest {

	public static void main(String[] args) {
		DepartmentDAO departmentDAO = new DepartmentDAO();

		try {
			departmentDAO.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
