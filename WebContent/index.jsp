<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Login</h1>

<form action="MainServlet" method="post">

 <label>Username:</label><input name="User" type="text">
  <label>Password:</label><input name="Pass" type="password">
  <input type="submit" value="Iniciar Seccion">
</form>

</body>
</html>