<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.guillen.gamarrapp.model.Tienda" %>
<%@ page import="java.util.List,java.util.ArrayList,java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if(session.getAttribute("username")==null){
			response.sendRedirect("index.jsp");
		}
	%>
	Hello! ${username}
	
	<form action="LogoutServlet" method="post">
		<input type="submit" value="Logout">
	</form>
	<a href="enlaces.jsp">Enlaces</a>

</body>
</html>