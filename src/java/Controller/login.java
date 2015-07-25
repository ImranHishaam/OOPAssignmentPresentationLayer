/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOImplementation.LoginImplementation;
import Models.UserModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONObject;

/**
 *
 * @author Imran
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
         response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String email=request.getParameter("inputEmail");    
        String password=request.getParameter("inputPassword");   
        String remember = request.getParameter("remember");
        
        System.out.println("remember ne mnow " + email);
  
        LoginImplementation loginCheckObject = new LoginImplementation();
       
        JSONObject userData = (loginCheckObject.loginNow(email, password, remember));
        System.out.println(userData);
        if(userData.has("error")){
            RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
            request.setAttribute("loginError", "error");
            rd.include(request,response);
            
        }else{  
            
            if ("yes".equals(remember)) {
                System.out.println("apples");
                HttpSession session = request.getSession();
                session.setAttribute("user", userData);
                //setting session to expiry in 30 mins
                session.setMaxInactiveInterval(30 * 60);
                Cookie userName = new Cookie("user", email);
                userName.setMaxAge(30 * 60);
                response.addCookie(userName);
            }
            request.setAttribute("userData", userData);
            RequestDispatcher rd=request.getRequestDispatcher("views/home.jsp");
            rd.forward(request,response);
            return;
        }
        
        out.close();    
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}