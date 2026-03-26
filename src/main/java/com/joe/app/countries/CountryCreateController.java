package com.joe.app.countries;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/country/create")
public class CountryCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/country/create.jsp");
		// /country/create 로 들어오면 create.jsp 화면을 보여 주겠다는 뜻이다.
		view.forward(request, response);
		// 브라우저에 나라 등록 화면을 출력한다.
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// 한글 입력이 깨지지 않게 인코딩을 맞춘다.

		CountryDTO countryDTO = new CountryDTO();
		// 브라우저에서 입력한 값을 담을 DTO를 만든다.
		countryDTO.setCountryId(request.getParameter("countryId"));
		// create.jsp 의 countryId 입력값을 DTO에 저장한다.
		countryDTO.setCountryName(request.getParameter("countryName"));
		// create.jsp 의 countryName 입력값을 DTO에 저장한다.

		CountryDAO countryDAO = new CountryDAO();
		// 실제 DB 작업을 맡는 DAO를 만든다.

		try {
			int result = countryDAO.createCountry(countryDTO);
			// DAO의 INSERT 메서드를 호출해서 COUNTRIES 테이블에 저장한다.

			if (result > 0) {
				response.sendRedirect(request.getContextPath() + "/country/list");
				// 저장 성공이면 목록 화면으로 이동해서 결과를 확인하게 한다.
				return;
			}

			request.setAttribute("message", "나라 등록 실패");
			// result가 0이면 실패 메시지를 화면에 보낸다.
		} catch (Exception e) {
			request.setAttribute("message", "나라 등록 중 오류 발생");
			// 예외가 나면 오류 메시지를 화면에 보낸다.
			e.printStackTrace();
			// 콘솔에서 원인을 확인할 수 있게 로그를 남긴다.
		}

		doGet(request, response);
		// 실패했을 때는 다시 create.jsp 화면으로 돌아간다.
	}
}
