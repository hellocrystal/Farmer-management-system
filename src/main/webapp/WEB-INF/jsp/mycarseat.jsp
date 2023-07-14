<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="com.njau.util.DateTimeUtil " %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>我的车位</title>
    <c:import url="common.jsp"></c:import>
    <link rel="stylesheet" href="static/carcss/iconfont.css"/>
    <style type="text/css">
        .carseat {
            margin: 0 auto;
            border: 1px solid black;
            width: 800px;
            height: 560px;
        }

        .aseat, .bseat, .cseat, .dseat {
            margin: 0 auto;
            border: 1px solid black;
            width: 600px;
            height: 50px;
        }

        .green, .red, .blue {
            cursor: pointer;
            margin: 0 10px;
        }

        #A, #B, #C, #D {
            height: 60px;
            line-height: 60px;
            margin-top: 20px;
            margin-bottom: 20px;
            text-align: center;
        }

        #A {
            background-image: url("static/img/A.jpg");
        }

        #B {
            background-image: url("static/img/B.jpg");
        }

        #C {
            background-image: url("static/img/C.jpg");
        }

        #D {
            background-image: url("static/img/D.jpg");
        }

        .green span, .red span, .blue span {
            font-size: 40px;
        }

        .green span {
            background-color: green;
        }

        .red span {
            background-color: red;
        }

        .blue span {
            background-color: #1ABDE6;
        }

        .green {
            color: white;
        }

        .red {
            color: white;
        }

        h1 {
            text-align: center;
        }

        .blue {
            color: white;
        }

        h2, a, sellcardiv, h4 {
            text-align: center;
        }

        .btn {
            margin-left: auto;
            margin-right: auto;
            display: block;
        }

        #mry-opo-content {
            padding-top: 100px;
        }

        .myaddressimg {
            display: none;
            position: fixed;
            width: 400px;
        }
    </style>

</head>

<body>
<table class="table table-bordered table-hover">
    <tr class="">
        <td class="cus" id="cus1">车位编号</td>
        <td class="cus" id="cus2">车位所在区域</td>
        <td class="cus" id="cus3">车位价格</td>
        <td>购买时间</td>
    </tr>
    <%
        int num = 0;
    %>
    <c:forEach var="inv" items="${carport1 }">
        <%
            num++;
        %>
        <tr>
            <td id="cid<%=num%>">${inv.carportId }</td>
            <td id="zid<%=num%>">${inv.zoneId }</td>
            <td id="uid<%=num%>">${inv.price }万元</td>
            <td id="content<%=num%>">${DateTimeUtil.parse(inv.buytime)}</td>
        </tr>
    </c:forEach>
</table>
<h1><a class="blue"><span class="icon iconfont"></span></a>这是你自己车位的地方</h1>
<div class="carseat">
    <div id="A">
        <c:forEach var="inv" items="${A }">
            <c:if test="${inv.state=='0' }">
                <a class="green" title="未被占用" onclick=""><span class="icon iconfont"></span></a>
            </c:if>
            <c:if test="${inv.state!='0' }">
                <a class="red" title="已占用" onclick=""><span class="icon iconfont"></span></a>
            </c:if>
        </c:forEach>
    </div>
    <div class="aseat">
    </div>
    <div id="B">

        <c:forEach var="inv" items="${B }">
            <c:if test="${inv.state=='0' }">
                <a class="green" title="未被占用" onclick=""><span class="icon iconfont"></span></a>
            </c:if>
            <c:if test="${inv.state!='0' }">
                <a class="red" title="已占用" onclick=""><span class="icon iconfont"></span></a>
            </c:if>
        </c:forEach>
    </div>
    <div class="bseat">
    </div>
    <div id="C">

        <c:forEach var="inv" items="${C }">
            <c:if test="${inv.state=='0' }">
                <a class="green" title="未被占用" onclick=""><span class="icon iconfont"></span></a>
            </c:if>
            <c:if test="${inv.state!='0' }">
                <a class="red" title="已占用" onclick=""><span class="icon iconfont"></span></a>
            </c:if>
        </c:forEach>
    </div>
    <div class="cseat">
    </div>
    <div id="D">

        <c:forEach var="inv" items="${D }">
            <c:if test="${inv.state=='0' }">
                <a class="green" title="未被占用" onclick=""><span class="icon iconfont"></span></a>
            </c:if>
            <c:if test="${inv.state!='0' }">
                <a class="red" title="已占用" onclick=""><span class="icon iconfont"></span></a>
            </c:if>
        </c:forEach>
    </div>
</div>

<script type="text/javascript">
    function bigImg(e) {
        $(".myaddressimg").css("display", "block");
    }

    function normalImg(e) {
        $(".myaddressimg").css("display", "none");
    }
</script>

<%--这个是选择车的脚本 不能用在显示车位的jsp中--%>
<%--<script type="text/javascript" src="static/js/carseat.js"> </script>--%>

<script>

    <%--  查询当前自己的车位在哪  --%>
    <!-- 在页面加载完成后执行以下操作 -->

    $(function () {
        //console.log("车位查看页面加载完成！！！");
        <%
         for(int i = 1; i <= num;i ++) {
         %>
                //console.log(<%=i%>);
                let zone_id<%=i%> = $("#zid<%=i%>").html(); //'A'
                let carport_id<%=i%> = $("#cid<%=i%>").html();
                $("#" + zone_id<%=i%>).children("a").eq(carport_id<%=i%>-1).attr("class","blue");
        <%
         }
        %>
    })

</script>

</body>