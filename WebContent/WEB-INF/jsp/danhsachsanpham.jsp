<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="${pageContext.servletContext.contextPath }/resouces/css/style.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript"
	src="${pageContext.servletContext.contextPath }/resouces/js/demo.js"></script>
</head>
<body>

	<table cellpadding="2" cellspacing="2" border="1">
		<tr>
			<th>Ma san pham</th>
			<th>Ten san pham</th>
			<th>Hinh anh</th>
			<th>Gia</th>
			<th>So luong</th>
			<th>Thanh tien</th>
			<th>Tuy chon</th>
		</tr>
		<c:forEach var="sp" items="${dssp }">
			<tr>
				<td>${sp.masp }</td>
				<td>${sp.tensp }</td>
				<td><img alt=""
					src="${pageContext.servletContext.contextPath }/resouces/images/${sp.hinhanh }"
					onclick="clickme()"></td>
				<td>${sp.gia }</td>
				<td>${sp.soluong }</td>
				<td></td>
				<td><a
					href="${pageContext.request.contextPath}/sanpham/chitiet/${sp.masp }.html">
						Chi tiet</a></td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>