package com.joe.app.departments;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Departmentupdatecontroller
 */
@WebServlet("/dept/update")
public class Departmentupdatecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Departmentupdatecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("departmentId");
		int n = Integer.parseInt(id);
		
		DepartmentDAO dao = new DepartmentDAO();
		
		try {
			DepartmentDTO departmentDTO = dao.detail(n);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dept/update");
		// /country/create 로 들어오면 create.jsp 화면을 보여 주겠다는 뜻이다.
		view.forward(request, response);
		// 브라우저에 나라 등록 화면을 출력한다.
		
		
		//forward - jsp형식 //redirect 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
