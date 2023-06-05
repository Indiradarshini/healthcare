<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
    body {
        background-color: #f8f9fa;
    }
    
    .container {
        max-width: 400px;
        margin-top: 100px;
    }
    
    .logo {
        width: 100px;
        height: 100px;
        margin-bottom: 20px;
    }
    
    .form-label {
        font-weight: bold;
    }
</style>
</head>
<body>
<div class="container text-center">
    <img src="https://example.com/logo.png" class="logo img-fluid" alt="Logo">
    <h4 class="mb-4">Register</h4>
    <div class="form-group">
	      <label for="role">Role</label>
	      <select class="form-control" name="role" id="exampleSelect1">
	        <option value="administrator">Administrator</option>
	      
	        <option value="Patient">Patient</option>
	          <option value="Diagnostic Center">Diagnostic Center</option>
	      
	      </select>
	    </div>
    
    <!-- Patient Form -->
<div id="patientForm" style="display: none">
    <!-- Additional patient form fields here -->
   
    <form action="saveregister" method="post">
        <label for="name" class="form-label">Patient Name</label>
        <input type="text" name="name" id="name" class="form-control" required>
        </form>
    </div>
    <!-- Other patient form fields -->
</div>

<!-- Admin Form -->
<div id="adminForm" style="display: none">
    <!-- Additional admin form fields here -->
    <div class="form-group">
    <label for="adminName" class="form-label">Admin Name</label>
    <input type="text" name="adminName" id="adminName" class="form-control" required>
    
    <label for="adminEmail" class="form-label">Email</label>
    <input type="text" name="adminEmail" id="adminEmail" class="form-control" required>
    
    <label for="adminName" class="form-label">Password</label>
    <input type="password" name="adminpass" id="adminpass" class="form-control" required>
    
   
</div>
    <!-- Other admin form fields -->
</div>

<!-- Diagnostic Center Form -->
<div id="centerForm" style="display: none">
    <!-- Additional diagnostic center form fields here -->
    <div class="form-group">
        <label for="centerName" class="form-label">Center Name</label>
        <input type="text" name="centerName" id="centerName" class="form-control" required>
    </div>
    <!-- Other diagnostic center form fields -->
</div>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    $(document).ready(function() {
        $('#exampleSelect1').change(function() {
            var selectedOption = $(this).val();
            $('#patientForm').hide();
            $('#adminForm').hide();
            $('#centerForm').hide();

            if (selectedOption === 'Patient') {
                $('#patientForm').show();
            } else if (selectedOption === 'administrator') {
                $('#adminForm').show();
            } else if (selectedOption === 'Diagnostic Center') {
                $('#centerForm').show();
            }
        });
    });
</script>
<script>
    // Validate email format
    function validateEmail(email) {
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return emailRegex.test(email);
    }
    
    // Validate password format (at least 8 characters with at least one uppercase letter, one lowercase letter, and one digit)
    function validatePassword(password) {
        const passwordRegex = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/;
        return passwordRegex.test(password);
    }
    
    // Add event listener to email input field
    const emailInput = document.getElementById('adminEmail');
    emailInput.addEventListener('input', function () {
        const email = emailInput.value;
        if (!validateEmail(email)) {
            emailInput.setCustomValidity('Please enter a valid email address.');
        } else {
            emailInput.setCustomValidity('');
        }
    });
    
    // Add event listener to password input field
    const passwordInput = document.getElementById('adminpass');
    passwordInput.addEventListener('input', function () {
        const password = passwordInput.value;
        if (!validatePassword(password)) {
            passwordInput.setCustomValidity('Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.');
        } else {
            passwordInput.setCustomValidity(''); }
    });
    </script>


   
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
