<%--
  Created by IntelliJ IDEA.
  User: Dotin
  Date: 5/27/2024
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show form</title>
</head>
<body>
<%--<form action="studentNameLowerCase" method="get">--%>
<form action="subController/studentNameLowerCase" method="get">
<%--<form action="studentNameUpperCase" method="get">--%>
    <input type="text" name="studentName" placeholder="whats your name"/>
    <input type="submit"/>
</form>
</body>
</html>
