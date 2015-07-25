<%-- 
    Document   : forgot
    Created on : Jul 25, 2015, 7:02:45 PM
    Author     : Imran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
    <title>Forgot Password</title>
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css"> <!-- load bootstrap css -->
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css"> <!-- load fontawesome -->
    <style>
        body        { padding-top:80px; }
    </style>
</head>
<body>
<div class="container">

<div class="col-sm-6 col-sm-offset-3">

    <h1><span class="fa fa-sign-in"></span> Forgot Password</h1>

    <!-- LOGIN FORM -->
    <form action="/signup" method="post">
        <div class="form-group">
            <label>Email</label>
            <input type="text" class="form-control" name="email">
        </div>
       
        <button type="submit" class="btn btn-warning btn-lg">Recover</button>
    </form>

    <hr>

    <p>Remember Password? <a href="login.jsp">Login</a></p>
    <p>Or go <a href="/OOPAssignmentPresentationLayer">home</a>.</p>

</div>

</div>
</body>
</html>