package com.xworkz.sportsmanagementsystem.runner;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet; 

@WebServlet(urlPatterns="/devil")
public class SportsServlet implements Servlet{
	
	public SportsServlet() {
		System.out.println("this is sports servlet constructor");
	}

	@Override
	public void destroy() {
		System.out.println("servlet destory method");
	}
	
	@Override
	public void init(ServletConfig arg0) {
		System.out.println("servlet init method");
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp)  {
		System.out.println("servlet service method");
		System.out.println("Request is:"+req.getParameter("username"));
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
