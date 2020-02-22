<html>
<body>
   Page1<br>
   <%
      String u = (String)request.getAttribute("uname");
      String p = (String)request.getAttribute("pw");
      out.write(u+", "+p);      
   %>
</body>
</html>