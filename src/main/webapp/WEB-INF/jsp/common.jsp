<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<c:set var="bp" value="<%=basePath%>"></c:set>
<!-- bootstrap css -->
<style type="text/css">
.state1, .state2, .state3 {
	font-weight: 700;
}

.state2 {
	color: #5CB85C;
}

.state1 {
	color: red;
}

.state3 {
	color: #EE9611;
}
td{
	text-align: center;
}
.btn{
	margin-left: 10px;
}
.table1{
	margin-top: 10%;
}
</style>
<link rel="stylesheet" href="${bp}/static/css/bootstrap.min.css">
<link rel="Shortcut Icon" href="static/image/wanlonglogo.ico" type="image/x-icon" />
<!-- modernizr js -->
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="${bp}/static/js/jquery.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="${bp}/static/js/bootstrap.min.js"></script>