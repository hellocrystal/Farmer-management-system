<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>纯JavaScript实现3D百叶窗图片切换动画DEMO演示</title>

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
		height: 760px;
	}
	.aseat,.bseat,.cseat,.dseat{
		margin:0 auto;
		border:1px solid black;
		width:600px;
		height: 50px;
	}
	.green,.red,.blue{
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
	.green span,.red span,.blue span{
		font-size: 40px;
	}
	.green span{
		background-color: green;
	}
	.red span{
		background-color: red;
	}
	.blue span{
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
	.blue{
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
</style>

<script type="text/javascript">
	window.onload = function(){
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
<ul id="List"></ul>

<ol id="btns" class="clearfix">
	<li class="active">1</li>
	<li>2</li>
	<li>3</li>
	<li>4</li>
</ol>
<h1>共有${count }个空闲车位 </h1>
<h4><a class="green" title="未被占用" ><span class="icon iconfont"></span></a>没有占用<a class="red" title="占用"><span class="icon iconfont"></span></a>已被占用<a class="blue" title="占用" ><span class="icon iconfont"></span></a>选中状态</h4>
<div class="carseat">
	<div id="A">
		<c:forEach var="inv" items="${A }">
			<c:if test="${inv.state=='0' }">
				<a class="green" title="未被占用" onclick="select(this)"><span class="icon iconfont"></span></a>
			</c:if>
			<c:if test="${inv.state!='0' }">
				<a class="red" title="占用" onclick="select(this)"><span class="icon iconfont"></span></a>
			</c:if>
		</c:forEach>
	</div>
	<div class="aseat">
	</div>
	<div id="B">
		<c:forEach var="inv" items="${B}" >
			<c:if test="${inv.state=='0' }">
				<a class="green" title="未被占用" onclick="select(this)"><span class="icon iconfont"></span></a>
			</c:if>
			<c:if test="${inv.state!='0' }">
				<a class="red" title="占用" onclick="select(this)"><span class="icon iconfont"></span></a>
			</c:if>
		</c:forEach>
	</div>
	<div class="bseat">
	</div>
	<div id="C">
		<c:forEach var="inv" items="${C }">
			<c:if test="${inv.state=='0' }">
				<a class="green" title="未被占用" onclick="select(this)"><span class="icon iconfont"></span></a>
			</c:if>
			<c:if test="${inv.state!='0' }">
				<a class="red" title="占用" onclick="select(this)"><span class="icon iconfont"></span></a>
			</c:if>
		</c:forEach>
	</div>
	<div class="cseat">
	</div>
	<div id="D">
		<c:forEach var="inv" items="${D }">
			<c:if test="${inv.state=='0' }">
				<a class="green" title="未被占用" onclick="select(this)"><span class="icon iconfont"></span></a>
			</c:if>
			<c:if test="${inv.state!='0' }">
				<a class="red" title="占用" onclick="select(this)"><span class="icon iconfont"></span></a>
			</c:if>
		</c:forEach>
	</div>
	<div class="sellcardiv">
		<h2>点击下面按钮一键上架出售空闲车位</h2>
		<a class="btn btn-info btn-lg" onclick="aa()">出售</a>
	</div>
</div>
	<script type="text/javascript" src="static/js/style.js"></script>
	<script type="text/javascript">
	var num = 0;
		function aa() {
			pop({
				width : 500,//提示窗口的宽度
				height : 400,//提示窗口的高度
				title : '竞标信息填写',//提示窗口的标题
				content : '<table>'
						 +'<tr><td class="tanchuang1">数量</td><td class="tanchuang1"><input type="hidden" form="form1" value="" name="bid"><input type="hidden" form="form1" value="" name="sid"><input type="text" id="" value="'+${count }+'个" form="form1" name="name" class="form-control" placeholder="" disabled ="disabled"/></td></tr>'
						 +'<tr style="margin-top:10px"><td class="tanchuang1" style="margin-top:10px">选择出售时长</td><td class="tanchuang1" style="margin-top:10px">'
						 +'<select id="time" name="time" class="form-control" style="margin-top:10px">'
							+'<option value="10">10分钟</option>'
							+'<option value="20">20分钟</option>'
							+'<option value="30">30分钟</option>'
							+'<option value="40">40分钟</option>'
							+'<option value="50">50分钟</option>'
							+'<option value="60">60分钟</option>'
						 +'</select>'
						 +'</td></tr>'
						 +'<tr><td class="tanchuang1" style="margin-top:10px"><input class="tanchuang1 btn btn-info"  type="button" onclick="sell()" value="开始出售"   style="margin-top:10px"/></td></tr></table>'
			//提示窗口的内容
		})
		}
		function sell(){
				var time = $("#time").val();
				$.ajax({
					type:'post', 
					url:'startsellcar.action?time='+time,
					async:true,
					dataType : "json",
					success : function(date) {
						if(date){
							alert("出售成功！");
							window.location = 'sellcar.action';
						}else{
							alert("请勿重复操作！！");
							window.location = 'sellcar.action';
						}
					}
				});
		}
	</script>
</body>
</html>