<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="c" uri="<a class="vglnk" href="http://java.sun.com/jsp/jstl/core"%" rel="nofollow"><span>http</span><span>://</span><span>java</span><span>.</span><span>sun</span><span>.</span><span>com</span><span>/</span><span>jsp</span><span>/</span><span>jstl</span><span>/</span><span>core</span><span>"%</span></a>>
 --%><html>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>AccessDenied page</title>
</head>
<body>
    Dear <strong>${user}</strong>, You are not authorized to access this page
    <a href="<c:url value="/logout" />">Logout</a>
</body>
</html>