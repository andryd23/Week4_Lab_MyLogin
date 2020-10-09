<%-- 
    Document   : login
    Created on : Oct 8, 2020, 4:36:04 PM
    Author     : 832465
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        
        <form method="get">
            <label>Username: </label>
            <input type="text" name="username" value="${username}">
            <label>Password:</label>
            <input type="password" name="userPass" value="${userPass}">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
