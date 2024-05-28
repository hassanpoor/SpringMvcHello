<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dotin
  Date: 5/27/2024
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

<form:form modelAttribute="submitStudent" action="confirmStudentData">
    First Name <form:input path="fname"/></br>
    <form:errors path="fname" cssClass="ui-state-error"/>

    last name <form:input path="lname"/></br>
    country <form:select path="conutry">
    <%--        <form:options items="${submitStudent.countryOptions}"/>--%>
    <form:options items="${theCountryOptions}"/>

    <form:radiobuttons path="favoriteProgrammingLanguage" items="${programmingLanguage}"/>
</form:select>
    <input type="submit"></br>
    <ul>
        <c:forEach var="temp" items="${operatingSystemMap.keySet()}">
            <li>${operatingSystemMap.get(temp)}:
                <form:checkbox path="operatingSystem" item="${operatingSystemMap.get(temp)}"
                               value="${operatingSystemMap.get(temp)}"/>
                <form:errors path="operatingSystem" cssClass="ui-state-error"/>
            </li>

        </c:forEach>
    </ul>

</form:form>
</body>
</html>
