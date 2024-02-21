package com.xworkz.mockmanagementsystem.runner;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/devil")
public class RegisterServlet implements Servlet {

	
	public RegisterServlet() {
		System.out.println("this is servlet constructor");
	}
	
	@Override
	public void init(ServletConfig arg0) {
		System.out.println("this is servlet init method");
		
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp)  {
		System.out.println("this is servlet service method");
		System.out.println("requset:"+req);
		System.out.println("Response:"+resp);
		System.out.println("Request:"+req.getParameter("username"));
		
	}

	@Override
	public void destroy() {
		System.out.println("this is destory method");
		
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
