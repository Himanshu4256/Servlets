package com.learning;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String txtFieldA = request.getParameter("textFieldA");
		String txtFieldB = request.getParameter("textFieldB");

		
		PrintWriter out = response.getWriter();
		String res = "<form action=\"SecondServlet\">"
				+ "		<input type=\"hidden\" name=\"textFieldA\" /></br>"
				+ "		<input type=\"hidden\" name=\"textFieldB\" /></br>"
				+ "		Enter C: <input type=\"text\" name=\"textFieldC\" /></br>"
				+ "		Enter D: <input type=\"text\" name=\"textFieldD\" /></br>"
				+ "		<input type=\"submit\">"
				
				+ "	</form>";
		
		out.print(String.format(res,txtFieldA, txtFieldB));
		
	}



}

