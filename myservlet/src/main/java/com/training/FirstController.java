package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstController extends HttpServlet {
	
//	private static final long serialVersionUID = 1L;
//	public FirstController() {
//		super();
////		// TODO Auto-generated method stub
//
//	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if(name.equals(pass)) {
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("/login.html");
		}
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		doGet(request, response);
	}
	

}
