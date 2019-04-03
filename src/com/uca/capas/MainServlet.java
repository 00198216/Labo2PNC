package com.uca.capas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String User = request.getParameter("User");
		String Pass = request.getParameter("Pass");
		PrintWriter out = response.getWriter();
		
		if(User.equals("Sebastian") && Pass.equals("Pass")) {
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>"+"Inicio de seccion valido! El Usuario fue: "+User+" y la Password fue: "+Pass+"</h3>");
			out.println("</body>");
			out.println("</html>");
		}
		else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h3>"+"Inicio de seccion invalido"+"</h3>");
			out.println("</body>");
			out.println("</html>");
		}
		
	}
	}


