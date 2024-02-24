package com.xworkz.productbooking.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/submit")

public class ProductServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("thsi is servlet service method");
		
		String productname=req.getParameter("productName");
		System.out.println("enter name:"+productname);
		
		int quantity=Integer.parseInt(req.getParameter("quantity"));
		System.out.println("enter the quantity:"+quantity);
		
		int price=Integer.parseInt(req.getParameter("price"));
				System.out.println("enter the price:"+price);
				
				  double pay=0;
				   if(quantity==10) {
					   double discount=quantity*0.05;
					    pay=price*10-discount;
					   
				   }else {
					 pay=price* quantity;
					 
				   }
				   System.out.println(pay);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("success.jsp");
		  req.setAttribute("price", pay);
		dispatcher.forward(req, res);		
		
	}

}
