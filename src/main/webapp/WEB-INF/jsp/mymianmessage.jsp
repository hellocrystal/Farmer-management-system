<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>用户主页</title>
	<c:import url="common.jsp"></c:import>
	<link rel="stylesheet" type="text/css" href="css/normalize.css" /><!--CSS RESET-->
	<link rel="stylesheet" type="text/css" href="css/htmleaf-demo.css"><!--演示页面样式，使用时可以不引用-->
	<link rel="stylesheet" href="css/jquery.fsscroll.css">
	<style>
    * {
      padding: 0;
      margin: 0;
    }
    html, body {
      height: 100%;
      overflow: hidden;
      font-family: Arial,"Microsoft YaHei",sans-serif;
      -webkit-font-smoothing: antialiased;
	  background-image:       
    }
    .container, .sections, .section {
      position: relative;
      height: 100%;
      text-align: center;
      color: #fff;
    }
    .section h1 {
      position: absolute;
      top: 50%;
      left: 50%;
      transform: translate(-50%, -50%);
      font-size: 40px;
      transition: all .3s ease;
    }
    .quanguo{
    	padding:30px;
    	color: #333;
		font-size: 20px;    	
    }
    .section:first-child h1 {
      animation: first-show .3s;
    }
    .section0 {
      background: white;
    }
    .section2 {
      background: #E6A23C;
    }
    .section3 {
      background: #F56C6C;
    }
    .section1{
      overflow:hidden;
      background: #67C23A;
    }
    .section h1.text-animate {
      left: 0px;
      transform: translateX(-100%);
    }
    @keyframes first-show {
      0% {
        left: 0px;
        transform: translateX(-100%);
      }
      100% {
        left: 50%;
        transform: translateX(-50%);
      }
    }
  </style>
</head>
<body>
	 <div class="container" data-fs-scroll>
    <div class="sections">
      <div class="section section0">
      	<p class="quanguo">全国版图<br>
			安心、参与、信任、共生
			<br>
			南农小区位于南京农业大学东北角，地处紫金山南麓，介于地铁2号线苜蓿园站和下马坊站之间，自然环境和人文环境较好。
			<br>
			南农小区由无开发商于1964年建成;楼栋总数46栋，共计房屋1698户。小区物业公司为街道办事处(委员会)代管物业,物业费用0.3至0.7元/平米/月。
		</p>
      	<img alt="" src="static/image/hotMap.png">
      	<img alt="" src="static/image/survey4.png">
      </div>
      <div class="section section1">
      	<h1>南农小区物业将以至诚和创新行动</h1>
      	<img src="static/image/000653-1571674013ac2d.jpg" height="937px">
      </div>
      <div class="section section2">
        <h1>成就更多人的居住梦想</h1>
      </div>
      <div class="section section3">
        <h1>构筑社区幸福家园</h1>
      </div>
    </div>
  </div>
	
	<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script src="js/jquery.fsscroll.js"></script>

  <script>
    $('.container').fsScroll({

      beforeScroll: function(el, index) {
        el.find('h1').addClass('text-animate');
      },

      afterScroll: function(el, index) {
        el.find('h1').removeClass('text-animate');
      }
    })
  </script>
</body>
</html>