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
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        
        
    }  
        
        
        
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        
       
        if(username == null || username.equals("") || password.equals("") || password == null) {
            
            request.setAttribute("message", "Invalid Login you can't have empty cases");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
            
        }
        
        else if(username.equals("adam") || username.equals("betty") && password.equals("password")) {
             HttpSession session = request.getSession();
             request.setAttribute("username", username);
             request.getRequestDispatcher("/WEB-INF/home.login");
             
          }
    }
    
    
    
    } 
    
    
     
   

   



