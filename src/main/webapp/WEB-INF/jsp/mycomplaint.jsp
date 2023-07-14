<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.njau.util.DateTimeUtil " %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="common.jsp"></c:import>
<title>投诉管理</title>
</head>
<body>
	<table class="table table-bordered table-hover">
		<tr class="">
			<td><input type="checkbox" id="selectAll"></td>
			<td class="cus" id="cus1">投诉编号</td>
			<td class="cus" id="cus3">投诉类型</td>
			<td class="cus" id="cus3">投诉内容</td>
			<td>投诉时间</td>
			<td>处理状态</td>
			<td>完成时间</td>
			<td>操作</td>
		</tr>
		<%
			int num = 0;
		%>
        <c:forEach var="inv" items="${mycomplaintlist }">
            <%
                num++;
            %>
            <tr>
                <td><input name="ids" type="checkbox" class="selectOne"
                           value="${inv.id }" form="form1"></td>
                <td id="cid<%=num%>">${inv.id }</td>
                <td id="cid<%=num%>">${inv.type }</td>
                <td id="content<%=num%>">${inv.content }</td>
                <td id="statedate<%=num%>">${DateTimeUtil.parse(inv.submitTime) }</td>
                <c:if test="${inv.state=='0' }">
                    <td id="state<%=num%>" class="state1">未处理</td>
                </c:if>
                <c:if test="${inv.state=='1' }">
                    <td id="state<%=num%>" class="state2">已处理</td>
                </c:if>
                <td id="enddate<%=num%>">${DateTimeUtil.parse(inv.handleTime) }</td>
                <c:if test="${inv.state=='0' }">
                    <td id="btn<%=num%>"><a class="btn btn-success" id="shipments">催促处理</a></td>
                </c:if>
                <c:if test="${inv.state=='1' }">
                </c:if>

            </tr>
        </c:forEach>
	</table>
	<script src="static/js/complain.js"></script>
</body>
</html>