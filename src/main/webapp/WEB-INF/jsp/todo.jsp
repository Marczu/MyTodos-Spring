<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<style>

    .error {
        color: red
    }
</style>

<div class="container">
    <h1 class="display-3">Add Todo for ${name}</h1>


    <form:form method="post" modelAttribute="todo">
        <form:hidden path="id"/>

        <%--Description--%>
        <fieldset class="form-group">
            <form:label path="desc">Description</form:label>
            <small class="form-text text-muted"><form:errors path="desc" cssClass="error"/></small>

            <form:input type="text" class="form-control" path="desc" placeholder="Write description for new Todo"
                        required="required"/>

        </fieldset>

        <%--Date--%>
        <fieldset class="form-group">
            <form:label path="targetDate">Target Date</form:label>
            <small class="form-text text-muted"><form:errors path="targetDate" cssClass="error"/></small>

            <form:input type="text" class="form-control" path="targetDate" placeholder="Write description for new Todo"
                        required="required"/>

        </fieldset>
        <button type="submit" class="btn btn-success">Add new Todo</button>
    </form:form>



</div>
<%@include file="common/footer.jspf" %>

