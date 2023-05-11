<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s1" class="com.model.Student"></jsp:useBean>
<jsp:setProperty property="sid" name="s1" value="123"/>
<jsp:setProperty property="sname" name="s1" value="Shubham"/>
<jsp:setProperty property="city" name="s1" value="Bhopal"/>

<table border="1">
<tr>
<th>Sid</th>
<th>Sname</th>
<th>City</th>
</tr>
<tr>
<td><jsp:getProperty property="sid" name="s1"/></td>
<td><jsp:getProperty property="sname" name="s1"/></td>
<td><jsp:getProperty property="city" name="s1"/></td>

</tr>
</table>

</body>
</html>