<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
  .error{
     color:red;
  }
</style>
</head>
<body>
    <h3>Employee Registration FORM</h3>
    <form:form action="saveEmployee" method="post" modelAttribute="employee"> 
        <table align="center" border="2px">
           <tr>
             <th>NAME</th>
             <td><form:input path="name"/></td>
             <td><form:errors path="name" cssClass="error"></form:errors></td>
           </tr>
           <tr>
             <th>AGE</th>
             <td><form:input path="age"/></td>
             <td><form:errors path="age" cssClass="error"></form:errors></td>
           </tr>
           <tr>
             <th>EMAIL</th>
             <td><form:input path="email"/></td>
             <td><form:errors path="email" cssClass="error"></form:errors></td>
           </tr>
           <tr>
           	 <th>Gender</th>
             <td>
                 <form:radiobutton path="gender" value="male" label="Male"/>
                 <form:radiobutton path="gender" value="female" label="FeMale"/>
             </td>
             <td><form:errors path="gender"  cssClass="error"></form:errors></td>
           </tr>
           <tr>
             <th valign="top">Skil</th>
             <td>
                <form:select path="skil" multiple="true">
                   <form:option value="JAVA">JAVA</form:option>
                   <form:option value="HTML">HTML</form:option>
                   <form:option value="TESTING">TESTING</form:option>
                </form:select>
             </td>
             <td>
                <form:errors path="skil" cssClass="error" />
             </td>
           </tr>
           <tr><td><input type="submit" value="OK"/></td></tr>
        </table>
    </form:form>
</body>
</html>