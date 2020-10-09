/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;


/**
 *
 * @author 832465
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
      
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //create the session
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        
        if(username == null || password == null || username.equals("") || password.equals("")) {
            request.setAttribute("message", "I'm sorry but you can't have empty cases");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            
        }
        
        
        
        if(username.equals("adam") || username.equals("betty") && password.equals("password") ) {
             session.setAttribute("username", username);
             session = request.getSession(false);
             if(session != null) {
             response.sendRedirect("home.jsp");
             } else {
                 
             }
        }
        
        else {
            request.setAttribute("message","Invalid Login");
            response.sendRedirect("login.jsp");
            
        }
        
        
       
        
      
        
        
         
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
     getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
     
     
    }

   


}
