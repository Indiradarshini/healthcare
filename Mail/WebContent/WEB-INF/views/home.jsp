<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Log In</title>
	    <meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
		<style type="text/css">
			body{
					color: #fff;
					background: #3598dc;
					font-family: 'Roboto', sans-serif;
				}
			    .form-control{
					height: 41px;
					border: primary;
				}
				
			    .form-control, .btn{        
			        border-radius: 3px;
			    }
				.signup-form{
					width: 390px;
					margin: 30px auto;
				}
				.signup-form form{
					color: #999;
					border-radius: 3px;
			    	margin-bottom: 15px;
			        background: #fff;
			        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
			        padding: 30px;
			    }
				.signup-form h2 {
					color: #333;
					font-weight: bold;
			        margin-top: 0;
			    }
			    .signup-form hr {
			        margin: 0 -30px 20px;
			    }  
				.signup-form input[type="checkbox"]{
					margin-top: 3px;
				}
				.signup-form .row div:first-child{
					padding-right: 10px;
				}
				.signup-form .row div:last-child{
					padding-left: 10px;
				}
			    .signup-form .btn{        
			        font-size: 16px;
			        font-weight: bold;
					border: none;
					min-width: 140px;
			    }
				.signup-form .btn:hover, .signup-form .btn:focus{
			        outline: none;
				}
			    .signup-form a{
					color: #fff;
					text-decoration: underline;
				}
				.signup-form a:hover{
					text-decoration: none;
				}
				.signup-form form a{
					color: #3598dc;
					text-decoration: none;
				}	
				.signup-form form a:hover{
					text-decoration: underline;
				}
			    .signup-form .hint-text {
					padding-bottom: 15px;
					text-align: center;
			    }
		</style>
</head>
<body>
 
	<div class="col-md-9 col-lg-6 col-xl-5">
        <img src=""
          class="img-fluid" alt="Sample image"  >
      </div>
	<div class="signup-form">
	
   <form action="login" method="post">
		<h2>Sign In</h2>
		
		
	    <div class="form-group">
	      <label for="role">Role</label>
	      <select class="form-control" name="role" id="exampleSelect1">
	        <option value="administrator">Administrator</option>
	      
	        <option value="Patient">Patient</option>
	          <option value="Diagnostic Center">Diagnostic Center</option>
	      
	      </select>
	    </div>

		<div class="form-group">
	      <label for="username">Username</label>
	      <input type="text" name="uname" class="form-control" id="uname"  placeholder="Username"
	      required="required">
	    </div>
	    <div class="form-group">
	      <label for="password">Password</label>
	      <input type="password" name="pass" class="form-control" id="pass" placeholder="Password"
	      required="required">
	    </div>
	    
		<button type="submit" class="btn btn-primary">Login</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<button type="reset" class="btn btn-danger">Clear</button>
	    
	    <div style="color:white;">adding a row gap</div>
	    
	


		
		
		<div> <a href="forget" class="text-body">Forgot password?</a></div>
		<div> <a href="change" class="text-body">Change password?</a></div>
           
         

          <div class="text-center text-lg-start mt-4 pt-2">
           
            <p class="small fw-bold mt-2 pt-1 mb-0">Don't have an account? <a href="register"
                class="link-danger">Register</a></p>
          </div>
          
 </form>
 </div>
 
<!-- javascript code -->

		
</body>
</html>



