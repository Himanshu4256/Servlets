package com.learning;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/FinalServlet")
public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String txtFieldA = request.getParameter("textFieldA");
		String txtFieldB = request.getParameter("textFieldB");
		String txtFieldC = request.getParameter("textFieldC");
		String txtFieldD = request.getParameter("textFieldD");
		String txtFieldE = request.getParameter("textFieldE");
		String txtFieldF = request.getParameter("textFieldF");
		
		
		out.print("A: " + txtFieldA + "</br>");
		out.print("B: " + txtFieldB + "</br>");
		out.print("C: " + txtFieldC + "</br>");
		out.print("D: " + txtFieldD + "</br>");
		out.print("E: " + txtFieldE + "</br>");
		out.print("F: " + txtFieldF + "</br>");
	}
}
