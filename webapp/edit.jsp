<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit</title>
</head>
<body>
	<div align="center">
		<form action="update" method="post">
			<input type="hidden" name="id" value="${employee.id}" required> <br><br>
			<input type="text" name="name" value="${employee.name}" required> <br><br>
			<input type="text" name="job" value="${employee.job}" required> <br><br>
			<input type="text" name="salary" value="${employee.salary}" required> <br><br>
			<input type="date" name="hiredate" value="${employee.hiredate}" required> <br><br>
		
			<button>edit</button>
		</form>
	</div>
</body>
</html>