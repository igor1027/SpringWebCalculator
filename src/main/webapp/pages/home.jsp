<%--
  Created by IntelliJ IDEA.
  User: Zenbook
  Date: 28.11.2021
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<c:if test="${user == null}">
    <a href="/user/reg">Registration</a>
    <a href="/user/auth">Authorization</a>
</c:if>
<c:if test="${user != null}">
    <a href="/calc/history">History</a>
    <a href="/calc/calculator">Calculator</a>
    <a href="/user/logout">LogOut</a>
</c:if>
</body>
</html>
