<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
listusers<br>
<br>
<table border="2px">
   <tr>
    <th>ID</th>
    <th>NAME</th>
    <th>AGE</th>
   </tr>
   <c:forEach var="l" items="${list }">
    <tr>
      <td>${l.sid}</td>
      <td>${l.name}</td>
      <td>${l.age}</td>
    </tr>
   </c:forEach>
</table>
</body>
</html>
