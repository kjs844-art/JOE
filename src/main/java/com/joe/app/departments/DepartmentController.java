package com.joe.app.departments;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dept/list")
public class DepartmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DepartmentDAO departmentDAO = new DepartmentDAO();

		try {
			ArrayList<DepartmentDTO> ar = departmentDAO.list();
			request.setAttribute("list", ar);
		} catch (Exception e) {
			request.setAttribute("message", "부서 목록 조회 실패");
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dept/list.jsp");
		view.forward(request, response);
	}
}
