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
	
	var htm = $("#afid" + num).html();
	var htm1 = $("#afarea" + num).html();
	
	var htm2 = $("#afcontent" + num).html();
	var htm3 = $("#afplush" + num).html();
	
	var htm4 = $("#clerkid" + num).html();
	var htm5 = $("#afmaterials" + num).html();
	
	
	if (num1++ == 0) {
		$("#afid" + num).html(htm+'<input class="kuang"  form="form1" name="afid" type="hidden" value="' + htm + '" />');
		$("#afarea" + num).html('<input class="kuang"  form="form1" name="afarea" type="text" value="'+  htm1 +'" />');
		$("#afcontent" + num).html('<input class="kuang" form="form1" name="afcontent" type="text" value="' + htm2 + '" />');
		$("#afplush" + num).html('<input class="kuang" form="form1" name="afplush"  type="text" value="' + htm3 + '" />');
		$("#clerkid" + num).html('<input class="kuang" form="form1" name="clerkid"  type="text" value="' + htm4 + '" />');
		$("#afmaterials" + num).html('<input class="kuang" form="form1" name="afmaterials" type="text" value="' + htm5 + '" />');
		
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
function deleteone(afid) {
	var flag=confirm("确定注销编号为'"+afid+"'的信息吗？")
	   if(flag){
	  window.location = 'deleteaff.action?afid=' +afid;
 }
}

function updatembit2(afid) {
	var flag=confirm("确定完成编号为'"+afid+"'的信息吗？")
	   if(flag){
	  window.location = 'updapushaf.action?afid=' +afid;
 }
}
function deleteAll(clids) {
	var flag=confirm("确定注删除这些账户吗？")
	   if(flag){
	  window.location = 'deleteAll.action?clid=' +clids;
 }
}