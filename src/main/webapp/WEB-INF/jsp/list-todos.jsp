<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--
  Created by IntelliJ IDEA.
  User: Marczu
  Date: 08.12.2018
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todos for ${name}</title>
    <link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>
<h1>Your Todos</h1>

<table>
    <thead>
        <tr>
            <th>Description</th>
            <th>Target Time</th>
            <th>Is it done?</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${todos}" var="todo">
        <tr>
            <td>${todo.desc}</td>
            <td>${todo.targetDate}</td>
            <td>${todo.done}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>


<br>

<a href="/add-todo">Add a Todo</a>


<script src="webjars/jquery/3.0.0/jquery.min.js"></script>
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>
