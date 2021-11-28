<%--
  Created by IntelliJ IDEA.
  User: Zenbook
  Date: 28.11.2021
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>History</title>
</head>
<body>
<c:if test="${user != null}">
    <form action="/calc/history" method="post">
        <c:if test="${operationHistory !=null}">
            <ol>
                <c:forEach var="operation" items="${operationHistory}">
                    <li><c:out value="${operation}"/></li>
                </c:forEach>
            </ol>
        </c:if>

        <c:if test="${operationHistory == null}">
            <c:if test="${message != null}">
                ${message}
            </c:if>
        </c:if>
    </form>
</c:if>
</body>
</html>
