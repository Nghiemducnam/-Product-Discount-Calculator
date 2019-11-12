<%--
  Created by IntelliJ IDEA.
  User: T_135
  Date: 11/12/2019
  Time: 8:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form method="post" action="/calculate">
      <label>Production description: </label>
      <input id = "ip1" type = "text" name = "Production description" /><br/>
      <label>List price: </label>
      <input type = "text" name = "List price" /><br/>
      <label>Discount percent (%): </label>
      <input type = "text" name = "Discount percent" /><br/>
      <input type = "submit" value = "Calculate discount"/>
    </form>
  </body>
</html>
