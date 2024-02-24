package com.xworkz.partyhallbooking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/save")
public class BookingServlet extends GenericServlet {

	 
	public BookingServlet() {
		System.out.println("servlet constructor");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		System.out.println("this is service method");
		String username=req.getParameter("username");
		System.out.println("enter name:"+username);
		
		String email=req.getParameter("email");
		System.out.println("enter email:"+email);
		
		String contact=req.getParameter("contact");
		System.out.println("enter contact:"+contact);
		
		String alter=req.getParameter("alternateConact");
		System.out.println("enter alternat contact:"+alter);
		
		String time=req.getParameter("time");
		System.out.println("enter time:"+time);
		
		String amount=req.getParameter("amount");
		System.out.println("enter amount:"+amount);
		
		String place=req.getParameter("place");
		System.out.println("enter place name:"+place);
		
		String people=req.getParameter("noofpeople");
		System.out.println("enter no of peole:"+people);
		
	 req.getContentType();
	 res.setContentType("html");
	 PrintWriter printWriter=res.getWriter();
	 printWriter.print("<h1 align="+"center"+">"+"Thanks for Booking"+"</h1>");
	 printWriter.print("<h2 align=\"center\">"+username);
	 printWriter.print("<br>"+email);
	 printWriter.print("<br>"+contact);
	 printWriter.print("<br>"+alter);
	 printWriter.print("<br>"+time);
	 printWriter.print("<br>"+amount);
	 printWriter.print("<br>"+place);
	 printWriter.print("<br>"+people);
	 
	 printWriter.close();
		
		
	}

}
