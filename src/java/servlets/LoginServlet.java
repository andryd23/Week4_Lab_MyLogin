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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(username.equals("adam") || username.equals("betty") && password.equals("password") ) {
             HttpSession session = request.getSession();
             session.setAttribute("username", username);
             getServletContext().getRequestDispatcher("home.jsp").forward(request, response);
        }
        
        else {
            request.setAttribute("message","I'm sorry but, you inputed the wrong credentials");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            
        }
        
         
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

   
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    

}
