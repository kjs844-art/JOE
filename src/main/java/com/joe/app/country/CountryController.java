package com.joe.app.country;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/country/create", "/country/detail", "/country/list"})
public class CountryController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath();

		if ("/country/create".equals(path)) {
			request.getRequestDispatcher("/WEB-INF/views/country/create.jsp").forward(request, response);
			return;
		}

		if ("/country/detail".equals(path)) {
			CountryDTO country = new CountryDTO();
			country.setCountryId("KR");
			country.setCountryName("Korea");
			request.setAttribute("country", country);
			request.getRequestDispatcher("/WEB-INF/views/country/detail.jsp").forward(request, response);
			return;
		}

		List<CountryDTO> countries = new ArrayList<>();

		CountryDTO country1 = new CountryDTO();
		country1.setCountryId("KR");
		country1.setCountryName("Korea");
		countries.add(country1);

		CountryDTO country2 = new CountryDTO();
		country2.setCountryId("US");
		country2.setCountryName("United States");
		countries.add(country2);

		request.setAttribute("countries", countries);
		request.getRequestDispatcher("/WEB-INF/views/country/list.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		CountryDTO country = new CountryDTO();
		country.setCountryId(request.getParameter("countryId"));
		country.setCountryName(request.getParameter("countryName"));

		request.setAttribute("country", country);
		request.setAttribute("message", "country create request completed");
		request.getRequestDispatcher("/WEB-INF/views/country/create.jsp").forward(request, response);
	}
}
