<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thong tin san pham</title>
<link
	href="${pageContext.servletContext.contextPath }/resouces/css/style.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/resouces/js/demo.js"></script>
</head>
<body>

	<table cellpadding="2" cellspacing="2">
		<tr>
			<td>Ma san pham:</td>
			<td>${sp.masp }</td>
		</tr>
		<tr>
			<td>Ten san pham:</td>
			<td>${sp.tensp }</td>
		</tr>
		<tr>
			<td>Gia san pham:</td>
			<td>${sp.gia }</td>
		</tr>
		<tr>
			<td>So luong san pham:</td>
			<td>${sp.soluong }</td>
		</tr>
		<tr>
			<td>Anh san pham:</td>
			<td><img alt=""
				src="${pageContext.servletContext.contextPath }/resouces/images/${sp.hinhanh }" onclick="clickme()">
			</td>
		</tr>
		<tr>
			<td>Ngay san xuat:</td>
			<td><fmt:formatDate var="ngaysx" value="${sp.mgaysx }" pattern="dd/MM/yyyy"/>${ngaysx }</td>
		</tr>
	</table>
		<a href="${pageContext.request.contextPath}/sanpham/danhsachsanpham.html"> Show me</a>

</body>
</html>