/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Oops
 */
public class Login extends HttpServlet {

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
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
         String mt=request.getParameter("#MT");
            int email = Integer.parseInt(request.getParameter("username"));
            String pass = request.getParameter("password");    
            
            /* TODO output your page here. You may use following sample code. */
           
             //out.println("hello1");
          if(mt.equals("admin"))   
          {
              
              
              try (PrintWriter out = response.getWriter()) {
                  try {               //out.println("hello2");
                      
                      Class.forName("com.mysql.jdbc.Driver");
                  } catch (ClassNotFoundException ex) {
                      
                  }
                  //out.println("hello3");
                  Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecas", "root", "tiger");
                  Statement stmt = con.createStatement();
                  ResultSet rs = stmt.executeQuery("select uid,pass from admin where uid = '"+email+"' and  pass = '"+pass+"'");
                  
                  if(rs.next()){
                      //out.println("hello4");
                      //String uid = rs.getString("uid");
                      response.sendRedirect("http://localhost:8080/ExamCellAutomationSystem/studentdetails.jsp");
                      
                      //out.println("User id"+uid);
                      //HttpSession session=request.getSession();
                      //session.setAttribute("name",uid);
                  }else
                  {
                      response.sendRedirect("http://localhost:8080/ExamCellAutomationSystem/error.jsp");
                      //out.println("user not found");
                  }
                  
              }catch (SQLException ex) {
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                  
              }
          }
          else
          {
              try (PrintWriter out = response.getWriter()) {
                  try {
                      //out.println("hello2");
                      Class.forName("com.mysql.jdbc.Driver");
                  } catch (ClassNotFoundException ex) {
                      
                  }
                  //out.println("hello3");
                  Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecas", "root", "tiger");
                  Statement stmt = con.createStatement();
                  ResultSet rs = stmt.executeQuery("select uid,pass from student where uid = '"+email+"' and  pass = '"+pass+"'");
                  
                  if(rs.next()){
                      //out.println("hello4");
                      //String uid = rs.getString("uid");
                      response.sendRedirect("http://localhost:8080/ExamCellAutomationSystem/register.jsp");
                      
                      //out.println("User id"+uid);
                      //HttpSession session=request.getSession();
                      //session.setAttribute("name",uid);
                  }else
                  {
                      response.sendRedirect("http://localhost:8080/ExamCellAutomationSystem/error.jsp");
                      //out.println("user not found");
                  }
                  
              }catch (SQLException ex) {
                  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                  
              }
          }
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
