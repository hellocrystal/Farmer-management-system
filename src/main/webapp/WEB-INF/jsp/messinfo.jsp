<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="common.jsp"></c:import>
</head>
<body>
	<div style="width: 60%; margin: 50px auto">
		<h3 style="text-align: center;">我的通知</h3>
			<table class="table  table-bordered">
				<c:forEach items="${readlist}" var="read">
					<tr>
						<td>${read.content}</td>
						<td>${read.time}</td>
						<c:if test="${type eq '未阅读'}">
						<td><button class="btn btn-success" onclick="javascript:location.href='doread.action?messid=${read.id}'">已读</button></td>
						</c:if>
					</tr>
				</c:forEach>
			</table>
	</div>
	<c:if test="${not empty nomess }"><h2 style="text-align: center;">${nomess}</h2></c:if>
</body>
</html>