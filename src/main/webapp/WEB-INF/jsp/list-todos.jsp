

<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>



<div class="container">


    <h3 class="display-3">${name}'s Todos list</h3>

    <%--TABLE--%>
    <table class="table table-hover">
        <thead class="thead-light">
        <tr>
            <th scope="col">Description</th>
            <th scope="col">Target Time</th>
            <th scope="col">Is it done?</th>
            <th scope="col">Delete</th>
            <th scope="col">Update</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.desc}</td>
                <td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"/></td>
                <td>${todo.done}</td>
                <td><a class="btn btn-warning btn-sm" href="delete-todo?id=${todo.id}" role="button">Delete</a></td>
                <td><a class="btn btn-success btn-sm" href="update-todo?id=${todo.id}" role="button">Update</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div>
        <a class="btn btn-outline-success btn-lg" href="/add-todo" role="button">Add Todo</a>
    </div>

</div>
<%@include file="common/footer.jspf" %>
