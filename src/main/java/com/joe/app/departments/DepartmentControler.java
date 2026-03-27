package com.joe.app.departments;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DepartmentControler
 */
@WebServlet("/dept/delete")
public class DepartmentControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentControler() {
        super();
        // TODO Auto-generated constructor stub
        String id = request.getParameter("departmentId");
        //request에서 꺼내면 String타입명
        DepartmentDTO departmentDTO = new DepartmentDTO();
        departmentDTO setDepartmentId(Interger.parseInt(id));
        DepartmentDAO departmentDAO = new DepartmentDAO();
        departmentDAO.delete(null);
        try {
        	int result = departmentDAO.delete(departmentDTO);
        	
        	if(result>0) {
        		response.sendRedirect("/dept/list");
        		
        	}else { 
        		response.sendRedirect("detail?departmentId="id);      // ./ 로 사용 또는 사용 안해도 됨 /로 시작하면 절대경로 ./또는 아무것도 없으면 상대경로
        	}
        }
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
