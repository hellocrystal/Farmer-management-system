<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	System.out.println(basePath);
%>

<!DOCTYPE>
<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<title>修改界面</title>

<!-- 引用bootstrap样式 -->
<c:import url="common.jsp"></c:import>

<script type="text/javascript" src="static/js/regist.js"></script>
<style type="text/css">
.t1 {
	width: 80px;
	height: 20px;
	text-align: center;
	line-height: 1000px;
}

.t2 {
	height: 20px;
}

.bb1 {
	background-image: url('static/image/bg.jpg');
	background-size: 100% 100%;
	background-attachment: fixed;
	width: 100%;
}
td,h1{
	color:white;
}
</style>
</head>
<body class="bb1" onload="show_1()">
<h1 style="text-align: center; margin: 20px auto;"> 业主信息修改</h1>


<form action="savaowners.action" method="post" id="form1">
	<div style="width: 500px; margin: 20px auto; font-size: 18px;">
		<table class="table table-hover">
			<tr>
				<td class="t1" style="line-height: 33px;width: 120px;">业主姓名</td>
				<td class="t2"><input id="oname" value="${owner.name }" type="text"
									  class="form-control" name="name" placeholder="姓名"
									  required="required"/> <span id="mes"
																  style="font-size: 12px; color: red"></span></td>
			</tr>
			<tr>
				<td class="t1" style="line-height: 33px;">新密码</td>
				<td class="t2"><input id="pass1" type="password"
									  class="form-control" name="password" value="${owner.password }" placeholder="密码"
									  required="required"/></td>
			</tr>
			<tr>
				<td class="t1" style="line-height: 33px;">确认密码</td>
				<td class="t2"><input type="password" id="pass2"
									  class="form-control" name="pass2" value="${owner.password }" placeholder="确认密码"
									  required="required"/></td>
			</tr>
			<tr>
				<td class="t1" style="line-height: 33px;">电话</td>
				<td class="t2"><input id="otel" type="text" maxlenth="11"
									  name="phone" value="${owner.phone }" onblur="checkMobile(this.value)"
									  class="form-control"
									  placeholder="电话号码"/></td>
			</tr>
			<tr>
				<td class="t1" style="line-height: 33px;">身份证号码</td>
				<td class="t2"><input id="oidentity" type="text"
									  name="idcard" value="${owner.idcard }" class="form-control" placeholder="身份证号码 "
									  required="required"/></td>
			</tr>

		</table>
		<div style="text-align: center;">
			<input type="submit" onclick="check()" class="btn btn-default"
				   style="width: 100px; height: 40px;" value="提交"></input>
		</div>
	</div>
</form>
</body>
</html>