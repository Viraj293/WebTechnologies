<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!int a =10, b= 20; %>
<%
int z = 100;
out.println("The substraction is .."+(a*b));
%>
<br>
<%= "sum is ...."+(a+b)%>
<br>
<%="The Z is ..."+z %>
</body>
</html>