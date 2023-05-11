package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {
	ServletContext context = null;
	private static final long serialVersionUID = 1L;
       
   
    public ServletContextDemo() 
    {
        
    }
   @Override
public void init(ServletConfig config) throws ServletException 
 {
   context = config.getServletContext();	

}
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		// TODO Auto-generated method stub
    {
	 response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user = context.getInitParameter("user");
		String pass = context.getInitParameter("pass");
		out.println("<h>Context User is ..."+user);
		out.println("<h>Context Pass is ..."+pass);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		// TODO Auto-generated method stub
	{
		
	}
	}


