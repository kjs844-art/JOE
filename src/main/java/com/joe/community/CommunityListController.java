package com.joe.community;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 목록 Controller
 * GET /community/list → DB 전체 목록을 조회해서 list.jsp 에 넘긴다.
 */
@WebServlet("/community/list")
public class CommunityListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CommunityDAO dao = new CommunityDAO();

		try {
			ArrayList<Community> list = dao.list();
			request.setAttribute("list", list);  // JSP에서 ${list} 로 꺼낸다
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("message", "목록을 불러오지 못했습니다.");
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/community/list.jsp");
		view.forward(request, response);
	}
}
