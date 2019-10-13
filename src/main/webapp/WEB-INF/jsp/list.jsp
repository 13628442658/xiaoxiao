<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="toadd">添加</a>
	<table>
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
		</tr>
		<c:forEach items="${list }" var="s">
		<tr>
			<td>${s.sid }</td>
			<td>${s.sname }</td>
			<td>${s.age }</td>
			<td>${s.sex }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>