package com.joe.app.member;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/memberJoin")
public class MemberJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberJoinServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/jsp/memberJoin.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		MemberDTO dto = new MemberDTO();
		dto.setUserId(userId);
		dto.setPassword(password);
		dto.setName(name);
		dto.setEmail(email);

		MemberDAO dao = new MemberDAO();
		int result = dao.insertMember(dto);

		if (result > 0) {
			response.sendRedirect(request.getContextPath() + "/");
		} else {
			response.sendRedirect(request.getContextPath() + "/memberJoin");
		}
	}
}

/*
설명
- /memberJoin 주소를 이 서블릿이 받는다.
- doGet()은 회원가입 JSP 화면을 보여준다.
- doPost()는 회원가입 폼 데이터를 받아 DTO에 담고 DAO를 호출한다.
- 저장 성공이면 홈(/)으로 이동하고 실패면 다시 회원가입 화면으로 이동한다.

수정 직전 코드 보관

package com.joe.app.member;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/memberJoin")
public class MemberJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MemberJoinServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/jsp/memberJoin.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		MemberDTO dto = new MemberDTO();
		dto.setUserId(userId);
		dto.setPassword(password);
		dto.setName(name);
		dto.setEmail(email);

		MemberDAO dao = new MemberDAO();
		int result = dao.insertMember(dto);

		if (result > 0) {
			response.sendRedirect(request.getContextPath() + "/");
		} else {
			response.sendRedirect(request.getContextPath() + "/memberJoin");
		}
	}
}
*/
