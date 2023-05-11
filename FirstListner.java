package com.Servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class FirstListner implements ServletContextListener
      {

        public FirstListner() {
        // TODO Auto-generated constructor stub
    }


	    public void contextDestroyed(ServletContextEvent arg0) 
	{ 
	    	System.out.println("This is Servlet Listner Contex Destroyed");
    }

	
    public void contextInitialized(ServletContextEvent arg0) 
    { 
           	
    	System.out.println("This is Servlet Listner Context Initialized");
    }
	
}
