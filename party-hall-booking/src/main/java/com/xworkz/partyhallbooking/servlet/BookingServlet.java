package com.xworkz.partyhallbooking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/submit")

public class BookingServlet extends GenericServlet {

	 
	public BookingServlet() {
		System.out.println("servlet constructor");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		System.out.println("this is service method");
		String name=req.getParameter("username");
		System.out.println("enter name:"+name);
		
		String name1=req.getParameter("email");
		System.out.println("enter email:"+name1);
		
		String name3=req.getParameter("contact");
		System.out.println("enter contact:"+name3);
		
		String name4=req.getParameter("alternateConact");
		System.out.println("enter alternat contact:"+name4);
		
		String name5=req.getParameter("time");
		System.out.println("enter time:"+name5);
		
		String name6=req.getParameter("amount");
		System.out.println("enter time:"+name6);
		
		String name7=req.getParameter("place");
		System.out.println("enter time:"+name7);
		
		String name8=req.getParameter("noofpeople");
		System.out.println("enter time:"+name8);
		
	 req.getContentType();
	 res.setContentType("html");
	 PrintWriter printWriter=res.getWriter();
	 printWriter.print("<h1>"+"Thanks for Booking"+"</h1>");
	 printWriter.close();
		
		
	}

}
