<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.njau.util.DateTimeUtil " %>
<!DOCTYPE html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>个人展示页面</title>

<link rel="stylesheet" type="text/css" href="css/demo2.css">
<link rel="stylesheet" type="text/css" href="css/loading2.css">
<link rel="stylesheet" type="text/css" href="css/main22.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body space-top-bot="50px">

<div class="page-loading__icon"></div>

<div class="frosted-panel" panel-dimensions="80% 60%" breakpoint-type="min-width" breakpoints="600px 80% 80%, 1200px 60% 500px">

	<svg>
		<filter id="blurMe" filterRes="1200" color-interpolation-filters="sRGB">
			<feGaussianBlur in="SourceGraphic" stdDeviation="7" />
		</filter>

        <image xlink:href="./img/bg1.jpg" x="0" y="0" width="2880" height="1620" filter="url(#blurMe)"/>
    </svg>

    <div class="content" content-margin="5px">
        <!-- ALL PANEL CONTENT GOES HERE -->
        <!-- .flex-container is for demo purposes only -->
        <div class="flex-container">
            <table class="table table-hover">
                <tr>
                    <td style="width: 120px;">用户名</td>
                    <td>${onwer.username }</td>
                </tr>
                <tr>
                    <td>业主姓名</td>
                    <td>${onwer.name }</td>
                </tr>

                <tr>
                    <td>登录密码</td>
                    <td>${onwer.password}</td>
                </tr>

                <tr>
                    <td>业主楼号</td>
                    <td>${room.zone}</td>
                </tr>
                <tr>
                    <td>业主门牌</td>
                    <td>${room.id}</td>
                </tr>

                <tr>
                    <td>业主电话</td>
                    <td>${onwer.phone }</td>
                </tr>

                <tr>
                    <td>身份证号码</td>
                    <td>${onwer.idcard }</td>
                </tr>
                <tr>
                    <td>注册时间</td>
                    <td>${DateTimeUtil.parse(onwer.registTime )}</td>
                </tr>
                <tr>
                    <td>操作栏</td>
                    <td>
                        <button type="button" class="btn btn-success"><a
                                href="updateowenerss.action?type=1">修改 </a></button>
                    </td>
                </tr>
            </table>
        </div>
    </div>
</div>

<script src="js/app.js"></script>

<div style="text-align:center;clear:both;">
<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="/follow.js" type="text/javascript"></script>
</div>

</body>
</html>