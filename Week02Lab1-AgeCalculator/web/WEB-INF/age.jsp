<%-- 
    Document   : age
    Created on : Sep 21, 2017, 2:56:49 PM
    Author     : 687159
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Next Birthday</h1>
        <div>
            <form action="age" method="get">
                Enter your current age: <input type="text" name="ageBox">
                <input type="submit" value="Age Next Birthday">
                Your age next birthday will be {$age}
            </form>
        </div>
    </body>
</html>
