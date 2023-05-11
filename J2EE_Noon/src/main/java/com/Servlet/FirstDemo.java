package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstDemo")
public class FirstDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

       public FirstDemo() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
		response.setContentType("text/html");//encoding
		 PrintWriter out = response.getWriter(); 
		 out.print("<h1>helloo Shubham@@@@");
		 out.print("<br>helloo VIRAAJ....");
		 out.print("<br>helloo VAISHALI...");

		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
