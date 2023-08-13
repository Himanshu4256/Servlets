/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

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
 * Servlet implementation class Second Servlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String txtFieldB = request.getParameter("textFieldB");
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		session.setAttribute("textFieldB", txtFieldB);
		
		PrintWriter out = response.getWriter();
		out.print("<form action=\"FinalServlet\">\r\n"
				+ "		Enter C: <input type=\"text\" name=\"textFieldC\" /></br>\r\n"
				+ "		<input type=\"submit\">\r\n"
				+ "	</form>");
		
	}



}