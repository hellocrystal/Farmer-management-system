<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="common.jsp"></c:import>
<title>Insert title here</title>

<style type="text/css">
#sendmessdiv {
	width: 350px; /**宽度**/
	height: 350px; /**高度**/
	position: fixed; /**绝对定位**/
	left: 50%; /**左边50%**/
	top: 20%; /**顶部20%**/
	margin-top: -50px; /**上移-50%**/
	margin-left: -100px; /**左移-50%**/
	z-index: 10;
	background-image: linear-gradient(120deg, #a1c4fd 0%, #c2e9fb 100%);
	display: none;
}

li {
	float: left;
	list-style: none;
	padding-left: 25px;
}

.form-group {
	margin-left: 20px;
}
</style>
</head>
<body>
	<h2 style="text-align: center; margin-bottom: 50px; margin-top: 30px;">未缴纳相关费用业主列表</h2>
	<div style="height: auto">
		<div style="width: 60%; margin: 50px auto">
			<c:forEach items="${list}" var="owner">

				<h5 style="float: left; margin-right: 20px">业主姓名：${owner.name}</h5>
				<h5>业主电话：${owner.phone}</h5>
				<table class="table table-hover table-bordered">
					<c:forEach items="${owner.bill}" var="b">
						<tr>
							<td>缴费项目：${b.name}</td>
							<td>金额：${b.money}</td>
							<td>账单时间：${b.time}</td>
							<td>状态：
								<p style="color: red; display: inline-block;">${b.status}</p>
							</td>
						</tr>
					</c:forEach>
					<tr>
						<td>总待缴纳金额：￥${owner.total}</td>
						<td id="td${owner.username}">
							<button
									class="btn btn-warning btn-lg" onclick="pressPayment('${owner.username}')">催缴款
							</button>
						</td>
					</tr>
				</table>
			</c:forEach>
		</div>
		<div id="sendmessdiv">
			<input style="display: none;" id="oid">
			<div class="form-group">
				<label for="ownername">接收人：</label> <input type="text"
					class="form-control" id="ownername" required="required"
					readonly="readonly" name="hnumber">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">消息内容：</label>
				<textarea placeholder="请输入通知内容" class="form-control" rows="3"
					style="font-family: fantasy;" name="textarea" id="messinfo"></textarea>
			</div>
			<div style="width: 30%; text-align: center; position: relative;">
				<button type="submit" class="btn btn-success btn-lg btn-block"
					style="position: absolute; left: 40px; top: 10px"
					onclick="sendmess()">发送</button>
				<input onclick="quxiao()" type="button"
					class="btn btn-warning btn-lg btn-block"
					style="position: absolute; left: 200px;" value="取消">
			</div>
		</div>
	</div>
	<script type="text/javascript" src="static/js/search.js"></script>
	<script type="text/javascript" src="static/js/cuikuan.js"></script>
</body>

<script>

	function pressPayment(username) {
		// let q = $("#td" + username);
		// q.html("已催款");
		// q.css("color", "red");
		// q.css("font-size", "26px");
		$.ajax({
			url: 'cuikuan.action',
			data: {
				username: username
			},
			type: 'post',
			dataType: 'text',
			success: function (res) {
				console.log(res.data);
				let q = $("#td" + username);
				q.html("已催款");
				q.css("color", "red");
				q.css("font-size", "26px");
			},
			error: function (xhr, errorMessage, e) {
				alert('催款失败');
			}
		})
	}

</script>

</html>