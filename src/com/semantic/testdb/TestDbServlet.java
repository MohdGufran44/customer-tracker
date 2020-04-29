package com.semantic.testdb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		// get connection to database
		try {
					
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_customer_tracker","semanticbitsintern","semanticbitsintern");
				
					
			res.getWriter().println("SUCCESS!!!");
					
			myConn.close();
					
		}
		catch (Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
		}
	}

}
