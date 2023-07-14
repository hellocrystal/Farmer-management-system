/*全选*/
function checkedAll(obj) {	
		/* 获取所有属性为class为ck1的元素返回一个数组 */
		var chs = document.getElementsByClassName("selectOne");
		if(obj.checked){
			//循环遍历数组选择的所有元素
		for (var i = 0; i < chs.length; i++) {
			//如果全选按钮选中为true，表示改行所有对象全被选中
			var ch = chs[i];
			ch.checked = true
		}
		}else{//如果全选按钮选中为false，表示改行所有对象全被取消
			for (var i = 0; i < chs.length; i++) {
			var ch = chs[i];
			ch.checked = false
		}
	}
	}
	
	function setcheckedAll(obj) {
		/*获取id为selectAll的元素返回一个对象*/
		var chrs=document.getElementById("selectAll")
		//进入if判断id栏元素是否全被选中
		if(!obj.checked){
			chrs.checked=false
			return
		}
		//表示选择某一个ID时
		/* 获取所有属性为class为ck1的元素返回一个数组 */
		var chs = document.getElementsByClassName("selectOne");
		for (var i = 0; i < chs.length; i++) {
			if(!chs[i].checked){
				chrs.checked=false
				return
			}
			chrs.checked=true		
		}	
		}
var num1 = 0;
function amend(num) {
	$("#save").attr("type", "submit");
	$("#empty").attr("type", "button");
	
	var htm = $("#oid" + num).html();
	var htm1 = $("#oname" + num).html();
	console.log(htm1)
	var htm2 = $("#opass" + num).html();
	var htm3 = $("#towernum" + num).html();
	
	var htm4 = $("#odoorplate" + num).html();
	var htm5 = $("#otel" + num).html();
	var htm6 = $("#oidentity" + num).html();
	var htm7 = $("#oiputdate" + num).html();
	
	if (num1++ == 0) {
		$("#oid" + num).html(htm + '<input class="kuang"  form="form1" name="username" type="hidden" value="' + htm + '" />');
		$("#oname" + num).html('<input class="kuang"  form="form1" name="name" type="text" value="' + htm1 + '" />');
		$("#opass" + num).html('<input class="kuang" form="form1" name="password" type="text" value="' + htm2 + '" />');
		// $("#towernum" + num).html('<input class="kuang" form="form1" name="towernum"  type="text" value="' + htm3 + '" />');
		// $("#odoorplate" + num).html('<input class="kuang" form="form1" name="odoorplate"  type="text" value="' + htm4 + '" />');
		$("#otel" + num).html('<input class="kuang" form="form1" name="phone" type="text" value="' + htm5 + '" />');
		$("#oidentity" + num).html('<input class="kuang" form="form1" name="idcard"  type="text" value="' + htm6 + '" />');
		// $("#oiputdate" + num).html('<input class="kuang" form="form1"  name="uemail" type="text" value="' + htm7 + '" />');
	}	
}


function shipments(type,ordersid) {
	console.log(type+"------type-------");
	console.log(ordersid+"-----ordersid--------");
		$.ajax({
			type:'post', 
			url:'shipments.action?type='+type+'&ordersid='+ordersid,
			async:true,
			dataType : "json",
			success : function(date) {
				window.location.href ='allordershow.action?num=0&type=0';
			}
		});
}
function deleteone(oid) {
	console.log("sss", oid)
	var flag=confirm("确定注销编号为'"+oid+"'的账户吗？")
	   if(flag){
	  window.location = 'deleteone.action?oid=' +oid;
 }
}