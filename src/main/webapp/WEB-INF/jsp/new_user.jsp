<%@ page import="elosztott.model.NewUserRequest" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: makra
  Date: 2016. 09. 26.
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css"/>
</head>
<body>

<select onchange="location = this.value">
    <option>Themes</option>
    <option value="/admin/new_user?theme=default">Default</option>
    <option value="/admin/new_user?theme=blue">Blue</option>
    <option value="/admin/new_user?theme=red">Red</option>
</select>

<h1><spring:message code="messages.user.title"/></h1>

<form th:action="@{/new_user}" th:object="${userForm}" method="post">
    <spring:message code="messages.user.name"/>:
    <input type="text" th:field="*{username}" name="Username"><br>
    <%--<span th:if= "${#fields.hasErrors("username")}" th:errors="*{name}">Name Error</span>--%>
    <spring:message code="messages.user.education"/>:
    <select path="vegzettseg">
        <option value="ELEM"><spring:message code="messages.user.education.elementary"/></option>
        <option value="HIGH"><spring:message code="messages.user.education.highschool"/></option>
        <option value="COLLEGE"><spring:message code="messages.user.education.college"/></option>
        <option value="UNI"><spring:message code="messages.user.education.university"/></option>
    </select>
    <spring:message code="messages.user.color"/>:
    <input type="checkbox" path="color" value="blue"><spring:message code="messages.user.color.blue"/><br>
    <input type="checkbox" path="color" value="red"><spring:message code="messages.user.color.red"/><br>

    <spring:message code="messages.user.gender"/>:
    <input type="radio" path="gender" value="male"><spring:message code="messages.user.gender.male"/><br>
    <input type="radio" path="gender" value="female"><spring:message code="messages.user.gender.female"/><br>

    <input type="submit" value="Submit">
</form>
</body>
</html>