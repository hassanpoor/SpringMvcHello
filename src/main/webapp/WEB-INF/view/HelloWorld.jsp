<%--
  Created by IntelliJ IDEA.
  User: Dotin
  Date: 5/27/2024
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloWorld</title>
</head>
<body>
<h1>HelloWorld spring mvc</h1>
<h2>Student name : ${param.studentName}</h2>

<%--studentNmae sent from get method of form--%>

<h1>student name in uppercase : ${stdName}</h1>
<h1>student name in lowerCase : ${stdNameLowerCase}</h1>
<%--read from model --%>
</body>
</html>
