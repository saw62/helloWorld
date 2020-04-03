<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="java.util.Date"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' type='text/css' href='style.css'>
</head>
<body>
	<h1>Veuillez vous authentifier</h1>
	<h2><%=new Date()%></h2>

	<%
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		if (login == null) login = "";
		if (password == null) password = "";
		
		if (request.getMethod().equals( "POST") && login.equals("bond") && password.equals("007")){
	%>
		<p style="color:green;">welcom <%= login %><p>
	<% } else { %>

	<form method="post">

		<label for='txtLogin'> Login : </label> <input id='txtLogin'
			name='txtLogin' type='text' value='<%= login %>' autofocus /> <br /> <label
			for='txtPassword'> Password : </label> <input id='txtPassword'
			name='txtPassword' type='password' value='<%= password %>' /> <br /> <br /> <input
			name='BtnConnect' type='submit' /> <br />

	</form>
	
	<% } %>
</body>
</html>