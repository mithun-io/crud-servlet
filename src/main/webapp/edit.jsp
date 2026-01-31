<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit</title>
</head>
<body>
	<div align="center">
		<form action="update" method="post">
			<input type="hidden" name="id" value="${user.id}">
			<input type="text" name="name" value="${user.name}">
			<input type="email" name="email" value="${user.email}">
			<input type="password" name="password" value="${user.password}"> 
			<input type="date" name="dob" value="${user.dob}">
			<button>edit</button>
		</form>
	</div>
</body>
</html>