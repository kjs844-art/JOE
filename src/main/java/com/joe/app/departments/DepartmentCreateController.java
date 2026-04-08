package com.joe.app.departments;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dept/create")
public class DepartmentCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DepartmentCreateController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dept/create.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("departmentName");
		String managerId = request.getParameter("managerId");
		String locationId = request.getParameter("locationId");

		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartmentName(name);
		departmentDTO.setManagerId(Integer.parseInt(managerId));
		departmentDTO.setLocationId(Integer.parseInt(locationId));

		DepartmentDAO departmentDAO = new DepartmentDAO();
		try {
			int result = departmentDAO.create(departmentDTO);
			if (result > 0) {
				response.sendRedirect("/dept/list");
			} else {
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dept/list.jsp");
				view.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
