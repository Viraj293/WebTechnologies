package com.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServle")
public class LoginServle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public LoginServle() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	if (username.equals(password))
    	{
    		request.getRequestDispatcher("Welcome.html").forward(request, response);
    	}
    	else
    	{
    		response.sendRedirect("error.html");
    	}
    }
	
	}


