<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="../saveEdit" method="post" modelAttribute="stud">
    <table border="1px">
       <tr>
         <td>UID</td>
         <td><form:hidden path="sid"/></td>
       </tr>   
       <tr>
         <td>NAME</td>
         <td><form:input path="name"/></td>
       </tr> 
       <tr>
         <td>AGE</td>
         <td><form:input path="age"/></td>
       </tr> 
       <tr>
         <td><input type="submit" value="SAVE STUDENT"/></td>
       </tr>     
    </table>
</form:form>
</body>
</html>