package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AddServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 String res1= req.getParameter("num1");
		 String res2=req.getParameter("num2");
		 
		 int a=Integer.parseInt(res1);
		 int b=Integer.parseInt(res2);
		 
		 
		 int result=a+b;
		 
		 PrintWriter out=res.getWriter();
		 out.print(result);
		
	}

}
