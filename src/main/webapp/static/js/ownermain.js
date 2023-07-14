$(function() {
	var iframe1 = $("#iframe1");
	/* 业主界面添加投诉 */
	$("#addcomplaint").click(function() {
		iframe1.attr("src", "addcomplaint.action");
	})
	/* 投诉建议信息查看 */
	$("#mycomplaint").click(function() {
		iframe1.attr("src", "mycomplaint.action");
	})
	/* 申报维修信息查看 */
	$("#appealss").click(function() {
		iframe1.attr("src", "addmaintain.action");
	})

	/* 通知 */
	$("#unread").click(function() {
		iframe1.attr("src", "unread.action");
	})
	$("#readed").click(function() {
		iframe1.attr("src", "readed.action");
	})
	/* 个人基本信息 */
	$("#showownerme").click(function() {
		iframe1.attr("src", "showoerme.action");
	})
	/*我的车位*/
	$("#mycarseat").click(function() {
		iframe1.attr("src", "mycarseat.action?uid="+$("#owneruid").val());
	})
	$("#ownerbuycar").click(function() {
		iframe1.attr("src", "ownerbuycar.action");
	})
	/*业主缴费*/
	$("#mybill").click(function() {
		iframe1.attr("src", "mybill.action");
	})
	$("#mybillpay").click(function() {
		iframe1.attr("src", "mybillpay.action");
	})
	
})
function showMessNum() {

	$.ajax({
		type:"post",
		url:"showMessNum.action",
		contentType:'application/json;charset=utf-8',
		success: function(data){
			
			$("#messnum").html(data[0]);
			$("#messnum1").html(data[1]);
			
	      }
	});
}

//这个是给用户界面提供的js文件，这里设置周期性调用函数
// var id = setInterval("showMessNum()", 1000);
