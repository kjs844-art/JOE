package com.joe.app.departments;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dept/detail")
public class DepartmentDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DepartmentDetailController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DepartmentDAO departmentDAO = new DepartmentDAO();
		String id = request.getParameter("departmentId");
		int departmentId = Integer.parseInt(id);

		try {
			DepartmentDTO departmentDTO = departmentDAO.detail(departmentId);
			request.setAttribute("dto", departmentDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dept/detail.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
