<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign in</title>
    <%@include file="head.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<form action="/login" method="post">
    <div class="form-group">
        <label>Email</label>
        <input type="text" name="email" class="form-control" placeholder="email">
    </div>
    <div class="form-group">
        <label>Password</label>
        <input type="text" name="password" class="form-control" placeholder="password">
    </div>
    <button type="submit" class="btn btn-primary">Login</button>
</form>
</body>
</html>
