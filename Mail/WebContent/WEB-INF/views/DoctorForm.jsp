<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
   
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-image: url('https://img.freepik.com/premium-photo/female-doctor-showing-something-white-background_397897-64.jpg');
             background-repeat: no-repeat;
            background-size: cover;
            background-position: center center;
            height: 100vh;
        }

        .container {
            max-width: 500px;
            margin: auto;
            padding: 20px;
            background-color: white;
            border-radius: 5px;
            margin-top: 100px;
        }
        h1 {
            font-family: Arial, sans-serif;
            font-size: 32px;
            font-weight: bold;
            text-align: center;
            color: #333;
        }
    </style>
</head>
<body>
    <div class="container">
        <form action="savedoc" method="post">
         <center>
  
    <h1>Doctors Feeding</h1></center>
            <div class="form-group">
                <label for="doc_name" class="form-label">Doctor Name</label>
                <input type="text" name="dname" id="dname" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="doc_qual" class="form-label">Doctor Qualification</label>
                <input type="text" name="dqual" id="dqual" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="spec_id" class="form-label">Specialization id</label>
                <input type="text" name="spec_id" id="spec_id" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="doc_exp" class="form-label">Experience</label>
                <input type="text" name="doc_exp" id="doc_exp" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="doctor_photo" class="form-label">Photo</label>
                <input type="file" name="doctor_photo" id="doctor_photo" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="doc_fee" class="form-label">Fees</label>
                <input type="number" name="doc_fee" id="doc_fee" class="form-control" required>
            </div>

            <button type="submit" class="btn btn-primary btn-block">Add</button>
        </form>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
