package com.xworkz.ticketbooking.runner;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns="/submit")

public class TrainServlet implements Servlet {

	
	public TrainServlet() {
		System.out.println("this is servlet constructor");
	}
	
	@Override
	public String getServletInfo() {
	System.out.println("this is get servlet method");
		return null;
	}

	@Override
	public void init(ServletConfig arg0)  {
		System.out.println("this is init method");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) {
		System.out.println("this is service method");
		System.out.println("requset:"+req.getParameter("userName"));
		
		
	}
	@Override
	public void destroy() {
		System.out.println("this is destroy method");
		
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

}
