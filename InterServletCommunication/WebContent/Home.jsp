<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Design_Login</title>
</head>
<body>

<div>
<jsp:include page="Header.jsp"></jsp:include>
</div>


<center><form action="home.app" method="post">
<table>
<tr>
	<td>User Name <input type="text" name="username" placeholder="Your user name" required/></td>
</tr><br/>

<tr>
	<td>Password <input type="password" name="password" placeholder="Enter your password" required/></td>
</tr><br/>

<tr><td><input type="submit" name="submit" value="Login" /></td>
</tr>
</table>
</form></center>


<div>
<jsp:include page="Footer.jsp"></jsp:include>
</div>

</body>
</html>