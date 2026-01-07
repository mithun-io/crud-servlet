<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List, mvc.entity.Employee"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
	<h1>${message}</h1>
	<table border=1px cellspacing="0px" cellpadding="10px">
		<tr>
			<th>name</th>
			<th>job</th>
			<th>salary</th>
			<th>hiredate</th>
			<th>action</th>
		</tr>
	
		<%
		List<Employee> employee = (List) request.getAttribute("employees");
		for (Employee e : employee) {
		%>
	
		<tr>
			<td><%=e.getName()%></td>
			<td><%=e.getJob()%></td>
			<td><%=e.getSalary()%></td>
			<td><%=e.getHiredate()%></td>
			<td>
				<a href="edit?id=<%=e.getId()%>">
					<button>edit</button>
				</a>
				<a href="delete?id=<%=e.getId()%>">
					<button>delete</button>
				</a>
			</td>
		</tr>
	
		<%
		}
		%>
	</table>
</body>
</html>