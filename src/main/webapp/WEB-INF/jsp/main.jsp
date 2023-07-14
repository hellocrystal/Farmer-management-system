<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE>
<html>

<head>
    <meta charset="utf-8">
    <title>南农小区管理系统</title>

    <link rel="stylesheet" type="text/css"
          href="static/css/left-side-menu.css">
<%--    <link rel="stylesheet" type="text/css" href="static/font/iconfont.css">--%>
    <link rel="shortcut icon" type="image/x-icon" href="static/img/hlogo.ico"/>
    <link rel="stylesheet" type="text/css" href="css/iconfont.css"/>
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <script type="text/javascript" src="static/js/main.js"></script>
    <script type="text/javascript" src="static/js/jquery.min.js"></script>
    <script type="text/javascript" src="static/js/jquery.slimscroll.min.js"></script>
    <script type="text/javascript" src="static/js/left-side-menu.js"></script>
    <script src="static/js/btn_action.js" type="text/javascript" charset="utf-8"></script>
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

    .input1 {
        border-radius: 20px;
        text-align: center;
        width: 200px;
        height: 80px;
        font-size: 20px;
        color: white;
        float: right;
        line-height: 80px;
        /* box-shadow: -5px 0 100px 0px #168CFA; */
        /* -webkit-box-reflect: below 4px linear-gradient(transparent, transparent 20%, #000); */
    }

</style>

<body style="overflow-y:hidden">

<div class="top"
     style="width: 100%; height: 80px; background-color: #3B3E47">
    <div class="logo-div" style="height: 80px">
        <img src="static/image/wanlonglogo.png"/><span>南农小区管理系统</span>
        <div class="input1" id="txt1"></div>
    </div>
</div>

<div class="left-side-menu">
    <div class="lsm-expand-btn">
        <div class="lsm-mini-btn">
            <label> <input type="checkbox" checked="checked">
                <svg
                        viewBox="0 0 100 100" xmlns="http://www.w3.org/2000/svg">
                    <circle cx="50" cy="50" r="30"/>
                    <path class="line--1"
                          d="M0 40h62c18 0 18-20-17 5L31 55"/>
                    <path class="line--2" d="M0 50h80"/>
                    <path class="line--3"
                          d="M0 60h62c18 0 18 20-17-5L31 45"/>
                </svg>
            </label>

        </div>
    </div>
    <div class="lsm-container">
        <div class="lsm-scroll">
            <div class="lsm-sidebar">
                <ul>
                    <li class="lsm-sidebar-item"><a id="cuta"><span class="icon iconfont"></span><span>人员管理</span></a>
                        <ul>
                            <li class="lsm-sidebar-item"><a href="javascript:"><i
                                    class="my-icon lsm-sidebar-icon "></i><span>业主信息管理</span>
                            </a>
                                <ul>
                                    <li><a id="alllose"><span>所有业主</span></a></li>
                                    <li><a id="lose1"><span>1号楼</span></a></li>
                                    <li><a id="lose2"><span>2号楼</span></a></li>
                                    <li><a id="lose3"><span>3号楼</span></a></li>
                                    <li><a id="lose4"><span>4号楼</span></a></li>
                                    <li><a id="lose5"><span>5号楼</span></a></li>
                                    <li><a id="lose6"><span>6号楼</span></a></li>
                                    <li><a id="lose7"><span>7号楼</span></a></li>
                                    <li><a id="lose8"><span>8号楼</span></a></li>
                                    <li><a id="lose9"><span>9号楼</span></a></li>
                                    <li><a id="lose10"><span>10号楼</span></a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li class="lsm-sidebar-item"><a href="javascript:"><span
                            class="icon iconfont"></span><span>职员管理</span>
                    </a>
                        <ul>
                            <li><a id="zhiyuanxinxi"><span>职员信息</span></a></li>
                        </ul>
                    </li>
                    <li class="lsm-sidebar-item"><a href="javascript:"><span
                            class="icon iconfont"></span><span>收费管理</span>
                    </a>
                        <ul>
                            <li><a id="daijiao"><span>待缴费用户列表</span></a></li>
                            <li><a id="sfmanage"><span>收费管理</span></a></li>
                        </ul>
                    </li>
                    <li class="lsm-sidebar-item"><a><span class="icon iconfont"></span><span>投诉建议</span>
                    </a>
                        <ul>
                            <li><a id="complain"><span>全部投诉</span></a></li>
                            <li><a id="complainstate"><span>未处理</span></a></li>
                            <li><a id="complainstateyes"><span>已处理</span></a></li>
                        </ul>
                    </li>
                    <li class="lsm-sidebar-item"><a href="javascript:"><span
                            class="icon iconfont"></span><span>车位管理</span>
                    </a>
                        <ul>
                            <li><a id="allcar"><span>全部车位</span></a></li>
                            <li><a id="acar"><span>A区车位</span></a></li>
                            <li><a id="bcar"><span>B区车位</span></a></li>
                            <li><a id="ccar"><span>C区车位</span></a></li>
                            <li><a id="dcar"><span>D区车位</span></a></li>
                            <li><a id="yescar"><span>已用车位</span></a></li>
                            <li><a id="nocar"><span>未用车位</span></a></li>
<%--                            <li><a id="sellcar"><span>出售车位</span></a></li>--%>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>

</div>
<iframe frameborder="0" width="90%" height="100%" class="iframe1" id="iframe1" src="company.action"></iframe>
<script type="text/javascript">
    var myVar = setInterval(function () {
        myTimer()
    }, 1000);

    function myTimer() {
        var d = new Date();
        var h = d.toLocaleTimeString();
        var txt = document.getElementById("txt1");
        txt.innerText = "现在是:" + h;
    }
</script>
</body>
</html>