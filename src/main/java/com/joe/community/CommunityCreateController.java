package com.joe.community;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
 * 등록 Controller
 * GET  /community/create → create.jsp 를 보여준다 (빈 폼)
 * POST /community/create → 입력값을 DB에 저장하고 목록으로 이동한다
 */
@WebServlet("/community/create")
public class CommunityCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 등록 폼 화면 열기
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/community/create.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 저장 흐름
		 * 1. create.jsp 의 form 이 값을 POST 로 보낸다.
		 * 2. 파라미터에서 꺼내서 DTO 에 담는다.
		 * 3. DAO.create() 로 DB에 INSERT 한다.
		 * 4. 성공하면 목록으로 redirect 한다.
		 */
		request.setCharacterEncoding("UTF-8");

		Community dto = new Community();
		dto.setTitle(request.getParameter("title"));
		dto.setName(request.getParameter("name"));
		dto.setContents(request.getParameter("contents"));

		String star = request.getParameter("star");
		if (star != null && !star.isBlank()) {
			dto.setStar(Integer.parseInt(star));
		}

		CommunityDAO dao = new CommunityDAO();

		try {
			dao.create(dto);
			response.sendRedirect(request.getContextPath() + "/community/list");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("message", "등록 중 오류가 발생했습니다.");
			request.getRequestDispatcher("/WEB-INF/views/community/create.jsp").forward(request, response);
		}
	}
}
