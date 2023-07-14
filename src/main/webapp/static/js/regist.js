//用户名是否重复验证

// function checkName(n) {
//
// }
// function checkMobile(n){
// 	var phone = document.getElementById("otel");    //获取otel控件对象
// 	if (!phone.value == "") {
// 	         var reg =/^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\d{8}$/;
// 	         var bool = reg.test(phone.value);
// 	         if (bool == false) {
// 	                 alert("电话号格式错误，请重新输入！");
// 	                 return;
// 	         }
// 	}
// 	$.ajax({
// 		type : "post",
// 		url : "checktel.action",
// 		data : {name:n},
// 		dataType : "text",
// 		success : function(data) {
// 			console.log(n);
// 			if (data == "false") {
// 				$("#mes").html("此业主电话已经注册");
// 			} else {
// 				$("#mes").html("");
// 			}
// 		}
// 	});
// }


// function validateemail(){
//     var accemail = document.getElementById("uemail");    //获取email控件对象
//     if (!accemail.value == "") {
//               var reg =/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
//
//               var bool = reg.test(accemail.value);
//               if (bool == false) {
//                       alert("邮箱格式错误，请重新输入！");
//                      /* accemail.focus();*/
//                       return;
//               }
//     }
// }


function func1() {
	let username = $('#username').val();
	if( username == null || username.length === 0) {
			$('#register_mes').html('用户名不能为空');
		return false;
	}

	let name = $('#oname').val();
	if( name == null || name.length === 0) {
		$('#register_mes').html('姓名不能为空');
		return false;
	}

	let pass1 = $('#pass1').val();
	if( pass1 == null || pass1.length === 0) {
		$('#register_mes').html('密码不能为空');
		return false;
	}

	let pass2 = $('#pass2').val();
	if(pass1 !== pass2) {
		$('#register_mes').html('两次输入密码不相同');
		return false;
	}

	let age = $('#oage').val();
	if( age == null || age.length === 0) {
		$('#register_mes').html('年龄不能为空');
		return false;
	}
	if(isNaN(age)) {
		$('#register_mes').html('输入的年龄不合法');
		return false;
	}

	let tel = $('#otel').val();
	if( tel == null || tel.length === 0) {
		$('#register_mes').html('电话不能为空');
		return false;
	}
	if(isNaN(tel)) {
		$('#register_mes').html('输入的电话不合法');
		return false;
	}
	if(tel.length !== 11) {
		$('#register_mes').html('输入的电话位数不合法');
		return false;
	}

	let sex = $('#osex option:selected').html();
	if(sex !== '女' && sex !== '男') {
		$('#register_mes').html('请选择性别');
		return false;
	}

	let towernum = $('#towernum option:selected').html();
	console.log(towernum);
	if(towernum.length > 2) {
		$('#register_mes').html('请选择楼栋号码');
		return false;
	}

	let doorplate = $('#odoorplate').val();
	if( doorplate == null || doorplate.length === 0) {
		$('#register_mes').html('门牌号不能为空');
		return false;
	}


	let identity = $('#oidentity').val();
	if( identity == null || identity.length === 0) {
		$('#register_mes').html('身份证号不能为空');
		return false;
	}
	if(identity.length !== 18) {
		$('#register_mes').html('输入的身份证位数不合法');
		console.log("输入的身份证位数不合法");
		return false;
	}

	return true;
}


// function func2() {
//
// 	let username = $('#username').val();
// 	let tel = $('#otel').val();
// 	let towernum = $('#towernum option:selected').html();
// 	let doorplate = $('#odoorplate').val();
// 	let identity = $('#oidentity').val();
//
// 	function User(username, tel, towernum, doorplate, identity) {
// 		this.username = username;
// 		this.tel = tel;
// 		this.towernum = towernum;
// 		this.doorplate = doorplate;
// 		this.identity = identity;
// 	}
//
// 	let user = new User(username, tel, towernum, doorplate, identity);
//
//
// 	$.ajax({
// 		type : "post",
// 		url : "checktel.action",
// 		data : this.user,
// 		dataType : "text",
// 		success : function(data) {
// 			console.log(n);
// 			if (data == "false") {
// 				$("#mes").html("此业主电话已经注册");
// 			} else {
// 				$("#mes").html("");
// 			}
// 		}
// 	});
// }
// 用户验证
function check() {
	// return true;
	// var pass1 = $("#pass1").val();
	// var pass2 = $("#pass2").val();
	// var name = $("#oname").val();
	// var mes = $("#mes").html();
	//
	// if (name == "") {
	// 	alert("用户名不能为空");
	// 	return false;
	// }
	// if (pass1 == "") {
	// 	alert("密码不能为空");
	// 	return false;
	// }
	//
	// /**
	//  * 判断mes是否为空 例如：显示用户电话已存在，则无法进行
	//  */
	// if (mes != "") {
	// 	alert(mes);
	// 	return false;
	// }
	// if (pass1 == pass2) {
	// 	$("#form1").submit();
	// } else {
	// 	alert("密码不相同");
	// 	return false;
	// }
	if(!func1()) return false;

	//if(!func2()) return false;

	//console.log("准备提交");

	$("#form1").submit();
}