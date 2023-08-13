/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyHttpServlet extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException,IOException  // es method se ham request bhenjenge
    {
        System.out.println("this is get method....");
        resp.setContentType("text/html");
        
        PrintWriter out = resp.getWriter();
        out.println("<h1>this is get method of my servlet </h1>");
    }

    
    
    // if you want to work with post mth then use this
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    }
    
    
}
