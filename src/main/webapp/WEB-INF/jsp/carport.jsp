<%@page import="java.sql.Date"%>
<%@ page import="com.njau.util.DateTimeUtil " %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<c:import url="common.jsp"></c:import>
	<link rel="stylesheet" type="text/css" href="static/css/page1.css">
	<title>车位为管理</title>
	<style type="text/css">
	.activP {
		background-color: #367fa9 !important;
		color: #fff !important;
		/*border-radius: ;*/
	}
	</style>
</head>
<body>
<table class="table table-bordered table-hover" id="table1">
	<tr class="tr">
		<td class="cus" id="cus2">姓名</td>
		<td class="cus" id="cus3">使用状态</td>
		<td>所属区域</td>
		<td>购买时间</td>
	</tr>
	<%
			int num = 0;
			long d=System.currentTimeMillis();
			Date date=new Date(d);
		%>
	<c:forEach var="inv" items="${carportlist}">
		<%
			num++;
		%>
		<tr>
			<td id="cid<%=num%>">${inv.userName }</td>
			<td id="uid<%=num%>">${inv.state }</td>
			<td id="content<%=num%>">${inv.zoneId }</td>
			<td id="statedate<%=num%>">${DateTimeUtil.parse(inv.buytime)}</td>
		</tr>
	</c:forEach>
	</table>
	<div class="pageTest" style="text-align: center;"></div>
	<script src="static/js/complain.js"></script>
	<script type="text/javascript" src="static/js/page.js"></script>
	<script type="text/javascript" src="static/js/carseat.js"></script>

</body>
</html>