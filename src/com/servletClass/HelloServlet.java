/**
 * 
 */
/**
 * @author rohit
 *
 */
package com.servletClass;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{
	int b;
	
	@Override
	public void destroy(){
		System.out.println("Servlet destroyed");
	}
	@Override
	 public ServletConfig getServletConfig(){
		return null;

	}
	@Override
	public String getServletInfo(){
		return null;
	}
	@Override
	public void init(ServletConfig arg0) throws ServletException{
		
	}
	@Override
	public void service(ServletRequest request, ServletResponse response)
		throws ServletException, IOException{
		
		String a= "1";
		response.setContentType("test/html");
		printWriter out = response.getWriter();
		String headerString = "<HTML><HEAD><TITLE>Servlet world</TITLE></HEAD>";
		out.println(headerString+"<BODY BGCOLOR=\"#FDFSE6\">\n <H1>Hello World! Welcome to Servlets!!!</H1></BODY></HTML>";
	}
	
}