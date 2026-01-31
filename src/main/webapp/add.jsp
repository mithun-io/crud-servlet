<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add</title>
</head>
<body>
	<div align="center">
		<form action="add" method="post">
			<input type="text" name="name" placeholder="enter your name"> 
			<input type="email" name="email" placeholder="enter you email">
			<input type="password" name="password" placeholder="enter your password"> 
			<input type="date" name="dob">
			<button formaction="add">add</button>
		</form>
	</div>
</body>
</html>