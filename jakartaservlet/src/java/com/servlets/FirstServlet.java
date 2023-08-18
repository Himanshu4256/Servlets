/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

//@WebServlet(/first);
public class FirstServlet implements Servlet{
    //life cylce methods; -> enko server auto run krata hai
    
    ServletConfig conf;
    
    public void init(ServletConfig conf)
    {
        this.conf=conf;
        System.out.println("creating object:....");
    }
    public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
    {
        System.out.println("Servicing.........");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> this is the output from servlet method:</h1>");
        out.println("<h1>todays date and time is :"+new Date().toString()+"</h1>");
    } 
    
    public void destroy()
    {
        System.out.println("going to destroy servlet object");
    }
    
    //non Life cycle method -> Inko jb ham call kraenge tb Ham call krenge
    
    public ServletConfig getServletConfig(){
        return this.conf; // servletconfig ka object return krta hai
    }
    
    public String getServletInfo(){
        return "this servlet is created by Himanshu Sharma";
    }
    
}
