<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.njau.util.DateTimeUtil " %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<html>
<head>
    <meta charset="UTF-8">
    <title>业主管理界面</title>
    <link rel="stylesheet" type="text/css" href="static/css/bootstrap.css"/>
    <link rel="stylesheet" href="static/css/layui.css"
          media="all">
    <link rel="stylesheet" type="text/css" href="static/css/page.css">
    <link rel="shortcut icon" type="image/x-icon" href="static/img/hlogo.ico"/>
</head>
<link rel="stylesheet" type="text/css" href="static/css/bootstrap.css">
<style type="text/css">
    * {
        margin: 0;
        padding: 0;
}

.left-side-menu {
	height: 100%;
	float: left;
}

.iframe1 {
	float: left;
}

body html {
	background-color: white;
}

.customer {
	width: 100%;
	height: 50%;
}

.iframe1 {
	scrolling: no;
}

input[type='text'] {
	width: 100px;
}

.operation {
	text-align: center;
}

table,th,td {
	text-align: center;
}

.pageTest {
	height: 50px;
	text-align: center;
	margin-top: 20px;
	padding-right: 50%;
}

.activP {
	background-color: #367fa9 !important;
	color: #fff !important;
}

.paging {
	width: 100%;
	height: 40px;
	padding-left: 8%;
	text-align: center;
	margin-top: 10px;
}

.paging a {
	margin: 0;
	float: left;
	text-align: center;
	line-height: 40px;
	font-size: 18px;
	width: 40px;
	height: 40px;
	cursor: pointer;
	display: block;
	border: 1px solid black;
	margin-right: 3px;
}

.form-control {
	width: 182.8px;
}

.cus, th {
	cursor: pointer;
}
</style>

<body>

	<div>
		<!-- <span class="icon iconfont"></span> -->
		<form action="save.action" id="form1" method="get"></form>
		<table class="table table-bordered table-hover">
			<tr class="info">
				<th><input type="checkbox" id="selectAll" onclick="checkedAll(this)"></th>
				<th class="cus" id="cus1">业主编号<span class="icon iconfont"></span></th>
				<th class="cus" id="cus2">业主姓名<span class="icon iconfont"></span></th>
				<th>业主密码</th>
				<th>业主楼号</th>
				<th>业主门牌</th>
				<th>业主电话</th>
				<th>身份证号码</th>
				<th>注册时间</th>
<%--				<th>操作</th>--%>
			</tr>
			<%
				int num = 0;
			%>
			<c:forEach var="inv" items="${list }">
                <%
                    num++;
                %>
                <tr>
					<td><input name="oids" type="checkbox" class="selectOne"
							   value="${inv.username }" onclick="setcheckedAll(this)" form="form1"></td>
					<td id="oid<%=num%>">${inv.username }</td>
					<td id="oname<%=num%>"><a href="findById.action?oid=${inv.username }"
											  id="aoname<%=num%>">${inv.name }</a></td>
					<td id="opass<%=num%>">${inv.password }</td>
					<td id="towernum<%=num%>">${inv.zone }</td>
					<td id="odoorplate<%=num%>">${inv.roomId }</td>
					<td id="otel<%=num%>">${inv.phone }</td>
					<td id="oidentity<%=num%>">${inv.idcard }</td>
					<td id="oiputdate <%=num%>">${DateTimeUtil.parse(inv.registTime) }</td>
<%--					<td id="amend"><input id="amend"--%>
<%--										  onclick="amend(<%=num%>)" value="修改" type="button"--%>
<%--										  class="btn btn-warning"> <input type="button" value="删除"--%>
<%--																		  class="btn btn-danger" id="deleteone"--%>
<%--																		  onclick="deleteone(${inv.username})"/></td>--%>
				</tr>
			</c:forEach>
		</table>
<%--		<div class="operation">--%>
<%--			<input type="submit" value="删除" class="btn btn-danger" id="delete"--%>
<%--				   onclick="deleteAll.action"/>--%>
<%--			<input type="hidden" value="保存" class="btn btn-success" id="save" form="form1"/>--%>
<%--			<input type="button" value="添加" class="btn btn-danger" id="add"--%>
<%--				   onclick="location.href='signin.action'"/>--%>


<%--			<div class="paging" id="paging">--%>
<%--				<c:forEach var="i" begin="1" end="${count }" varStatus="status">--%>
<%--					<a href="customer.action?num=${(status.index-1)*5}&ustate=1&rid=1&way=1">${status.index}</a>--%>
<%--				</c:forEach>--%>
<%--			</div>--%>
<%--		</div>--%>
	</div>

	<script src="static/js/jquery.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="static/js/bootstrap.js" type="text/javascript"
		charset="utf-8"></script>
	<script src="static/js/customer.js" type="text/javascript"
		charset="utf-8"></script>

	<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="static/js/page.js"></script>
	<script type="text/javascript" src="static/js/bootstrap.js"></script>
</body>
</html>