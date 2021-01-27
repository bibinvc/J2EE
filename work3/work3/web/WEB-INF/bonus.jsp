<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
    <metahttp-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SSN page</title>
    </head>
    <body>
        <c:forEach items="${list}" var="bean">
            <div class="Informations">
                <div class="Social security number">
                    numero SSN:
                    <c:out value="${bean.title}" />
                </div>
                <div class="Bonus computed">
                    bonus calculation:
                    <c:out value="${bean.bonuscal}"></c:out>          
                    </div>
                </div>
        </c:forEach>
    </body>
</html>
