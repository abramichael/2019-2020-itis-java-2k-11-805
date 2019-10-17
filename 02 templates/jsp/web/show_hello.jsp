<%--
  Created by IntelliJ IDEA.
  User: ma
  Date: 14.10.2019
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <% if (request.getAttribute("yourname") != null) { %>
      Helloushki,  <b>${yourname}</b>!
  <% } else { %>
      Hello, anon!
  <% } %>
  </body>
</html>
