<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Tops Technologies</h1>
<h2>Tops Technologies</h2>
<h3>Tops Technologies</h3>
<h4>Tops Technologies</h4>

<%-- <jsp:forward page="index5.jsp">
<jsp:param value="shubham" name="username"/>
<jsp:param value="shubham123" name="password"/>
</jsp:forward> --%>

<jsp:include page="index5.jsp">
<jsp:param value="shubham" name="username"/>
<jsp:param value="shubham123" name="password"/>
</jsp:include>
</body>
</html>