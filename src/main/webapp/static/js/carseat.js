$(function(){
	var duration = $("#i2").html();
	$("#i2").html(--duration);
	var s2 = $("#s2").html();
	setInterval(() => {
		$("#i2").html(duration);
		s2--;
		$("#s2").html(s2);
		if(s2==0){
			$("#s2").html("00");
			s2=59;
			duration--;
			if(duration==0){
				$("#s2").html("结");
				$("#i2").html("束");
			}
		}
	}, 1000);
	setInterval(() => {
		$.ajax({
			type:"post",
			url:"updatetime.action",
			contentType:'application/json;charset=utf-8',
			success: function(data){
		      }
		});
	}, 60000);
});

function select(e) {
	if($(e).attr("class")=="red"){
		alert("此车位已被选择");
	}else{
		$(".blue").attr("class","green");
		$(e).attr("class","blue");
		$(".sure").css("display","block");
		$("#tipsesssion").css("display","block");
		var hideen = $(e).children(":first").attr("id","bb");
		setTimeout(() => {
			$("#tipsesssion").css("display","none");
		}, 2000);
	}
}
function sureh() {
	$.ajax({
		type:"post",
		url:"suresellcar.action?uid="+$("#bb").val(),
		contentType:'application/json;charset=utf-8',
		success: function(data) {
			if(data){
				alert("购买成功！")
				window.location.href="mycarseat.action?uid="+$("#bb").val(); 
			}else{
				alert("购买成功！")
				window.location.href="mycarseat.action?uid="+$("#bb").val();
			}
	      },
	      error(data){
	    	  alert("购买成功！");
	    	  window.location.href="mycarseat.action?uid="+$("#bb").val();
	      }
	});
}