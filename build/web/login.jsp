<%-- 
    Document   : index
    Created on : 16-Jan-2018, 17:51:15
    Author     : Ashu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <style>
            
            body
            {
                 background:url(d.jpg);
	background-size: cover; 
	background-position: center; 
            }
               
              
            
            #arpit
            {
                padding-top: 7%;
            }
            
            .button {
   background-color:white;
    border: none;
    color: black;
    
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
}
          
            
        </style>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
      

    </head>  
        
    <body >      
    
        <form action="Login" method="post">
            
           
            <center id="arpit">
                <table border="3" cellpadding="6" cellspacing="3">
                    
                     
                    <thead >
                    <tr>
                        <th colspan="4">Login Here</th>
                    </tr>
                </thead>
                <tbody >
                    <tr>
                        <td><b>Member Type</b></td>
                        <td>
                            <select name="#MT">
                                <option value="admin">Admin</option>
                                <option value="student">Student</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><b>Username</b></td>
                        <td><input type="text" name="username" required /></td>
                    </tr>
                    <tr>
                        <td><b>Password</b></td>
                        <td><input type="password" name="password" required /></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input class="button" type="submit" value="Login" />
                            &nbsp;&nbsp;
                            <input class="button" type="reset" value="Reset" />
                           
                            <h3>Not a User???</h3>
                            <a href="register.jsp"><b>Register</b></a>
                        </td>   
                        
                    </tr>                    
                </tbody>
                
            </table>
            </center>             
        </form>            
     
    </body>
</html>
