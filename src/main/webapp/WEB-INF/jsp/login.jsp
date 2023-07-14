<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <title>欢迎登陆南农物业</title>
    <!-- Meta tags -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- //Meta tags -->
    <link rel="stylesheet" href="static/css/loginstyle.css" type="text/css" media="all"/>
    <!-- Style-CSS -->
    <link href="static/css/font-awesome.css" rel="stylesheet">
    <!-- font-awesome-icons -->
    <link rel="Shortcut Icon" href="static/image/wanlonglogo.ico" type="image/x-icon"/>
    <link rel="stylesheet" type="text/css" href="css/iconfont.css"/>
    <script src="static/js/jigsaw.js"></script>

    <link rel="stylesheet" href="static/css/jigsaw.css">
    <style>
        #msg {
            width: 100%;
            line-height: 40px;
            font-size: 14px;
            text-align: center;
        }

        .icon {
            font-size: 20px;
        }
    </style>
</head>

<body>
<section class="w3l-form-36">
    <div class="form-36-mian section-gap">
        <div>
            <img src="static/image/wanlonglogo.png" width="100px" style="margin-left: 20px;"/>
        </div>
        <div class="wrapper" style="margin-top: -150px;">
            <div class="form-inner-cont">
                <h3>登录</h3>
                <form action="loginjudge.action" method="post" class="signin-form">
                    <span id="login_mes"
                          style="font-size: 12px; color: red">${msss}</span>
                    <div class="form-input">
                        <span class="icon iconfont"></span> <input type="text" name="username" placeholder="用户名"
                                                                    required/>
                    </div>
                    <div class="form-input">
                        <span class="icon iconfont"></span> <input type="password" name="password" placeholder="密码"
                                                                    required/>
                    </div>

                    <!--//验证-->

                    <div style="width: 306px;height: 100px; padding-top: 20px;">
                        <div class="from-group">
                            <label for="lastname" class="col-sm-2 control-label">验&nbsp;&nbsp;证</label></br></br>
                            <div class="col-sm-10">
                                <input type="text"
                                       style="width: 50%;height:34px;float: left;display: inherit;" name="captcha"
                                       class="form-control" placeholder="请输入验证码" required="required">
                                <img id="captcha" style="height: 34px;" alt="验证码" onclick="flash()"
                                     src=captcha.action><span style="color: red;">${requestScope.mes }</span>
                            </div>
                        </div>
                    </div>

                    <div class="login-remember d-grid" style="padding-top: 10px;">
                        <label class="check-remaind">
                            <input type="checkbox">
                            <span class="checkmark"></span>
                            <p class="remember">记住密码</p>
                        </label>
                        <button class="btn theme-button">登录</button>
                    </div>
                </form>
                <p class="signup">没有账户?
                    <a href="signin.action" class="signuplink" style="color: #000000;">注 册</a>
                </p>
            </div>
        </div>
    </div>
</section>
</body>
</html>