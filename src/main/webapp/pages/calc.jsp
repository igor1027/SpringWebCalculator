<%--
  Created by IntelliJ IDEA.
  User: Zenbook
  Date: 28.11.2021
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<c:if test="${user != null}">
    <form action="/calc/history" method="get">
        <button>History</button>
    </form>

    <form action="/">
        <button>Back</button>
    </form>

    <form action="/calc/calculator" method="post">
        <p>
        <div class="col-sm-3" >
            <label class="visually-hidden" for="specificSizeInputName1">Number 1</label>
            <input type="number" name="num1" class="form-control" id="specificSizeInputName1"
                   placeholder="Number" >
        </div>
        <div class="col-sm-3">
            <select name="operation" class="form-select form-select-sm" aria-label=".form-select-sm example">
                <option disabled selected>Open this select menu</option>
                <option value="sum">+</option>
                <option value="sub">-</option>
                <option value="mul">*</option>
                <option value="div">/</option>
            </select>
        </div>
        <div class="col-sm-3">
            <label class="visually-hidden" for="specificSizeInputName2">Number 2</label>
            <input type="number" name="num2" class="form-control" id="specificSizeInputName2"
                   placeholder="Number">
        </div>
        <button type="submit" class="btn btn-outline-dark" value="result">Result</button>
        </p>
    </form>

    <c:if test="${message1 != null}">
            ${message1}
    </c:if>
    <c:if test="${message2 != null}">
            ${message2}
    </c:if>

    <label>
        <c:if test="${operationHistory !=null}">
            <ol>
                <c:forEach var="operation" items="${operationHistory}">
                    <li><c:out value="${operation}"/></li>
                </c:forEach>
            </ol>
        </c:if>
    </label>
</c:if>

</body>
</html>
