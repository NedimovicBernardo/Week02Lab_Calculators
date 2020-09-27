<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 26, 2020, 6:04:49 PM
    Author     : 816076
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
            <label>First:</label><input type="text" name="first_number" value="${firstNumber}">
            <br>
            <label>Second:</label><input type="text" name="second_number" value="${secondNumber}">
            <br>
            <input type="submit" value="+" name="plus">
            <input type="submit" value="-" name="minus">
            <input type="submit" value="*" name="multiply">
            <input type="submit" value="%" name="modulus">
            <br>
            <p>Result: ${message}</p>
        </form>
        <a href="./age">Age Calculator</a>
    </body>
</html>
