<%-- 
    Document   : ageCalculator
    Created on : Sep 13, 2018, 12:13:07 PM
    Author     : 687159
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1><br>
        <div>
            <form method="post" action="age">
                Enter your age: <input type="text" name="ageBox">
                <input type="submit" value="Age Next Birthday">
            </form>
        </div>
        ${errorMessage}
        ${ageMessage}<br>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
