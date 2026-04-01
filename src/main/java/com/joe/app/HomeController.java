package com.joe.app;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 홈 화면을 보여주는 서블릿
@WebServlet({"/", "/home"})
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	// GET 방식으로 / 또는 /home 에 접속했을 때 실행
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 홈 화면 JSP를 찾음
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");

		// home.jsp 로 이동
		view.forward(request, response);
	}
}
