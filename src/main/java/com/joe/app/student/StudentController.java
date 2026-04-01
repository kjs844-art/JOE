package com.joe.app.student;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student/add")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/student/add.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(request.getParameter("name"));
		studentDTO.setKor(parseInt(request.getParameter("kor")));
		studentDTO.setEng(parseInt(request.getParameter("eng")));
		studentDTO.setMath(parseInt(request.getParameter("math")));

		request.setAttribute("student", studentDTO);
		request.setAttribute("message", "student add completed");
		request.getRequestDispatcher("/WEB-INF/views/student/add.jsp").forward(request, response);
	}

	private int parseInt(String value) {
		if (value == null || value.isBlank()) {
			return 0;
		}
		return Integer.parseInt(value);
	}
}
