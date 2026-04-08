package com.joe.app.departments;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dept/update")
public class DepartmentUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DepartmentUpdateController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("departmentId");
		int departmentId = Integer.parseInt(id);

		DepartmentDAO dao = new DepartmentDAO();

		try {
			DepartmentDTO departmentDTO = dao.detail(departmentId);
			request.setAttribute("dto", departmentDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dept/update.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DepartmentDTO departmentDTO = new DepartmentDTO();
		String id = request.getParameter("departmentId");
		String name = request.getParameter("departmentName");
		String managerId = request.getParameter("managerId");
		String locationId = request.getParameter("locationId");

		departmentDTO.setDepartmentId(Integer.parseInt(id));
		departmentDTO.setDepartmentName(name);
		departmentDTO.setManagerId(Integer.parseInt(managerId));
		departmentDTO.setLocationId(Integer.parseInt(locationId));

		DepartmentDAO departmentDAO = new DepartmentDAO();

		try {
			int result = departmentDAO.update(departmentDTO);
			if (result > 0) {
				response.sendRedirect("./list");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
