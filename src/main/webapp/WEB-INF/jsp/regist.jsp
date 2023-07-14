<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    System.out.println(basePath);
%> <!DOCTYPE>
<html>
<head>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <title>客户注册界面</title>
    <!-- 引用bootstrap样式 -->
    <c:import url="common.jsp"/>
    <script type="text/javascript" src="static/js/regist.js"></script>
    <style type="text/css">
        .t1 {
            width: 80px;
            height: 20px;
            text-align: center;
            line-height: 1000px;
        }

        .t2 {
            height: 20px;
        }

        .bb1 {
            background-image: url('static/image/bg.jpg');
            background-size: 100% 100%;
            background-attachment: fixed;
            width: 100%;
        }

        td, h1 {
            color: white;
        }
    </style>
</head>


<body class="bb1" onload="show_1()">
<h1 style="text-align: center; margin: 20px auto;">注册</h1>
<form action="signinjudge.action" method="post" id="form1">
    <div style="width: 500px; margin: 20px auto; font-size: 25px;">
        <span id="register_mes"
              style="font-size: 12px; color: red">${msg}</span>
        <table class="table table-hover">
            <tr>
                <td class="t1" style="line-height: 33px;">用户名</td>
                <td class="t2"><input id="username" type="text"
                                      class="form-control" name="username" placeholder="用户名"
                                      required="required"/></td>
            </tr>
            <tr>
                <td class="t1" style="line-height: 33px;">业主姓名</td>
                <td class="t2"><input id="oname" type="text"
                                      class="form-control" name="oname" placeholder="姓名"
                                      required="required"/></td>
            </tr>
            <tr>
                <td class="t1" style="line-height: 33px;">密码</td>
                <td class="t2"><input id="pass1" type="password"
                                      class="form-control" name="opass" placeholder="密码"
                                      required="required"/></td>
            </tr>
            <tr>
                <td class="t1" style="line-height: 33px;">确认密码</td>
                <td class="t2"><input type="password" id="pass2"
                                      class="form-control" name="pass2" placeholder="确认密码"
                                      required="required"/></td>
            </tr>


            <tr>
                <td class="t1" style="line-height: 33px;">年龄</td>
                <td class="t2"><input type="text" id="oage"
                                      class="form-control" name="oage" placeholder="请输入年龄"
                                      required="required"/></td>
            </tr>

            <tr>
                <td class="t1" style="line-height: 33px;">电话</td>
                <td class="t2"><input id="otel" type="text" maxlength="11"
                                      name="otel" onblur="" class="form-control"
                                      placeholder="电话号码"/>
                    <span id="mes"
                          style="font-size: 12px; color: red"></span></td>
            </tr>

            <tr>
                <td class="t1" style="line-height: 33px;">性别</td>
                <td class="t2"><select id="osex" type="text"
                                       name="osex">
                    <option value="0">选择性别</option>
                    <option>女</option>
                    <option>男</option>
                </select>
                </td>
            </tr>

            <tr>
                <td class="t1" style="line-height: 33px;">楼栋号</td>
                <td class="t2"><select id="towernum" type="text"
                                       name="towernum">
                    <option value="0">选择楼栋号码</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                    <option>7</option>
                    <option>8</option>
                    <option>9</option>
                    <option>10</option>
                </select>号楼
                </td>
            </tr>
            <tr>
                <td class="t1" style="line-height: 33px;">门牌号</td>
                <td class="t2"><input id="odoorplate" type="text"
                                      name="odoorplate" class="form-control" placeholder="门牌号"
                                      required="required"/></td>
            </tr>
            <tr>
                <td class="t1" style="line-height: 33px;">身份证号码</td>
                <td class="t2"><input id="oidentity" type="text"
                                      name="oidentity" class="form-control" placeholder="身份证号码 "
                                      required="required"/></td>
            </tr>
        </table>
        <div style="text-align: center;">
            <input type="button" onclick="check()"
                   style="width: 100px; height: 40px;" value="提交"> </input>
        </div>
    </div>
<%--    check()--%>
</form>

<%-- class="btn btn-default" --%>

</body>
</html>