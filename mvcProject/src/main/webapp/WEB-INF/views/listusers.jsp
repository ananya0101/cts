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
${list}<br>
<table border="2px">
   <tr>
    <th>ID</th>
    <th>NAME</th>
    <th>AGE</th>
   </tr>
   <c:forEach var="user" items="${list }">
    <tr>
      <td>${user.uid}</td>
      <td>${user.name}</td>
      <td>${user.age}</td>
    </tr>
   </c:forEach>
</table>
</body>
</html>
