package com.bitwise.servletAssignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServletPage
 */
//@WebServlet("/LoginServletPage")
public class LoginServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		HttpSession session = request.getSession(false);
		String sessionId=session.getId();
		String userName = request.getParameter("name");
		session.setAttribute("user", userName);
		session.setMaxInactiveInterval(2*60);
		response.setContentType("text/html");
		
		if(session!= null)
		{
		
			out.println("Login Successful::");
			out.println("\nWelcome :"+userName);
			request.getRequestDispatcher("ProfilePage.jsp").include(request, response);
		}
		else
		{
			out.println("Login First");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
