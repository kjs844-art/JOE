package com.joe.app.employees;

/* [CODEX-OLD] 기존 내 컨트롤러 버전 보존

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employees/login")
public class EmployeeLogin extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/jsp/emplyeeLogin.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String id = request.getParameter("employeeId");
			String pw = request.getParameter("password");

			// 수업 초반 테스트용 출력은 남겨두고 주석 처리
			// int i = Integer.parseInt(id);
			// System.out.println(i);
			// System.out.println(pw);

			EmployeesDTO employeeDTO = new EmployeesDTO();
			EmployeeDAO employeeDAO = new EmployeeDAO();

			try {
				employeeDTO.setEmployeeId(Integer.parseInt(id));

				// 현재 HR EMPLOYEES 테이블에는 password 컬럼이 없어서
				// 수업 흐름에 맞게 employeeId 기준 조회만 먼저 연결
				employeeDTO = employeeDAO.login(employeeDTO);

				if (employeeDTO != null) {
					System.out.println("ok");
				} else {
					System.out.println("fail");
				}

				request.setAttribute("dto", employeeDTO);
				request.setAttribute("password", pw);
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("dto", null);
				request.setAttribute("loginError", e.getMessage());
			}

			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			view.forward(request, response);
	}
}

*/
