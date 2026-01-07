<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
</head>
<body>
	<div align="center">
		<form method="post">
			<h1>employee details</h1>
			<input type="text" name="name" placeholder="enter employee name" required> <br><br>
			<input type="text" name="job" placeholder="enter employee job" required> <br><br>
			<input type="text" name="salary" placeholder="enter employee salary" required> <br><br>
			<input type="date" name="hiredate" required> <br><br>
						
			<button formaction="add">add</button>
		</form>
	</div>
</body>
</html>