<%-- 
    Document   : sdata.jsp
    Created on : 31-Mar-2018, 18:26:20
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
        
        
        <nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container" >
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-nav-demo" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
						
			</div>
			<div class="collapsed navbar-collapsed" id="bs-nav-demo">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#">About</a></li>
					<li><a href="#">Contact</a></li>
					</ul>

				<ul class="nav navbar-nav navbar-right">
					<li><a href="#">Sign Up<i class="fa fa-user-plus" aria-hidden="true"></i></a></li>
					<li><a href="#">Login<i class="fa fa-user-plus" aria-hidden="true"></i></a></li>
					</ul>				
			</div>

			
		</div>
	</nav>
       
         <div class="container">
		<div class="jumbotron">
		<h1>Student Details:</h1>
            
                <form action="Studentdetail" method="post">
            <fieldset>
            
            <label for="id">Student Id:</label>
            <input name="id" id="id" type="text" placeholder="Id">
            </fieldset>
            <br>
            <br>
            
            <fieldset>
		<label for="first">First Name:</label>
		<input name="first" id="first" type="text" placeholder="first name" required>
		<label for="last">Last Name:</label>
		<input name="last" id="last" type="text" placeholder="last name" required>
            </fieldset>
                <br>
                <br>
                
                
                 <input type='file' onchange="readURL(this);" />
                 <img id="blah" src="#" alt="Your Image"/>
                
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
                
                
                <div>
			<label >Date Of Birth:
		<input name="date"  type="text" placeholder="Enter Birthday Date" required>
				
			</label>
		</div>
                <br>
                

		<div>
                    <fieldset>
		<label for="first">Enter Your Email:</label>
		<input name="E-mail" id="first" type="email" placeholder="Your email" required>
		
                    </fieldset>
                    <br>
                    <br>
                    
                 
                  <fieldset>
		<label for="last">Enter Password:  </label>
		<input name="Password" id="last" type="password" placeholder="Password" require>
	
                 </fieldset>
                                        
		</div>
                <br>
                <br>
                
                <fieldset>
                <label for="university">University:</label>
		<input name="university" id="university" type="text" size=25 required>
                </fieldset>
                <br>
                <br>
                
                <fieldset>
                <label for="college">College Name:   </label>
		<input name="college" id="college" type="text" required>
                </fieldset>
                <br>
                <br>
                
                <fieldset>
                <label for="hall">Hall Ticket no: </label>
		<input name="hall" id="hall" type="text" required>
                </fieldset>
                
                <br>
                <br>
                
                <fieldset>
                <label for="center">Center Name:    </label>
		<input name="center" id="center" type="text" required>
                </fieldset>
                <br>
                <br>
                
                <fieldset>
                <label for="cen">Center No:      </label>
		<input name="cen" id="cen" type="text" required>
                </fieldset>
                
                <br>
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

	</form>
                <script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </body>
</html>

