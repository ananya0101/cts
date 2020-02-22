<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	   <tr>
	      <td>User Name:</td>
	      <td>${user.userName}</td>
	   </tr>
	   <tr>
	      <td>Age:</td>
	      <td>${user.age}</td>
	   </tr>
	   <tr>
	      <td>Emil:</td>
	      <td>${user.emil}</td>
	   </tr>
	</table>
	<a href="registerForm">BACK</a>
</body>
</html>