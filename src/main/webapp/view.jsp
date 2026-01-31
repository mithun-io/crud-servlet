<%@page import="com.entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
	<div align="center">
	<h1>${message}</h1>
		<table border=1px cellspacing=0px cellpadding=15px>
			<tr>
				<th>name</th>
				<th>email</th>
				<th>password</th>
				<th>dob</th>
				<th>action</th>
			</tr>
			<%
			List<User> users = (List) request.getAttribute("users");
			for (User user : users) {
			%>
			<tr>
				<td><%=user.getName()%></td>
				<td><%=user.getEmail()%></td>
				<td><%=user.getPassword()%></td>
				<td><%=user.getDob()%></td>
				<td>
					<a href="edit?id=<%=user.getId()%>">
						<button>edit</button>
					</a>
					<a href="delete?id=<%=user.getId()%>">
						<button>delete</button>
					</a>
				</td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
</body>
</html>
