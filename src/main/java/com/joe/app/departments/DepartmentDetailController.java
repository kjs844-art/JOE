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

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("departmentId");

		if (id == null || id.isBlank()) {
			response.sendRedirect(request.getContextPath() + "/dept/list");
			return;
		}

		DepartmentDAO departmentDAO = new DepartmentDAO();

		try {
			DepartmentDTO dto = departmentDAO.detail(Integer.parseInt(id));
			request.setAttribute("dto", dto);
		} catch (Exception e) {
			request.setAttribute("message", "부서 상세 조회 실패");
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dept/detail.jsp");
		view.forward(request, response);
	}
}
