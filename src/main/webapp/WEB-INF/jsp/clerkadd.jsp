<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE>
<html>
<head>
<title>添加职员信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<c:import url="common.jsp"></c:import>
</head>

<body>
<div style="text-align: left; width: 700px; margin: 0 auto;height: 1000px">
	<form action="clerkaddsave.action" method="post">
		<div class="form-group">
			<label for="username">职员用户名</label>
			<input type="text" class="form-control" id="username" name="username" placeholder="请输入职员用户名">
		</div>
		<div class="form-group">
			<label for="password">密码</label>
			<input type="text" class="form-control" id="password" name="password" placeholder="请输入密码">
		</div>
		<div class="form-group">
			<label for="name">职员性名</label> <input type="text" class="form-control"
												  id="name" name="name" placeholder="请输入职员性名">
		</div>
		<div class="form-group">
			<label for="sex">职员性别</label>
			<select id="sex" type="text" class="form-control"
					name="sex">
				<option value="男">男</option>
				<option value="女">女</option>

			</select>
		</div>
		<div class="form-group">
			<label for="dno">部门</label>
			<select id="dno" type="text" class="form-control"
					name="dno">
				<c:forEach var="department" items="${departments }">
					<option value="${department.dno }">${department.deptName }</option>
				</c:forEach>
			</select>
		</div>
		<div class="form-group">
			<label for="officeTime">职员上班时间</label> <input type="time" class="form-control"
														  id="officeTime" name="officeTime" placeholder="请输入职员上班时间"
														  value="09:00">
		</div>
		<div class="form-group">
			<label for="quitTime">职员下班时间</label> <input type="time" class="form-control"
														id="quitTime" name="quitTime" placeholder="请输入职员下班时间"
														value="18:00">
		</div>
		<div class="form-group">
			<label for="salary">职员工资</label>
			<input type="number" class="form-control" id="salary" name="salary" placeholder="请输入职员工资">
		</div>
		<div class="form-group">
			<label for="bonus">职员奖金</label> <input type="number" class="form-control"
												   id="bonus" name="bonus" placeholder="请输入职员奖金">
		</div>
		<div class="form-group">
			<label for="phone">职员电话</label> <input type="text" class="form-control"
												   id="phone" name="phone" placeholder="请输入职员电话">
		</div>
		<button type="submit" class="btn btn-success">提交</button>
	</form>
</div>
</body>
</html>
