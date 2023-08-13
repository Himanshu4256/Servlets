/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2><b><u>Welcome to Register Servlet</u></b></h2>");
        
        
        // yha se data le rahe hai
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");
        
        String cond = request.getParameter("condition");
        out.println(cond);
        
        if(cond!=null)
        {
        if(cond.equals("checked")) //checked is the value of checkbox 
        {
            // yha data ko print kra rahe hai
            out.println("<h2> Name : " + name + "<h2>");
            out.println("<h2> Password : " + password + "<h2>");
            out.println("<h2> Email : " + email + "<h2>");
            out.println("<h2> Gender : " + gender + "<h2>");
            out.println("<h2> Course : " + course + "<h2>");
            
            
            
            // We r going to forward request to another(Success_Servlet) servlet.
            // yha cond True hone pr hmne forward kiya hai dusre serlet pr jisne ek msg show kraya hai. 
            RequestDispatcher rd = request.getRequestDispatcher("success");
            rd.forward(request, response);

        }
        else{
            out.println("<h2>You have not accepted terms and conditions</h2>");
        }
        }
        else{
            out.println("<h2>You have not accepted terms and conditions accept again</h2>");
            
            //Here I want to include output of index.html
            
            //get the object of RequestDispatcher
            RequestDispatcher rd = request.getRequestDispatcher("index.html"); // yha "request.getRequestDispatcher" mai request ek object bna hua hai internally jo "getRequestDispatcher" ko call kr rha hai
            
            // perform include
            // yha agr cond false hai to hmne ek file ko include kiya hai use show krane k liye 
            rd.include(request, response);
            
        }
    }
    
}
