<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
session.removeAttribute("uname");
session.invalidate();
%>
<h1>You has been successfully Logout!</h1>
<a href="input.jsp">Login Again</a>
</body>
</html>