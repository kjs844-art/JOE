package com.joe.app.departments;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dept/create")
public class Departmentcreatecontroler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Departmentcreatecontroler() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dept/create.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("departmentName");
		String m = request.getParameter("managerId");
		String l = request.getParameter("locationId");

		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartmentName(name);
		departmentDTO.setManagerId(Integer.parseInt(m));
		departmentDTO.setLocationId(Integer.parseInt(l));
		
		DepartmentDAO departmentDAO = new DepartmentDAO();
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dept/create.jsp");
		
		try {
			int result = departmentDAO.create(departmentDTO);
			if(result > 0)  {
				response.sendRedirect("/dept/list");
				
			}else {
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		doGet(request, response);
	}
}
