<%--
  Created by IntelliJ IDEA.
  User: makra
  Date: 2016. 09. 26.
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Status</title>
</head>
<body>

<a href="/admin/new_user">New user</a>

<c:forEach items="${users}" var="user">
    <li>${user}</li>
    <input type="checkbox" value="${user}"/>
</c:forEach>

</body>
</html>
