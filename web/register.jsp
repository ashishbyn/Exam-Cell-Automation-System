<%-- 
    Document   : Welcome
    Created on : 09-Mar-2018, 22:05:55
    Author     : Ashu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>      

<meta charset=utf-8 />
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            body
            {
               background-color: pink;
                background-position: center;
                background-size: cover;
                padding-left: 10%;
                padding-top: 7%;
            }
            
        </style>
        
        <script>
            {
                function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('#blah')
                    .attr('src', e.target.result)
                    .width(150)
                    .height(200);
            };

            reader.readAsDataURL(input.files[0]);
        }
    }
            }
            </script>
       
       
    </head>
    
    <body>
        <form action="Register" method="post">
       
         <div class="container">
		<div class="jumbotron">
		<h1>Register</h1>
            
	 
             
		<label for="first">First Name:</label>
		<input name="first" id="first" type="text" placeholder="first name" required>
		<label for="last">Last Name:</label>
		<input name="last" id="last" type="text" placeholder="last name" required>
                <br>
                <br>
                
		<div>
			<label for="male">Male</label>
			<input type="radio" name="gender" id="male" value="male" required>
			<label for="female">Female</label>
			<input type="radio" name="gender" id="female" value="female" required>
			<label for="other">Other</label>
			<input type="radio" name="gender" id="Other" value="Other" required>
		</div>
                <br>
                
                
                 <input type='file' name="image" onchange="readURL(this);"/>
                 <img id="blah" src="#" alt="Your Image"/>
                
                 <br>
                 <br>
                
                
                
                
                
                

		<div>
		<label for="first">Enter Your Email:
		<input name="E-mail" id="first" type="email" placeholder="Your email" required>
		</label>
                    <br>
                <br>
		
                

		<div>		
                      <label >Date Of Birth(YYYY/MM/DD):
		<input name="date"  type="text" placeholder="Enter Birthday Date" required>
				
			</label>
		</div>
                
                <br>

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
		<div>
			<label for="agreed">I agree to the terms and conditions</label>
			<input id="agreed" name="agreed" type="checkbox" required>
		</div>
<br>
                

<input type="submit" value="Submit" name="submit">

                <script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</form>


    </body>
</html>
