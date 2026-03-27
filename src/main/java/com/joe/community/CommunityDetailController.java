package com.joe.community;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 상세 Controller
 * GET /community/detail?no=1 → 글번호로 DB 1건 조회 후 detail.jsp 를 보여준다.
 */
@WebServlet("/community/detail")
public class CommunityDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String no = request.getParameter("no");

		// 글번호 없이 URL 직접 입력하면 목록으로 보낸다 (500 에러 방어)
		if (no == null || no.isBlank()) {
			response.sendRedirect(request.getContextPath() + "/community/list");
			return;
		}

		CommunityDAO dao = new CommunityDAO();

		try {
			Community dto = dao.detail(Integer.parseInt(no));
			request.setAttribute("dto", dto);  // JSP에서 ${dto.title} 등으로 꺼낸다
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("message", "상세정보를 불러오지 못했습니다.");
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/community/detail.jsp");
		view.forward(request, response);
	}
}
