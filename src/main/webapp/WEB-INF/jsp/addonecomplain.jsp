<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

<html lang="en" class="no-js">

	<head>

		<meta charset="UTF-8" />

		<meta http-equiv="X-UA-Compatible" content="IE=edge">

		<meta name="viewport" content="width=device-width, initial-scale=1">

		<title>Fullscreen Form Interface</title>

		<meta name="description" content="Fullscreen Form Interface: A distraction-free form concept with fancy animations" />

		<meta name="keywords" content="fullscreen form, css animations, distraction-free, web design" />

		<meta name="author" content="Codrops" />

		<link rel="shortcut icon" href="../favicon.ico">

		<link rel="stylesheet" type="text/css" href="static/css/normalize.css" />

		<link rel="stylesheet" type="text/css" href="static/css/demo.css" />

		<link rel="stylesheet" type="text/css" href="static/css/component.css" />

		<link rel="stylesheet" type="text/css" href="static/css/cs-select.css" />

		<link rel="stylesheet" type="text/css" href="static/css/cs-skin-boxes.css" />

		<script src="static/js/modernizr.custom.js"></script>

	</head>

	<body>

		<div class="container">

			<div class="fs-form-wrap" id="fs-form-wrap">

				<div class="fs-title">

					<h1>欢迎对我们的工作提出意见或建议</h1>

				</div>

				<form id="myform" class="fs-form fs-form-full" autocomplete="off" action="savecomplain.action">

					<ol class="fs-fields">

						<li>

							<label class="fs-field-label fs-anim-upper" for="q1">请选择投诉类型</label>
							<select name="type" class="fs-anim-lower">
								<option value="房屋质量问题">房屋质量问题</option>
								<option value="公共空间、公共场地">公共空间、公共场地</option>
								<option value="设备设施、共用设施">设备设施、共用设施</option>
								<option value="景观设计、绿化问题">景观设计、绿化问题</option>
								<option value="小区四周的噪音污染">小区四周的噪音污染</option>
								<option value="物业服务不到位">物业服务不到位</option>
								<option value="物业管理费及其他费用问题">物业管理费及其他费用问题</option>
								<option value="物业管理不透明">物业管理不透明</option>
							</select>
							<!--<input class="fs-anim-lower" id="q1" name="q1" type="text" placeholder="您的名字" required/>-->

						</li>

						<li>

							<label class="fs-field-label fs-anim-upper" for="q2" data-info="We won't send you spam, we promise...">投诉详情：</label>
							<input type="hidden" name="uid" value="${owneruid }">
							<input class="fs-anim-lower" id="q2" name="content" type="text" placeholder="投诉详情" required/>

						</li>

					</ol>
					<!-- /fs-fields -->

					<button class="fs-submit" type="submit">提交投诉</button>

				</form>
				<!-- /fs-form -->

			</div>
			<!-- /fs-form-wrap -->

		</div>
		<!-- /container -->

		<script src="static/js/classie.js"></script>

		<script src="static/js/selectFx.js"></script>

		<script src="static/js/fullscreenForm.js"></script>

		<script>
			(function() {

				var formWrap = document.getElementById('fs-form-wrap');

				[].slice.call(document.querySelectorAll('select.cs-select')).forEach(function(el) {

					new SelectFx(el, {

						stickyPlaceholder: false,

						onChange: function(val) {

							document.querySelector('span.cs-placeholder').style.backgroundColor = val;

						}

					});

				});

				new FForm(formWrap, {

					onReview: function() {

						classie.add(document.body, 'overview'); // for demo purposes only

					}

				});

			})();
		</script>

	</body>

</html>