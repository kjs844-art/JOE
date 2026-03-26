package com.joe.app.test.departments;

import com.joe.app.departments.DepartmentDAO;
import com.joe.app.departments.DepartmentDTO;

public class DepartmentTest {

	public static void main(String[] args) {
		DepartmentDAO dao = new DepartmentDAO();

		try {
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartmentName("class3");
			departmentDTO.setManagerId(100);
			departmentDTO.setLocationId(1700);

			int result = dao.create(departmentDTO);
			System.out.println("insert result : " + result);
			dao.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
