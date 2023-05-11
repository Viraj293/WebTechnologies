package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	ServletConfig Congif = null;
	private static final long serialVersionUID = 1L;
       
        public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
        public void init(ServletConfig config) throws ServletException 
        {
        	   this.Congif = config ;
        }
    		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    		// TODO Auto-generated method stub
    	{
    			response.setContentType("text/html");
    			PrintWriter out=response.getWriter();
    			String username = Congif.getInitParameter("username");
    			String password = Congif.getInitParameter("password");
    			out.println("<h>Username is ..."+username);
    			out.println("<h>Password is ..."+password);
    			}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		// TODO Auto-generated method stub
	{
		
	}
	
	
	}

