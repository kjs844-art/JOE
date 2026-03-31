package com.joe.app.employees;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.joe.app.util.DBConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employees")
public class EmployeeController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (Connection con = new DBConnection().getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM EMPLOYEES")) {
			if (rs.next()) {
				request.setAttribute("employeeCount", rs.getInt(1));
			}
			request.setAttribute("dbStatus", "DB 연결 성공");
		} catch (Exception e) {
			request.setAttribute("dbStatus", "DB 연결 실패: " + e.getMessage());
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/jsp/employees.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
