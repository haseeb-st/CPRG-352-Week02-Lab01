<%-- 
    Document   : hellowWorldJSP
    Created on : Sep 12, 2018, 9:36:27 AM
    Author     : 687159
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World!</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="hello">
            First Name: <input type="text" name="fname" value="${firstName}"/><br>
            Last Name: <input type="text" name="lname" value="${lastName}"/><br>
            <input type="submit" value="Submit"/><br>
            ${errorM}
        </form>
    </body>
</html>
