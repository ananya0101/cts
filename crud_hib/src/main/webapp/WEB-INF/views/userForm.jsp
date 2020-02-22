<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<a href="index.jsp">HOME</a><br><br>
<body>
   <form:form action="saveUser" method="post" modelAttribute="user">
       <table>
            <tr>
              <td>Sid</td>
              <td><form:input path="sid"/></td>
           </tr>
           <tr>
              <td>Name</td>
              <td><form:input path="name"/></td>
           </tr>
           <tr>
              <td>Age</td>
              <td><form:input path="age"/></td>
           </tr>           
           <tr><td><input type="submit"  value="SUBMIT"/></td></tr>           
       </table>
   </form:form>   
</body>
</html>