package com.bitwise.servletAssignment1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestedUser
 */
//@WebServlet("/RequestedUser")
public class RequestedUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestedUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out=response.getWriter();
		out.println("<html>");
		UserInformation user=(UserInformation) request.getAttribute("userInfo");
		out.println("<head><center><h2>User Profile is::</h2>");
		out.println("<body><h3><table>");
		out.println("<tr><td>First Name : </td><td>"+user.getFirstName()+"</td></tr>");
		out.println("<tr><td>Last Name : </td><td>"+user.getLastName()+"</td></tr>");
		out.println("<tr><td>Address : </td><td>"+user.getAddress()+"</td></tr>");
		out.println("<tr><td>Age : </td><td>"+user.getAge()+"</td></tr>");
		out.println("<tr><td>Contact Number : </td><td>"+user.getContactNumber()+"</td></tr>");
		out.println("<tr><td>Email Id : </td><td>"+user.getEmail()+"</td></tr>");
		out.println("</h3></table></center>");
		out.println("</body></html>");
		request.getRequestDispatcher("logout.jsp").include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
