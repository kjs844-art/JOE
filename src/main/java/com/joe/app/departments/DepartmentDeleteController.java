package com.joe.app.departments;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dept/delete")
public class DepartmentDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DepartmentDeleteController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("departmentId");
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartmentId(Integer.parseInt(id));

		DepartmentDAO departmentDAO = new DepartmentDAO();
		try {
			int result = departmentDAO.delete(departmentDTO);
			if (result > 0) {
				response.sendRedirect("./list");
			} else {
				response.sendRedirect("detail?departmentId=" + id);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
