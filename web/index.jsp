<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 15-10-19
  Time: 8:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1> Simple Calculator</h1>
<form action="calculator" method="post">


    <label>First operand :</label> <input type="text" name="txt_first"/></br>
    <label> Operator :</label> <select name="select_">
    <option value="+">Addition</option>
    <option value="-">Minus</option>
    <option value="*" >Multiply</option>
    <option value="/">Share</option>
             </select></br>
    <label> Second operand :</label> <input type="text" name="txt_second"/></br>
    <input type="submit" id="submit" value="Calculator">
</form>
</body>
</html>
