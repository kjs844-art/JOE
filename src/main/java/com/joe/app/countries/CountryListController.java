package com.joe.app.countries;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/country/list")
// 브라우저에서 /country/list 로 들어오면 이 컨트롤러가 요청을 받는다.
public class CountryListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 서블릿 직렬화 버전값이다.

	@Override
	// GET 방식으로 목록 페이지를 요청했을 때 실행된다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CountryDAO countryDAO = new CountryDAO();
		// DB에서 국가 목록을 조회할 DAO 객체를 만든다.

		try {
			ArrayList<CountryDTO> countries = countryDAO.listCountry();
			// COUNTRIES 테이블 전체 목록을 DTO 리스트로 조회한다.

			request.setAttribute("countries", countries);
			// JSP에서 ${countries} 로 꺼내 쓸 수 있게 request에 담는다.
		} catch (Exception e) {
			request.setAttribute("message", "국가 목록 조회 중 오류 발생");
			// DB 조회 실패 시 JSP에서 확인할 메시지를 담는다.
			e.printStackTrace();
			// 콘솔에서 원인을 볼 수 있게 예외 로그를 남긴다.
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/country/list.jsp");
		// 목록을 출력할 JSP 경로를 잡는다.
		view.forward(request, response);
		// request에 담은 countries 데이터를 list.jsp로 넘겨서 화면을 만든다.
	}
}
