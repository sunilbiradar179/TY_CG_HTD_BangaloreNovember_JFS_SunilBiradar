<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h2>${msg}</h2>
	<form action="./login" method="post">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="Login"></td>
			</tr>
		</table>
		
		<a href="./register">Register</a>
		
	</form>
	
</body>
</html>