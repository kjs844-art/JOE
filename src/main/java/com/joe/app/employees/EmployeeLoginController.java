package com.joe.app.employees;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class EmployeeLoginController
 */
@WebServlet("/emp/login")
public class EmployeeLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeLoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// [CODEX-ADD] 선생님 최신 코드 기준 login.jsp forward
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/emp/login.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("employeeId");
		String pw = request.getParameter("password");
		int i = Integer.parseInt(id);

		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmployeeId(i);
		employeeDTO.setPassword(pw);

		EmployeeDAO employeeDAO = new EmployeeDAO();
		try {
			employeeDTO = employeeDAO.login(employeeDTO);

			if(employeeDTO != null) {
				System.out.println("ok");
			}else {
				System.out.println("fail");
			}

			HttpSession session= request.getSession();
			session.setAttribute("dto", employeeDTO);

			// [CODEX-OLD] 이전 버전은 request에 담고 index.jsp로 forward
			// request.setAttribute("jsessionId", session.getId());
			// RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			// view.forward(request, response);

			// [CODEX-ADD] 선생님 최신 코드 기준 /home 으로 redirect
			response.sendRedirect("/home");

		} catch (Exception e) {
			// [CODEX-OLD] 이전 버전 예외 시 login.jsp로 forward
			// request.setAttribute("loginError", e.getMessage());
			// RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/emp/login.jsp");
			// view.forward(request, response);

			e.printStackTrace();
		}
	}
}
