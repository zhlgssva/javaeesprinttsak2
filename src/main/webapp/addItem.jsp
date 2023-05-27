<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Sales</title>
    <%@include file="head.jsp"%>
</head>
<body>
<%@include file="navbar.jsp"%>
<form action="/New-Sales" method="post">
    <div class="form-group">
        <label>Name</label>
        <input type="text" name="name" class="form-control" placeholder="Name">
    </div>
    <div class="form-group">
        <label>Price</label>
        <input type="text" name="price" class="form-control" placeholder="Price">
    </div>
    <div class="form-row">
        <div class="form-group col-md-4">
            <label>First Description:</label>
            <input type="text" name="firstDescription" class="form-control" placeholder="">
        </div>
        <div class="form-group col-md-4">
            <label>Second Description:</label>
            <input type="text" name="secondDescription" class="form-control" placeholder="">
        </div>
        <div class="form-group col-md-4">
            <label>Third Description</label>
            <input type="text" name="thirdDescription" class="form-control" placeholder="">
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Add Product</button>
</form>
</body>
</html>
