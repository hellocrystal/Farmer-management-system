<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<html>

<head>
	<meta charset="utf-8">
	<title>南农小区管理系统</title>

	<link rel="stylesheet" type="text/css"
		href="static/css/left-side-menu.css">
	<link rel="stylesheet" type="text/css" href="static/font/iconfont.css">
	<link rel="stylesheet" type="text/css" href="css/iconfont.css" />
	<link rel="shortcut icon" type="image/x-icon"
		href="static/img/hlogo.ico" />
		<!-- menu -->
	<c:import url="common.jsp"></c:import>
	<script type="text/javascript" src="static/js/jquery.js"></script>
	<script type="text/javascript" src="static/js/ownermain.js"></script>
	<script type="text/javascript" src="static/js/jquery.min.js"></script>
	<script type="text/javascript" src="static/js/jquery.slimscroll.min.js"></script>
	<script type="text/javascript" src="static/js/left-side-menu.js"></script>
	<script type="text/javascript" src="static/js/session.js"></script>
	<script type="text/javascript" src="static/js/jquery.qqFace.js"></script>
	<link rel="stylesheet" type="text/css" href="static/css/style.css" />
	<link type="text/css" rel="stylesheet" href="demo/css/application.css">
	<link rel="stylesheet" type="text/css" href="static/css/iconfont1.css" />
</head>
<style type="text/css">
.iframe1 {
	scrolling: no;
}

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

.textarea1 {
	width: 482px;
	height: 213px;
	resize: none;
	border: 1px solid;
	overflow: auto;
}

.textarea2 {
	margin-top: 10px;
	width: 482px;
	height: 103px;
	resize: none;
}

.btn {
	float: right;
	margin-top: 10px;
}

.emotion {
	color: #F79709;
	margin-left: 20px;
	float: left;
	cursor: pointer;
}

.span, .span1 {
	margin-top: 10px;
	margin-bottom: 10px;
	display: block;
	text-align: left;
}

.span {
	color: #2B91D5;
	margin-left: 5px;
}

.span1 {
	margin-left: 15px;
}

.qqFace {
	margin-top: 4px;
	background: #fff;
	padding: 2px;
	border: 1px #dfe6f6 solid;
}

.qqFace table td {
	padding: 0px;
}

.qqFace table td img {
	cursor: pointer;
	border: 1px #fff solid;
}

.qqFace table td img:hover {
	border: 1px #0066cc solid;
}
.menu a{
	color:black;
}
.sth{
  padding-top:20px;
  border:1px solid black;
  border-radius:10px;
  background-color:white;
   display: none; 
  left:870px;
  top:400px;
  width:200px;
  height:100px;  
  position: fixed;
  text-align: center;
}

#default-demo{
	margin-left: auto;
	margin-right: auto;	
}
</style>

<body style="overflow-y: hidden">

	<div class="top"
		style="width: 100%; height: 80px; background-color: #3B3E47">
		<div class="logo-div" style="height: 80px">
			<a href="ownermain.action"><img src="static/image/wanlonglogo.png" /><span>南农小区物业管理系统</span></a>
		</div>
	</div>
	
	<!-- menu -->
	<!-- menu end -->
	
	<div class="left-side-menu">
		<div class="lsm-expand-btn">
			<div class="lsm-mini-btn">
				<label> <input type="checkbox" checked="checked"> <svg
						viewBox="0 0 100 100" xmlns="http://www.w3.org/2000/svg">
                    <circle cx="50" cy="50" r="30" />
                    <path class="line--1"
							d="M0 40h62c18 0 18-20-17 5L31 55" />
                    <path class="line--2" d="M0 50h80" />
                    <path class="line--3"
							d="M0 60h62c18 0 18 20-17-5L31 45" />
                </svg>
				</label>

			</div>
			<!--        <input type="text">-->

		</div>
		<div class="lsm-container">
			<div class="lsm-scroll">
				<div class="lsm-sidebar">
					<ul>
						<li class="lsm-sidebar-item"><a id="cuta"><span
								class="icon iconfont"></span><span>个人信息</span><i
								class="my-icon lsm-sidebar-more"></i></a>
							<ul>
								<li class="lsm-sidebar-item"><a href="javascript:"><span>我的信息管理</span><i
										class="my-icon lsm-sidebar-more"></i></a>
									<ul>
										<li><a id="showownerme"><span
												style="font-size:10PX;margin-left: 15PX">个人基本信息</span></a></li>
									</ul>
								</li>
							</ul>
						</li>
						<li class="lsm-sidebar-item"><a href="javascript:"><span class="icon iconfont"></span><span>投诉建议</span><i
								class="my-icon lsm-sidebar-more"></i></a>
							<ul>
								<li><a id="mycomplaint"><span>我的投诉/建议</span><input type="hidden" value="${owneruid }"
																				   id="owneruid"></a></li>
								<li><a id="addcomplaint"><span>添加投诉</span></a></li>
								<%--								<li><a id="appealss"><span>维修申报</span></a></li>--%>
								<%--								<li><a id="zhiyuanqiandao"><span>友情建议</span></a></li>--%>
								<%--								<li><a onclick="aa()"><span>客服咨询</span></a></li>--%>
							</ul>
						</li>
						<li class="lsm-sidebar-item"><a href="javascript:"><span class="icon iconfont"></span><span>车位管理</span><i
								class="my-icon lsm-sidebar-more"></i></a>
							<ul>
								<li><a id="mycarseat"><span>我的车位</span></a></li>
								<li><a id="ownerbuycar"><span>购买车位</span></a></li>
							</ul>
						</li>
						<li class="lsm-sidebar-item"><a href="javascript:"><span class="icon iconfont"></span><span>缴费管理</span><i
								class="my-icon lsm-sidebar-more"></i></a>
							<ul>
								<li><a id="mybill"><span>我的未支付账单</span></a></li>
								<li><a id="mybillpay"><span>已支付账单</span></a></li>

							</ul>
						</li>
						<%-- 注释内容<li class="lsm-sidebar-item"><a href="javascript:;"><span class="icon iconfont"></span><span>更多信息</span><i
                                class="my-icon lsm-sidebar-more"></i></a>
                            <ul>
                                <li><a id="daijiao"><span>商铺招租信息</span></a></li>
                                <li><a id=""><span>我们的整改</span></a></li>
                                <li><a href="javascript:;"><span>我们的成员</span></a></li>
                            </ul></li>--%>
						<li class="lsm-sidebar-item"><a href="javascript:"><span class="icon iconfont"></span><span
								id="messnum">我的通知${messnumber}</span><i
								class="my-icon lsm-sidebar-more"></i></a>
							<ul>
								<li><a id="unread"><span id="messnum1">未读${messnumber}</span></a></li>
								<li><a id="readed"><span>已读</span></a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>

	</div>

<iframe frameborder="0" width="90%" height="100%" class="iframe1"
id="iframe1" src="mymianmessage.action"></iframe>

<script src="static/js/complain.js"></script>
<script type="text/javascript" src="static/js/style.js"></script>
<!-- menu.js -->
<script type="text/javascript" src="lib/jquery.raty.js"></script>
<script type="text/javascript">
function ee() {

	$("#st").html('<div id="default-demo"></div>');
	$(".sth").css("display", "block");
	$(".raty-cancel").removeAttr("src");
	$('#default-demo').raty({
		cancel: true,
		target: '#hint',
		targetKeep: true
	});
}
function aa() {
	pop({
		width: 500,//提示窗口的宽度
		height: 470,//提示窗口的高度
		title: '客服',//提示窗口的标题
		content: '<div id="show" class="textarea1"></div>'//提示窗口的内容
				+ '<p><span class="emotion"><span class="icon iconfont"></span></span><a class="btn btn-info btn-xs" onclick="ee()">结束会话</a></p>'
				+ '<textarea name="" rows="" id="saytext" class="textarea2" cols=""></textarea>'//提示窗口的内容
				+ '<input type="button" class="sub_btn btn btn-default" onclick="dd()" value="发送"><div class="sth">请给我的服务打分:<div id="st" class="st" onclick="ff()"></div><div id="hint"></div></div>'//提示窗口的内容
	});
	cc();
	var num = 0;
	var interval1 = setInterval(function () {
		var content = $("#saytext").val();
		$.ajax({
			type: 'post',
			url: 'dialogue1.action',
			async: true,
			dataType: "json",
			success: function (date) {
				var htm = "";
				for (var o in date) {
					htm += '<span class="span">' + date[o].uname + "\t" + date[o].time + '</span>'
							+ '<span class="span1">' + date[o].content + '</span>';
				}
				$("#show").html(htm);
				if ((num++) == 0) {
					$('#show').scrollTop($('#show')[0].scrollHeight);
				}

			}
		});
	}, 1000)
}
</script>
<script type="text/javascript">
function ff(){
	var ff = $("#hint").html();
	$.ajax({
		type:'post',
		url:'savepingfen.action?ff='+ff,
		async:true,
		dataType : "json",
		success : function(date) {
			console.log(date)
			window.location = 'ownermain.action';
		},
		error: function(date){
			setTimeout(function() {
				console.log(date);
				window.location = 'ownermain.action';
			},2000)
		}

	});
}
function cc() {

	$('.emotion').qqFace({
		id: 'facebox',
		assign: 'saytext',
		path: 'arclist/'	//表情存放的路径
	});
}
function dd() {
	$('#show').scrollTop( $('#show')[0].scrollHeight);
	var content = $("#saytext").val();
	console.log(content);
	if(content!=""&&content!=null) {
		$.ajax({
			type:'post',
			url:'dialogue.action?content='+replace_em(content)+'&tel='+${tel},
			async:true,
			dataType : "json",
			success : function(date) {
				$("#saytext").val("");
				var htm = "";
				for (var o in date) {
				htm+='<span class="span">'+date[o].uname+"\t"+date[o].time+'</span>'
					+'<span class="span1">'+date[o].content+'</span>';
				}
				$("#show").html(htm);
			}
		});
	}
}

//查看结果

function replace_em(str){
	str = str.replace(/\</g,'&lt;');
	str = str.replace(/\>/g,'&gt;');
	str = str.replace(/\n/g,'<br/>');
	str = str.replace(/\[em_([0-9]*)\]/g,'<img src="arclist/$1.gif" border="0" />');
	return str;
}

</script>
</body>
</html>