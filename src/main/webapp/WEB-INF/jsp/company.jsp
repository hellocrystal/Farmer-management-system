<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>时间显示</title>
<style>
    *{padding: 0; margin: 0; font-family: "Lato", sans-serif}
    i{font-size: 14px}
    body{background: #0d0d0d; color: #ffffff}
    div{font-size: 20px; text-align: center; padding-top: 15px;}
    div span{display: inline-block; width: 50px; height: 50px;padding: 10px; border-radius: 5px}
    p{font-size: 18px}
    span.red{background: #ff0000}
    span.yg{background: yellowgreen}
    span.or{background: orange}
    span.pi{background: palevioletred}
    span.pk{background: #00a0e9}
    span.mk{background: #1FADC5}
    span p:first-child{font-size: 25px}
    span p:last-child{font-size: 14px}
</style>
</head>
<body>
	<div>
		<h1>公司成立至今已有：</h1>
		<div>
			<span class="red">
				<p id="y2"></p>
				<p>年</p>
			</span> <span class="yg">
				<p id="d2"></p>
				<p>天</p>
			</span> <span class="or">
				<p id="h2"></p>
				<p>时</p>
			</span> <span class="pi">
				<p id="i2"></p>
				<p>分</p>
			</span> <span class="pk">
				<p id="s2"></p>
				<p>秒</p>
			</span>
		</div>
	</div>
	<div>
    <h2>距2024年6月30日还有</h2>
    <div>
        <span class="red">
            <p id="y1"></p>
            <p>年</p>
        </span>
        <span class="yg">
            <p id="d1"></p>
            <p>天</p>
        </span>
        <span class="or">
            <p id="h1"></p>
            <p>时</p>
        </span>
        <span class="pi">
            <p id="i1"></p>
            <p>分</p>
        </span>
        <span class="pk">
            <p id="s1"></p>
            <p>秒</p>
        </span>
        <span class="mk">
            <p id="m1"></p>
            <p>毫秒</p>
        </span>
    </div>
</div>
	<script type="text/javascript" src="static/js/timecountdown.js"></script>
	<script type="text/javascript">
		    /**
		     * time.day 和 time.dayZero 区别
		     * time.day 如果是1天 返回 1
		     * time.dayZero 如果是1天 则返回 01
		     * 除了day拥有Zero外 hour,minute,second,msec都有Zero 即小于10的，都会在前面补0
		     */
		    window.onload=function(){
		        xcsoft.countdown('2024-06-30',function (time) {
		            //time.days=总天数
		            document.getElementById("y1").innerHTML=time.year
		            document.getElementById("d1").innerHTML=time.day
		            document.getElementById("h1").innerHTML=time.hourZero
		            document.getElementById("i1").innerHTML=time.minuteZero
		            document.getElementById("s1").innerHTML=time.secondZero
		            document.getElementById("m1").innerHTML=time.msecZero
		        },function (time) {
		            //倒计时结束后的操作
		        })
		        xcsoft.countup('2020-09-12',function (time) {
		            document.getElementById("y2").innerHTML=time.year
		            document.getElementById("d2").innerHTML=time.day
		            document.getElementById("h2").innerHTML=time.hourZero
		            document.getElementById("i2").innerHTML=time.minuteZero
		            document.getElementById("s2").innerHTML=time.secondZero
		        })
		
		        //var nes=parseInt(new Date().getTime()/1000)+60;
		        // xcsoft.countdown(parseInt(nes)+'.3',function (time) {
		        //     document.getElementById("s3").innerHTML=time.secondZero
		        //     document.getElementById("m3").innerHTML=time.msecZero
		        // })
		
		    }
	</script>
</body>
</html>