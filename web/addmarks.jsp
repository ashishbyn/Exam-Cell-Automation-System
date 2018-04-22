<%-- 
    Document   : sdata.jsp
    Created on : 31-Mar-2018, 18:26:20
    Author     : Ashu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
<meta charset=utf-8 />
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
        
        <style>
            body
            {
               background-color: pink;
                background-position: center;
                background-size: cover;
                padding-left: 10%;
              
            }
            
           
            
        </style>
        
       
    </head>
    
    <body>
         
         
        <form  action="Addm" method="post">
        
            
            <center>	
            <label>Id</label>
            <input type="text" name="id"><br><br>
                                        <label>Semester:</label>
                 <select name="sem">
                     <option>--Select--</option>
                                <option>Sem I</option>
                                <option>Sem II</option>
                                <option>Sem III</option>
                                <option>Sem IV</option>
                                <option>Sem V</option>
                                <option>Sem VI</option>
                                <option>Sem VII</option>
                                <option>Sem VIII</option>
                                
                            </select>     
                                        
            </center>	
    					
    			
    			
    		<br><br>
                <table border=1 align="center" id="first"   >
    			<thead>
    				<tr >
 	   					<th>Subject</th>
 	   					
 	   					<th>Sem Marks</th>
                                                
                                                <th>Prac Marks</th>
                                                
                                                <th>Credits</th>
                                                
                                               
                                                
                                                <th>Total</th>
                                                
                                                <th>Grade</th>
                                               
                                                <th>G*C</th>
                                                
    				</tr>
    			</thead>
                        <tbody >
                            <tr >
                                <td>  <select name="s1"><option>Subject 1</option></select></td>
                                <td><input type="textbox" name="m1"></td>
                                <td><input type="textbox" name="p1"></td>
                                <td><input type="textbox" name="c1"></td>
                               
                                <td><input type="textbox" name="t1"  value="<%= request.getAttribute("t1")%>" ></td>
                                <td><input type="textbox" name="g1" value="<%= request.getAttribute("g1")%>"></td>
                                <td><input type="textbox" name="cgpa1" value="<%= request.getAttribute("cgpa1")%>"></td>
                                
                            </tr>
                           
                            <tr>
                                <td >  <select name="s2"><option>Subject 2</option></select></td>
                                <td><input type="textbox" name="m2"></td>
                                <td><input type="textbox" name="p2"></td>
                                <td><input type="textbox" name="c2"></td>
                                
                                <td><input type="textbox" name="t2"  value="<%= request.getAttribute("t2")%>"></td>
                                <td><input type="textbox" name="g2" value="<%= request.getAttribute("g2")%>"></td>
                                <td><input type="textbox" name="cgpa2" value="<%= request.getAttribute("cgpa2")%>"></td>
                                
                            </tr>
                            <tr >
                                <td >  <select name="s3"><option>Subject 3</option></select></td>
                                <td><input type="textbox" name="m3"></td>
                                <td><input type="textbox" name="p3"></td>
                                <td><input type="textbox" name="c3"></td>
                                
                                <td><input type="textbox" name="t3"  value="<%= request.getAttribute("t3")%>" ></td>
                                <td><input type="textbox" name="g3" value="<%= request.getAttribute("g3")%>"></td>
                                <td><input type="textbox" name="cgpa3" value="<%= request.getAttribute("cgpa3")%>"></td>
                           
                            </tr>
                            
                            <tr >
                                <td >  <select name="s4"><option>Subject 4</option></select></td>
                                <td><input type="textbox" name="m4"></td>
                                <td><input type="textbox" name="p4"></td>
                                <td><input type="textbox" name="c4"></td>
                               
                                <td><input type="textbox" name="t4"   value="<%= request.getAttribute("t4")%>"></td>
                                <td><input type="textbox" name="g4" value="<%= request.getAttribute("g4")%>"></td>
                                <td><input type="textbox" name="cgpa4" value="<%= request.getAttribute("cgpa4")%>"></td>
                           
                            </tr>
                        </tbody>
    		</table>
                
                
                
                
                <br><br>
                
                
                <center>
                    <button id="sum" name="b1">Calculate</button>
                   
                </center> 
                
               
            
               
    		

            </form>
        
        
       
         
    </body>
</html>

