package com.codegnanServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userData")
public class UserDataServlet extends HttpServlet  {
	
	public void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2> user Submitted data </h2>");
		out.println("<p> Name: " +name +"</p>");
		out.println("<p> email: "+email+"</p>");
		out.println("<body></html>");
		
		
		
	   
	}

}
