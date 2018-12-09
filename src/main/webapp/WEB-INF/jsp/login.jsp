<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

<div class="container">

    <h3 class="display-3">Login Page</h3>

    <form method="post">
        <div class="form-group">
            <label >Username</label>
            <input type="text" class="form-control" name="name" aria-describedby="emailHelp" placeholder="Enter username">
        </div>
        <div class="form-group">
            <label>Password</label>
            <input type="password" class="form-control" name="password" placeholder="Enter password">
        </div>

        <button type="submit" class="btn btn-primary">Login</button>
    </form>


</div>

<%@include file="common/footer.jspf" %>
