<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 13, 2018, 12:40:01 PM
    Author     : 687159
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstN"><br>
            Second: <input type="text" name="secondN"><br>
            <input type="submit" name="operation" value="+"><input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*"><input type="submit" name="operation" value="%"><br>
            
            ${result}
            ${resultM}
        </form>
        
    </body>
</html>
