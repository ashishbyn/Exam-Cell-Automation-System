/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashu
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashu
 */
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
import java.io.*;
import java.sql.*;
import java.io.File;



/**
 *
 * @author Oops
 */
public class Studentdetail extends HttpServlet
{

   
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
        //FileInputStream fis;         
           String fname = request.getParameter("first");
            String lname = request.getParameter("last");
              String gend = request.getParameter("gender");
              String date=request.getParameter("date"); 
             //String myloc=request.getParameter("image");
                String email = request.getParameter("E-mail");
            String pass = request.getParameter("Password"); 
            String uni = request.getParameter("university"); 
            String clg = request.getParameter("college"); 
            String hall = request.getParameter("hall"); 
            String cname = request.getParameter("center"); 
            String cno = request.getParameter("cen"); 
            String sem=request.getParameter("sem");
             String b=request.getParameter("submit");
           
            
           
            
            /* TODO output your page here. You may use following sample code. */
           
            
          if(b!=null)
          {
              
                        
              
              try (PrintWriter out = response.getWriter())
              {
                  try 
                  {              
                      
                      Class.forName("com.mysql.jdbc.Driver");
                  } catch (ClassNotFoundException ex) 
                  {
                      
                  }
                  //File image=new File(myloc);
                  
                  Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecas", "root", "tiger");
                  Statement stmt =  con.createStatement();
                   stmt.executeUpdate("insert into stud(fname,lname,gender,dob,email,password,university,clgname,hallticketno,centername,centerno,sem)values('"+fname+"','"+lname+"','"+gend+"','"+date+"','"+email+"','"+pass+"','"+uni+"','"+clg+"','"+hall+"','"+cname+"','"+cno+"','"+sem+"')");
                  Statement stmt1 =  con.createStatement();
                  Statement st =  con.createStatement();                              
                  ResultSet rs = st.executeQuery("select id from stud where email='"+email+"'");
                  if(rs.next())
                  {
                      
                  
                      int s1=rs.getInt("id");
                      //request.setAttribute("id", s1);
                      
          
                 
                  stmt1.executeUpdate("insert into student(uid,pass)values('"+s1+"','"+pass+"')");
//PreparedStatement ps = con.prepareStatement("insert into register(fname, lname,img,gender,email,pass,date) values(?,?,?,?,?,?,?)");
                    //ps.setString(1, fname);
                   // ps.setString(2, lname);
                     //fis=new FileInputStream(image);
              //ps.setBinaryStream(3, (InputStream) fis, (int) (image.length()));
             // ps.setString(4, gend);              
                //ps.setString(5, email);
                    //ps.setString(6, pass);
               //ps.setString(7,date);
                
                   
               
             // int count=ps.executeUpdate(); 
             // if(count>0)
              //{
                 response.sendRedirect("http://localhost:8080/ExamCellAutomationSystem/studentdetails.jsp"); 
              //}
                  }
              }
             // else
              //{
               //  response.sendRedirect("http://localhost:8080/ExamCellAutomationSystem/error.jsp"); 
              //}
                  
              //}
              catch (SQLException ex) 
              {
                  Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                  
              }
          }
          
          else
{
response.sendRedirect("http://localhost:8080/ExamCellAutomationSystem/error.jsp");
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

