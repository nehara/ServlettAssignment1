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
 * Servlet implementation class SaveProfileData
 */
//@WebServlet("/SaveProfileData")
public class SaveProfileData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveProfileData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		PrintWriter out=response.getWriter();
		
		UserInformation user=new UserInformation();
		if(session!=null)
		{
			String firstName=request.getParameter("firstname");
			String lastName=request.getParameter("lastname");
			String address=request.getParameter("address");
			int age=Integer.parseInt(request.getParameter("age"));
			long phoneNo=Long.parseLong(request.getParameter("phoneNo"));
			String emailId=request.getParameter("email");
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setAddress(address);
			user.setAge(age);
			user.setContactNumber(phoneNo);
			user.setEmail(emailId);
			request.setAttribute("userInfo", user);
			request.getRequestDispatcher("RequestedUser").forward(request, response);
		}
		else
		{
			out.println("login first");
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
