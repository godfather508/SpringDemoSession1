<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Web</title>
</head>
<body>
Hello World
	<br>
	<a href="${pageContext.request.contextPath}/hello/show.html"> Show me</a>
	<br>
	Gia tri a la: ${a }
	<br>
	Gia tri username: ${username }
</body>
</html>