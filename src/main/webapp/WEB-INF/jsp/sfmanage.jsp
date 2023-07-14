<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="common.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center;">收费列表</h1>
	<div style="width: 60%; margin: 0 auto">
		<table class="table table-hover table-bordered">
			<c:forEach items="${list}" var="item">
                <tr>
                    <td>缴费项目：${item.name}</td>
                    <td>金额：${item.money}</td>
                </tr>
            </c:forEach>
		</table>
		<button class="btn btn-success" onclick="showadd()">增加收费项目</button>
	</div>
	<div
		style="width: 40%; margin: 0 auto; display: none; position: absolute; top: 100px; left: 400px; background-color: #F1F3F4;"
		id="adddiv">
		<form id="addform" action="addbillitem.action" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">缴费项目：</label> <input type="text"
                                                                     class="form-control" id="exampleInputEmail1"
                                                                     required="required"
                                                                     name="name">
            </div>
			<div class="form-group">
				<label for="exampleInputPassword1">金额：</label> <input type="number"
                                                                      class="form-control" id="exampleInputPassword1"
                                                                      required="required"
                                                                      name="money">
            </div>
				<div style="width: 30%; text-align: center; position: relative;">
				<button type="submit" class="btn btn-success btn-lg btn-block"
					style="position: absolute; left: 50px;top:10px">确定</button>
				<input onclick="quxiao()" type="button"
					class="btn btn-warning btn-lg btn-block"
					style="position: absolute; left: 350px;" value="取消">
			</div>
		</form>
	</div>
<script type="text/javascript" src="static/js/addbillitem.js"></script>
</body>
</html>