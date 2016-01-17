<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: RAYANT
  Date: 12.01.2016
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Hello!!</h1>

<div class="nav-collapse collapse">
  <sec:authorize access="isAuthenticated()" var="isAuthenticated">

    <p class="navbar-text pull-right">
      Вы вошли как: <a href="#" class="navbar-link">
        <sec:authentication property="principal.username"/>
    </p>

    <ul class="nav">
      <li>
        <a href="/admin">Паналь управления</a>
      </li>
      <li><a href="/logout">Выйти</a></li>
    </ul>
  </sec:authorize>
  <c:if test="${!isAuthenticated}">
    <li><a href="/login">Войти</a></li>
  </c:if>

  <c:forEach var="user" items="${users}" >
 <div>
     ${user.login}
 </div>
  </c:forEach>

</div>
</body>
</html>
