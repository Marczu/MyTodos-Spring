<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<%--Body--%>
<div class="container">
    Welcome ${name}. Have a nice Day!
    <br>
    <a href="/list-todos">Click here</a> to manage your todos.

</div>

<%--Footer--%>
<%@include file="common/footer.jspf" %>