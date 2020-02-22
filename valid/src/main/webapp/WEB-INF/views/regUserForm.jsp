<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>   
  .error{
      color:red;
  }
</style>
</head>
<body>
	<form:form action="registerNewUser" method="post" modelAttribute="user">
	   <table>	      
	      <tr>
	        <td><form:label path="id">ID</form:label></td>
	        <td><form:input path="id"/></td>
	        <td><form:errors path="id" cssClass="error"></form:errors></td>
	      </tr>
	      <tr>
	        <td><form:label path="name">NAME</form:label></td>
	        <td><form:input path="name"/></td>
	        <td><form:errors path="name" cssClass="error"></form:errors></td>
	      </tr>
	      <tr>
	        <td><form:label path="email">EMAIL</form:label></td>
	        <td><form:input path="email"/></td>
	        <td><form:errors path="email" cssClass="error"></form:errors></td>
	      </tr>
	      <tr>
	        <td><input type="submit" value="SUBMIT"/></td>
	      </tr>
	   </table>
	</form:form>
</body>
</html>