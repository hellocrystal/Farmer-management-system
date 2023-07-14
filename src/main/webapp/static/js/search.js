/**
 * 
 */
function showName(n){
	
	$.post("showname.action",{name:n},function(result){
		
		var html = "";
		console.log(result);
		$.each(result,function(i,c){
			//html += "<option value="+"\""+c+"\""+ "onclick="+"\""+'javascript:window.location.href='+"\""+'login.action'+"\""+">";
			//html +="<a"+"  onclick="+"\""+'javascript:window.location.href='+"\""+'login.action'+"\""+">"+"<option value="+"\""+c+"\""+">"+"</a>";
			html += "<option value='"+c.oname+"'>";
		});
		console.log(html);
		$("#hint").html(html);
		
	},"json");
	console.log(n);
/*	$.ajax({
		  type: 'POST', 
		  url: "showname.action",
		  data: {name:n},
		  contentType:"application/json;charset=utf-8",
		  
		  success: function(result){
				var html = "";
				console.log(result);
				$.each(result.list,function(i,c){
					html += "<option value='"+c+"'>";
				});
				$("#hint").html(html);
			}
		})*/;
}
function zdycx(pageSize){
	var pageNum=$("#pnum").val();
	console.log(pageSize);
	console.log(pageNum);
	var a="unpayfy.action?pageSize="+pageSize+"pageNum="+pageNum+"type=f";
	console.log(a);
	
	window.location.href="unpayfy.action?pageSize="+pageSize+"&pageNum="+pageNum+"&type=f";
	
}