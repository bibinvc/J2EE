<%-- 
    Document   : bonus
    Created on : 30 mars 2020, 17:19:58
    Author     : bvcbi
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Social security number: ${b.num} </p>
        <p>Multiplier: ${ b.multiplier} </p>
        <p>Bonus Amount: ${ b.result} </p>
    </body>
</html>
