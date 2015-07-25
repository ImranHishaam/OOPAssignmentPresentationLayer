<%-- 
    Document   : index
    Created on : Jul 13, 2015, 9:57:58 PM
    Author     : Imran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html>
    <head>
        <title>Welcome Page</title>
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css"> <!-- load bootstrap css -->
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css"> <!-- load fontawesome -->
        <style>
            body        { padding-top:80px; }
        </style>
    </head>
    <body>
        <div class="container">

            <div class="jumbotron text-center">
                <h1><span class="fa fa-lock"></span> Welcome to Pharma</h1>

                <p>Login Now </p>

                <a href="login.jsp" class="btn btn-default"><span class="fa fa-user"></span> Local Login</a>
                <a href="forgot.jsp" class="btn btn-default"><span class="fa fa-user"></span> Forgot Password</a>
            </div>

        </div>
    </body>
</html>
