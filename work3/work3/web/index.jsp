<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>JSP Page</title>
        </head>
        <body>
            <FORM METHOD="GET" ACTION="Servlet">
                <TABLE>
                    <tr><td>numero ssn</td><td>Content</td></tr>
                    <c:forEach var="i" begin="0" end="2" step="1">
                        <tr><td><input type="text" name="title" /></td>
                            <td><input type="text" name="content" /></td></tr>
                    </c:forEach>
                </TABLE>
                <INPUT TYPE="SUBMIT" VALUE="Submit"/>
            </FORM>
        </body>
    </html>