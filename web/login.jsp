<%--
  Created by IntelliJ IDEA.
  User: dangkhoa
  Date: 04/05/2018
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="POST">
    <h1 style="color: red">${message}</h1>
    <table>
        <tr>
            <td>Username</td>
            <td><input type="text" name="txtUsername" placeholder="Enter username" value=""/></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="txtPassword" placeholder="Enter password" value=""/></td>
        </tr>
        <tr>
            <td><input type="checkbox" name="chkRemember" value="ON"/>Remember to me</td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Login"/></td>
        </tr>
    </table>
</form>
</body>
</html>
