<%-- 
    Document   : login
    Created on : Jul 25, 2015, 6:58:25 PM
    Author     : Imran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <title>Pharma Login</title>
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css"> <!-- load bootstrap css -->
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css"> <!-- load fontawesome -->
    <style>
        body        { padding-top:80px; }
    </style>
</head>
<body>
<div class="container">

<div class="col-sm-6 col-sm-offset-3">

    <h1><span class="fa fa-sign-in"></span> Login</h1>

    <!-- show any messages that come back with authentication -->
  
    <!-- LOGIN FORM -->
    <form action="login" method="post">
        <div class="form-group">
            <label>Email</label>
            <input type="email" class="form-control" id="inputEmail" name="inputEmail" placeholder="Email address" required autofocus>
        </div>
        <div class="form-group">
            <label>Password</label>
            <input type="password" class="form-control" id="inputPassword" name="inputPassword" placeholder="Password" required>
        </div>
         <div class="checkbox">
                    <label>
                        <input type="checkbox" value="yes"  name="remember" id="remember"> Remember me
                    </label>
         </div>

        <button type="submit" class="btn btn-warning btn-lg">Login</button>
    </form>

    <hr>

    <p>Need an account? <a href="forgot.jsp">Forgot Password</a></p>
    <p>Or go <a href="/OOPAssignmentPresentationLayer">home</a>.</p>

</div>

</div>
</body>
</html>