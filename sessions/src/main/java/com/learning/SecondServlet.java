package com.learning;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");

		String txtFieldA = request.getParameter("textFieldA");
		String txtFieldB = request.getParameter("textFieldB");
		String txtFieldC = request.getParameter("textFieldC");
		String txtFieldD = request.getParameter("textFieldD");
		
		PrintWriter out = response.getWriter();

		String res = "<form action=\"FinalServlet\">"
				+ "		<input type=\"hidden\" name=\"textFieldA\" />"
				+ "		<input type=\"hidden\" name=\"textFieldB\" />"
				+ "		<input type=\"hidden\" name=\"textFieldC\" />"
				+ "		<input type=\"hidden\" name=\"textFieldD\" />"
				+ "		Enter E: <input type=\"text\" name=\"textFieldE\" /></br>"
				+ "		Enter F: <input type=\"text\" name=\"textFieldF\" /></br>"
				+ "		<input type=\"submit\">"
				+ "	</form>";
		
		out.print(String.format(res,txtFieldA, txtFieldB,txtFieldC, txtFieldD));
		
	}



}
