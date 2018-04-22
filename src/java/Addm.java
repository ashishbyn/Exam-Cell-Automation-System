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
public class Addm extends HttpServlet
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
      // PrintWriter out=response.getWriter();
        //FileInputStream fis;         
           int id = Integer.parseInt(request.getParameter("id"));
            String sem = request.getParameter("sem");
             
              String sub1 = request.getParameter("s1");
              String sub2 = request.getParameter("s2");
              String sub3 = request.getParameter("s3");
              String sub4 = request.getParameter("s4");
              
              int marks1 = Integer.parseInt(request.getParameter("m1"));
              int marks2 = Integer.parseInt(request.getParameter("m2"));
            int marks3 = Integer.parseInt(request.getParameter("m3"));
             int marks4 = Integer.parseInt(request.getParameter("m4"));
              
              int prac1= Integer.parseInt(request.getParameter("p1"));
              int prac2= Integer.parseInt(request.getParameter("p2"));
                int prac3= Integer.parseInt(request.getParameter("p3"));
                 int prac4= Integer.parseInt(request.getParameter("p4"));
              
              
              int cre1 = Integer.parseInt(request.getParameter("c1"));
              int cre2 = Integer.parseInt(request.getParameter("c2"));
               int cre3 = Integer.parseInt(request.getParameter("c3"));
                int cre4 = Integer.parseInt(request.getParameter("c4"));
              
            
             
              
               String b = request.getParameter("b"); 
                int total1=0,total2=0,total3=0,total4=0;
                double grade1=0,grade2=0,grade3=0,grade4=0;
                
            
         
            
           
            
                
                String s1 = null;
                 String s2 = null;
                 String s3 = null;
                 String s4 = null;
                int gc1 = 0;
                int gc2 = 0;
                 int gc3 = 0;
                 int gc4 = 0;
                 
                 
              
            
            /* TODO output your page here. You may use following sample code. */
          int A=10,B=9,C=8,D=7;            
           {
               total1=marks1+prac1;               
               request.setAttribute("t1",total1);              
               
               grade1=(total1)/2;        
           
              
               if(grade1>80)
               {
                   s1="A";                  
               }
               else if(grade1<=80 && grade1>60)
               {
                   s1="B";                 
               }
              else if(grade1<=60 && grade1>40)
               {
                   s1="C";                  
               }
              else
               {
                   s1="D";                
               }
               request.setAttribute("g1",s1);             
               
               if(s1.equals("A")) 
               {
                   gc1=A*cre1;        
                  
               }
               else if(s1.equals("B")) 
               {
                   gc1=B*cre1;                
                 
               }
               else if(s1.equals("C")) 
               {
                   gc1=C*cre1;                   
                  
               }
               else
               {
                   gc1=D*cre1;                   
                  
               }
               request.setAttribute("cgpa1",gc1);
               
               
               
               total2=marks2+prac2;               
               request.setAttribute("t2",total2);              
               
               grade2=(total2)/2;        
           
              
               if(grade2>80)
               {
                   s2="A";                  
               }
               else if(grade2<=80 && grade2>60)
               {
                   s2="B";                 
               }
              else if(grade2<=60 && grade2>40)
               {
                   s2="C";                  
               }
              else
               {
                   s2="D";                
               }
               request.setAttribute("g2",s2);             
               
               if(s2.equals("A")) 
               {
                   gc2=A*cre2;        
                  
               }
               else if(s2.equals("B")) 
               {
                   gc2=B*cre2;                
                 
               }
               else if(s2.equals("C")) 
               {
                   gc2=C*cre2;                   
                  
               }
               else
               {
                   gc2=D*cre2;                   
                  
               }
               request.setAttribute("cgpa2",gc2);
               
               
               
               total3=marks3+prac3;               
               request.setAttribute("t3",total3);              
               
               grade3=(total3)/2;        
           
              
               if(grade3>80)
               {
                   s3="A";                  
               }
               else if(grade3<=80 && grade3>60)
               {
                   s3="B";                 
               }
              else if(grade3<=60 && grade3>40)
               {
                   s3="C";                  
               }
              else
               {
                   s3="D";                
               }
               request.setAttribute("g3",s3);             
               
               if(s3.equals("A")) 
               {
                   gc3=A*cre3;        
                  
               }
               else if(s3.equals("B")) 
               {
                   gc3=B*cre3;                
                 
               }
               else if(s3.equals("C")) 
               {
                   gc3=C*cre3;                   
                  
               }
               else
               {
                   gc3=D*cre3;                   
                  
               }
               request.setAttribute("cgpa3",gc3);
               
               
               total4=marks4+prac4;               
               request.setAttribute("t4",total4);              
               
               grade4=(total4)/2;        
           
              
               if(grade4>80)
               {
                   s4="A";                  
               }
               else if(grade4<=80 && grade4>60)
               {
                   s4="B";                 
               }
              else if(grade4<=60 && grade4>40)
               {
                   s4="C";                  
               }
              else
               {
                   s4="D";                
               }
               request.setAttribute("g4",s4);             
               
               if(s4.equals("A")) 
               {
                   gc4=A*cre4;        
                  
               }
               else if(s4.equals("B")) 
               {
                   gc4=B*cre4;                
                 
               }
               else if(s4.equals("C")) 
               {
                   gc4=C*cre4;                   
                  
               }
               else
               {
                   gc4=D*cre4;                   
                  
               }
               request.setAttribute("cgpa4",gc4);
               
               
               
              //request.getRequestDispatcher("addmarks.jsp").forward(request, response);           
           
            
             
               
              
           }            
            
            
            
            
            
            //if(b!=null)
         // {
              
                        
              
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
                   stmt.executeUpdate("insert into marks(id,sem,sub1,sub2,sub3,sub4,marks1,marks2,marks3,marks4,prac1,prac2,prac3,prac4,credits1,credits2,credits3,credits4,total1,total2,total3,total4,grade1,grade2,grade3,grade4,g_c1,g_c2,g_c3,g_c4)values('"+id+"','"+sem+"','"+sub1+"','"+sub2+"','"+sub3+"','"+sub4+"','"+marks1+"','"+marks2+"','"+marks3+"','"+marks4+"','"+prac1+"','"+prac2+"','"+prac3+"','"+prac4+"','"+cre1+"','"+cre2+"','"+cre3+"','"+cre4+"','"+total1+"','"+total2+"','"+total3+"','"+total4+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+gc1+"','"+gc2+"','"+gc3+"','"+gc4+"')");
                 
//PreparedStatement ps = con.prepareStatement("insert into register(fname, lname,img,gender,email,pass,date) values(?,?,?,?,?,?,?)");
                    //ps.setint(1, fname);
                   // ps.setint(2, lname);
                     //fis=new FileInputStream(image);
              //ps.setBinaryStream(3, (InputStream) fis, (int) (image.length()));
             // ps.setint(4, gend);              
                //ps.setint(5, email);
                    //ps.setint(6, pass);
               //ps.setint(7,date);
                
                   
               
             // int count=ps.executeUpdate(); 
             // if(count>0)
              //{
               request.getRequestDispatcher("addmarks.jsp").forward(request, response);  
                // response.sendRedirect("http://localhost:8080/ExamCellAutomationSystem/studentdetails.jsp"); 
              //}
                  }
              
             // else
              //{
               //  response.sendRedirect("http://localhost:8080/ExamCellAutomationSystem/error.jsp"); 
              //}
                  
              //}
              catch (SQLException ex) 
              {
                  Logger.getLogger(Addm.class.getName()).log(Level.SEVERE, null, ex);
                  
              }
          }
           
          
          
          
   // }
    
    
    
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
     * @return a int containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

