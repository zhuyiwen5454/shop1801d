<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="table">
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<c:forEach items="${list}" var="brand">
		<tr>
			<td>${brand.id}</td>
			<td>${brand.name}</td>
			<td></td>
			<td></td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>