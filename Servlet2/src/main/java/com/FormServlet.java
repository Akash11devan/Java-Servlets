package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FormServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String res1=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		//int pass=Integer.parseInt(res3);
		String phonenumber=req.getParameter("phone");
		//double ph=Double.parseDouble(res4);
		

		//load the driver
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","root");
		
		PreparedStatement p = c.prepareStatement("insert into user values(?,?,?,?)");	
		
		p.setString(1, res1);
		p.setString(2, email);
		p.setString(3, password);
		p.setString(4,phonenumber);
		
		p.executeUpdate();
		
		PrintWriter out=res.getWriter();
		out.print("Data Stored");
		
		}

		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

		
		
		
		
	}


