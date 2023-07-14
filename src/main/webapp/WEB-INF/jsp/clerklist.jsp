<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="com.njau.util.DateTimeUtil " %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>职员页面</title>
    <c:import url="common.jsp"></c:import>
    <link rel="stylesheet" type="text/css" href="statics/css/bootstrap.css"/>
    <style type="text/css">
        li {
            float: left;
            list-style: none;
            padding-left: 25px;
        }
    </style>

</head>
<body>
<div style="margin: 0 10%">
    <form action="clerkdelete.action" method="post">
        <table class="table  table-hover " id="dataTable">
            <tr style="background-color: #F0AD4E">
                <th><input type="checkbox"></th>
                <th>用户名</th>
                <th>职员姓名</th>
                <th>职员性别</th>
                <th>职员部门</th>
                <th>职员上班时间</th>
                <th>职员下班时间</th>
                <th>职员工资</th>
                <th>职员奖金</th>
                <th>职员电话</th>
                <th>职员密码</th>
                <%--                <th>操作</th>--%>
            </tr>
            <c:forEach var="fac" items="${pageResult.content}">
                <tr>
                    <td style="vertical-align: middle;"><input name="username"
                                                               type="checkbox" value="${fac.username }"></td>
                    <td style="vertical-align: middle;">${fac.name }</td>
                    <td style="vertical-align: middle;">${fac.username }</td>
                    <td style="vertical-align: middle;">${fac.sex }</td>
                    <td style="vertical-align: middle;">${fac.department }</td>
                    <td style="vertical-align: middle;">${DateTimeUtil.parse(fac.officetime,"hh:MM") }</td>
                    <td style="vertical-align: middle;">${DateTimeUtil.parse(fac.quittime,"hh:MM") }</td>
                    <td style="vertical-align: middle;">${fac.salary }</td>
                    <td style="vertical-align: middle;">${fac.bonus }</td>
                    <td style="vertical-align: middle;">${fac.phone }</td>
                    <td style="vertical-align: middle;">${fac.password }</td>
                        <%--                    <td><input--%>
                        <%--                            onclick="location.href='clerkupdate.action?username=${fac.username }'"--%>
                        <%--                            value="修改" type="button" class="btn btn-info"/></td>--%>
                </tr>
            </c:forEach>
            <tr align="center">
                <td colspan="12">
                    <input class="btn btn-success" onclick="location.href='clerkadd.action'" value="添加" type="button"/>
                    <%--                    <input value="删除" type="submit" class="btn btn-danger"/></td>--%>
            </tr>
        </table>
    </form>
</div>
<script src="statics/js/jquery.js" type="text/javascript" charset="utf-8"></script>
<script src="statics/js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
<script src="statics/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="statics/js/list.js" type="text/javascript" charset="utf-8"></script>
</body>
</html>