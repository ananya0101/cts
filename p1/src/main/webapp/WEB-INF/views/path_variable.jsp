<body>
   Page1<br>
   <%
      String name = (String)request.getAttribute("empname");
      int age = (Integer)request.getAttribute("empage");
      out.write(name+", "+age);      
   %>
</body>