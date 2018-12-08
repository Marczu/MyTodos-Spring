
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Add Todo</title>
    <link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>
<div class="container">
    <h1 class="display-3">Add Todo for ${name}</h1>

    <form:form method="post" modelAttribute="todo">
        <fieldset class="form-group">
            <form:label path="desc">Description</form:label>
            <form:input type="text" class="form-control" path="desc" placeholder="Write description for new Todo" required="required"/>

        </fieldset>
        <button type="submit" class="btn btn-success">Add new Todo</button>
    </form:form>



    <script src="webjars/jquery/3.0.0/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>

</div>
</body>
</html>
