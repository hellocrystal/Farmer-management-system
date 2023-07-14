<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>购买车位</title>

<link rel="stylesheet" href="css/reset.css" />
<link rel="stylesheet" href="static/carcss/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/css/style.css" />
<c:import url="common.jsp"></c:import>
<style type="text/css" id="css">
	body{
	}
	#List{
		width:800px;
		height:360px;
		box-shadow:0 0 10px white;
		margin:20px auto 0;
		perspective:1500px;/* 站 在1000px之处看li	 */
	}
	#List li{
		width:40px;
		height:360px;
		float:left;
		position:relative;
		opacity:1;
		transform-style:preserve-3D;/* 	3D空间 */
		transform-origin:center center -180px;
	}
	#List li a,#List li span{
		position:absolute;
		width:100%;
		height:100%;
	}
	#List li span{
		width:360px;
		position:absolute;
		height:100%;
	}
	#List li a:nth-child(1){
		left:0;
		top:0;
		background:url("img/1.jpg");
	}
	#List li a:nth-child(2){
		left:0;
		top:-100%;
		background:url("img/2.jpg");
		background-size:800px 360px;
		transform-origin:bottom;
		transform:rotateX(90deg);
	}
	#List li a:nth-child(3){
		left:0;
		top:0;
		background:url("img/3.jpg");
		background-size:800px 360px;
		transform:translateZ(-360px) rotateX(180deg);
	}
	#List li a:nth-child(4){
		left:0;
		top:100%;
		background:url("img/4.jpg");
		background-size:800px 360px;
		transform-origin:top;
		transform:rotateX(-90deg);
	}
	#List:hover li{
		transform:rotateX(360deg);
	}
	#btns{
		width:200px;
		margin:20px auto;
	}
	#btns li{
		width:40px;
		height:40px;
		background:red;
		color:white;
		float:left;
		text-align:center;
		line-height:40px;
		font-style:italic;
		border-radius:50%;
		margin:0 5px;
		font-weight:bold;
		cursor:pointer;
	}
	#btns li.active{
		background:purple;
		color:black;
	}
	.carseat{
	    margin:0 auto;
		border:1px solid black;
		width:800px;
		height: 560px;
	}
	.aseat,.bseat,.cseat,.dseat{
		margin:0 auto;
		border:1px solid black;
		width:600px;
		height: 50px;
	}
	.green,.red,.blue,#blue{
		cursor: pointer;
		margin: 0 10px;
	}
	#A,#B,#C,#D{
		height:60px;
		line-height:60px;
		margin-top:20px;
		margin-bottom:20px;
		text-align: center;
	}
	#A{
		background-image: url("static/img/A.jpg");
	}
	#B{
		background-image: url("static/img/B.jpg");
	}
	#C{
		background-image: url("static/img/C.jpg");
	}
	#D{
		background-image: url("static/img/D.jpg");
	}
	.green span,.red span,.blue span,#blue span{
		font-size: 40px;
	}
	.green span{
		background-color: green;
	}
	.red span{
		background-color: red;
	}
	.blue span,#blue span{
		background-color: #1ABDE6;
	}
	.green{
		color: white;
	}
	.red{
		color: white;	
	}
	h1{
		text-align: center;
	}
	.blue,#blue{
		color: white;
	}
	h2,a,sellcardiv,h4{
		text-align: center;
	}
	.btn{
		margin-left: auto;
		margin-right: auto;
		display: block;
	}
	#mry-opo-content{
		padding-top: 100px;
	}
	a:hover{
		color: white;
	}
	.sure{
		display: none;
	}
	.carseat{
	position: relative;
	}
	.tipsesssion{
		display:none;
		position: fixed;
		width: 200px;
		height: 200px;
		border-radius: 10px;
		background-color: white;
		opacity: 1;
		left:725px;
		top:330px;
		border: 1px solid black;
		padding-top: 70px;
		transition: display 2s;
	}
	.tipsesssion span{
		display:block;
		text-align: center;
	}
	.activityspan{
		display: inline-block;
	    width: 50px;
	    height: 50px;
	    padding: 10px;
	    border-radius: 5px;
	}
	.activityspan p{
	}
	h2{
	}
	*{padding: 0; margin: 0; font-family: "Lato", sans-serif}
    i{font-size: 14px}
    span.red{background: #ff0000}
    span.yg{background: yellowgreen}
    span.or{background: orange}
    span.pi{background: palevioletred}
    span.pk{background: #00a0e9}
    span.mk{background: #1FADC5}
    span p:first-child{font-size: 25px}
    span p:last-child{font-size: 14px}
</style>

<script type="text/javascript">
	window.onload = function() {
		var oList = document.getElementById("List");
		var oCSS = document.getElementById("css");
		var oBtn = document.getElementById("btns").children;
		var iW = 40;
		var shtml="";
		var scss="";
		var Lilength = oList.clientWidth / iW;
		var iZindex= 0;
		var iNow = 0;
		var aLi;
		var aLi = oList.children;
		for (var i=0;i<Lilength;i++ )
		{
			i>Lilength/2?iZindex--:iZindex++;
			shtml+='<li><a href="javascript:;"></a><a href="javascript:;"></a><a href="javascript:;"></a><a href="javascript:;"></a></li>';
			scss += "#List li:nth-child("+(i+1)+") a{background-position:-"+(iW*i)+"px 0}";
			scss += "#List li:nth-child("+(i+1)+"){z-index:"+iZindex+"}";
		}
		oList.innerHTML = shtml;
		oCSS.innerHTML += scss;
		for (var i=0;i<oBtn.length;i++ )
		{
			oBtn[i].index = i;
			oBtn[i].onclick = function(){
				oBtn[iNow].className = "";
				for (var i=0;i<aLi.length;i++ )
				{
					aLi[i].style.transition = "0.8s "+i*50+"ms";
					aLi[i].style.WebkitTransform="rotateX(-"+(this.index)*90+"deg)";
				}
				
				iNow = this.index;
				oBtn[iNow].className = "active";
			}
		}
	}
</script>

</head>
<body>
<div style="text-align:center;clear:both;">
<script src="static/js/jquery.js" type="text/javascript"></script>
<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="static/js/carseat.js" type="text/javascript"></script>
<script src="/follow.js" type="text/javascript"></script>
</div>
<h1>共有${count }个空闲车位 
<h2>本次销售活动倒计时:<span class="pi activityspan">
				<p id="i2">${duration }</p>
				<p>分</p>
			</span> <span class="pk activityspan">
				<p id="s2">59</p>
				<p>秒</p>
			</span></h1></h2>
<h4><a class="green" title="未被占用" ><span class="icon iconfont"></span></a>没有占用<a class="red" title="占用"><span class="icon iconfont"></span></a>已被占用<a id="blue" title="占用" ><span class="icon iconfont"></span></a>选中状态</h4>
<div class="carseat">
	<div id="A">
		<c:forEach var="inv" items="${A }">
			<c:if test="${inv.state=='0' }">
				<a class="green" title="未被占用" onclick="select(this)"><input type="hidden"
																			value="${inv.carportId }"><span
						class="icon iconfont"></span></a>
			</c:if>
			<c:if test="${inv.state!='0' }">
				<a class="red" title="占用" onclick="select(this)"><input type="hidden" value="${inv.carportId }"><span
						class="icon iconfont"></span></a>
			</c:if>
		</c:forEach>
	</div>
	<div class="aseat">
	</div>
	<div id="B">
		<c:forEach var="inv" items="${B }">
			<c:if test="${inv.state=='0' }">
				<a class="green" title="未被占用" onclick="select(this)"><input type="hidden"
																			value="${inv.carportId }"><span
						class="icon iconfont"></span></a>
			</c:if>
			<c:if test="${inv.state!='0' }">
				<a class="red" title="占用" onclick="select(this)"><input type="hidden" value="${inv.carportId }"><span
						class="icon iconfont"></span></a>
			</c:if>
		</c:forEach>
	</div>
	<div class="bseat">
	</div>
	<div id="C">
		<c:forEach var="inv" items="${C }">
			<c:if test="${inv.state=='0' }">
				<a class="green" title="未被占用" onclick="select(this)"><input type="hidden"
																			value="${inv.carportId }"><span
						class="icon iconfont"></span></a>
			</c:if>
			<c:if test="${inv.state!='0' }">
				<a class="red" title="占用" onclick="select(this)"><input type="hidden" value="${inv.carportId }"><span
						class="icon iconfont"></span></a>
			</c:if>
		</c:forEach>
	</div>
	<div class="cseat">
	</div>
	<div id="D">
		<c:forEach var="inv" items="${D }">
			<c:if test="${inv.state=='0' }">
				<a class="green" title="未被占用" onclick="select(this)"><input type="hidden"
																			value="${inv.carportId }"><span
						class="icon iconfont"></span></a>
			</c:if>
			<c:if test="${inv.state!='0' }">
				<a class="red" title="占用" onclick="select(this)"><input type="hidden" value="${inv.carportId }"><span
						class="icon iconfont"></span></a>
			</c:if>
		</c:forEach>
	</div>


	<div id="tipsesssion" class="tipsesssion">
		<span>成功选中您心爱的车位，请尽快点击请确认按钮，进行购买！</span>
	</div>
	<input type="hidden" value="" id="sureh">
	<a class="btn btn-primary sure" onclick="sureh()">确定</a>	
</div>
	<script type="text/javascript" src="static/js/style.js"></script>
	<script type="text/javascript">
	var num = 0;
		function aa() {
			pop({
				width : 500,//提示窗口的宽度
				height : 400,//提示窗口的高度
				title : '竞标信息填写',//提示窗口的标题
				content : '已经选中！'
			//提示窗口的内容
			});
		}
	</script>
</body>
</html>