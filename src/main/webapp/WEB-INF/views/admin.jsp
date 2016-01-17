<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: RAYANT
  Date: 17.01.2016
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:forEach var="cloth" items="${clothList}" >
  <div>
   <h2>Артикул: ${cloth.sku}</h2>
   <h2>Номер заказа: ${cloth.order.id}</h2>
   <h2>Цена полная: ${cloth.totalPrice}</h2>
   <h2>Цена за метр: ${cloth.totalPrice}</h2>
   <h2>Длина: ${cloth.length}</h2>
   <h2>Ширина: ${cloth.width}</h2>
    <img src="${cloth.src}" width="200px" height="200px">
  </div>
  <br>
</c:forEach>
</body>
</html>
