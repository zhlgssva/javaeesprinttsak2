<%@ page import="com.example.sprinttask2.database.Items" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Bitlab SHOP</title>
    <%@include file="head.jsp" %>
</head>

<body>
<%@include file="navbar.jsp" %>

<div class="pricing-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
    <h1 class="display-4">Welcome to BITLAB SHOP</h1>
    <p class="lead">Electronic devices with high quality and service</p>
</div>

<div class="container">
    <div class="card-deck mb-3 text-center">
        <%
            ArrayList<Items> items = (ArrayList<Items>) request.getAttribute("itemss");

            if (items != null) {
                int counter = 0;
                for (Items item : items) {
                    counter++;
        %>

        <div class="card mb-4 shadow-sm">
            <div class="card-header">
                <h4 class="my-0 font-weight-normal"><%=item.getName()%>
                </h4>
            </div>
            <div class="card-body">
                <h1 class="card-title pricing-card-title" style="color: green">$<%=item.getPrice()%> <small
                        class="text-muted"></small></h1>
                <ul class="list-unstyled mt-3 mb-4">
                    <li><%=item.getDescription1()%>
                    </li>
                    <li><%=item.getDescription2()%>
                    </li>
                    <li><%=item.getDescription3()%>
                    </li>
                </ul>
                <button type="button" class="btn btn-lg btn-block btn-success">Buy Now</button>
            </div>
        </div>


        <%
            if (counter % 3 == 0) {
        %>
        <br>
        <%

                    }
                }
            }
        %>
    </div>

    <footer class="pt-4 my-md-5 pt-md-5 border-top">
        <div class="row">
            <div class="col-12 col-md">
                <img class="mb-2" src="../../assets/brand/bootstrap-solid.svg" alt="" width="24" height="24">
                <small class="d-block mb-3 text-muted">&copy; 2017-2018</small>
            </div>
            <div class="col-6 col-md">
                <h5>Features</h5>
                <ul class="list-unstyled text-small">
                    <li><a class="text-muted" href="#">Cool stuff</a></li>
                    <li><a class="text-muted" href="#">Random feature</a></li>
                    <li><a class="text-muted" href="#">Team feature</a></li>
                    <li><a class="text-muted" href="#">Stuff for developers</a></li>
                    <li><a class="text-muted" href="#">Another one</a></li>
                    <li><a class="text-muted" href="#">Last time</a></li>
                </ul>
            </div>
            <div class="col-6 col-md">
                <h5>Resources</h5>
                <ul class="list-unstyled text-small">
                    <li><a class="text-muted" href="#">Resource</a></li>
                    <li><a class="text-muted" href="#">Resource name</a></li>
                    <li><a class="text-muted" href="#">Another resource</a></li>
                    <li><a class="text-muted" href="#">Final resource</a></li>
                </ul>
            </div>
            <div class="col-6 col-md">
                <h5>About</h5>
                <ul class="list-unstyled text-small">
                    <li><a class="text-muted" href="#">Team</a></li>
                    <li><a class="text-muted" href="#">Locations</a></li>
                    <li><a class="text-muted" href="#">Privacy</a></li>
                    <li><a class="text-muted" href="#">Terms</a></li>
                </ul>
            </div>
        </div>
    </footer>
</div>
</script>
</body>
</html>

