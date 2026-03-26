package com.joe.app.countries;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/country/detail")
// 브라우저에서 /country/detail?countryId=US 같은 요청을 처리한다.
public class CountryDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 서블릿 직렬화 버전값이다.

	@Override
	// 상세 페이지도 보통 GET 방식으로 조회한다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String countryId = request.getParameter("countryId");
		// URL에서 전달된 국가 코드를 꺼낸다.

		CountryDAO countryDAO = new CountryDAO();
		// DB에서 국가 1건을 조회할 DAO 객체를 만든다.

		try {
			CountryDTO country = countryDAO.detailCountry(countryId);
			// 전달받은 countryId 기준으로 COUNTRIES 테이블 1건을 조회한다.

			request.setAttribute("country", country);
			// JSP에서 ${country} 로 데이터를 출력할 수 있게 request에 담는다.
		} catch (Exception e) {
			request.setAttribute("message", "국가 상세 조회 중 오류 발생");
			// 오류가 나면 JSP에서 볼 수 있게 메시지를 담는다.
			e.printStackTrace();
			// 콘솔 로그로도 원인을 확인할 수 있게 남긴다.
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/country/detail.jsp");
		// 상세 내용을 보여줄 JSP 경로를 잡는다.
		view.forward(request, response);
		// request에 담긴 country 데이터를 detail.jsp로 넘긴다.
	}
}
