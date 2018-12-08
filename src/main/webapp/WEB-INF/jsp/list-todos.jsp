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
<div class="container">
    <h3 class="display-3">${name}'s Todos list</h3>

    <table class="table table-hover">
        <thead class="thead-light">
        <tr>
            <th scope="col">Description</th>
            <th scope="col">Target Time</th>
            <th scope="col">Is it done?</th>
            <th scope="col">Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.desc}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
                <td><a class="btn btn-warning btn-sm" href="delete-todo?id=${todo.id}" role="button">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div>
        <a class="btn btn-outline-success btn-lg" href="/add-todo" role="button">Add Todo</a>
    </div>


    <script src="webjars/jquery/3.0.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</div>
</body>
</html>
