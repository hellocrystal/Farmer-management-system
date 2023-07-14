$(function() {
	$("#selectAll").on("click", function() {
		$("input[name='ids']").prop('checked', this.checked);
	});
	$("input[name='ids']").on(
			"click",
			function() {
				var $sub = $("input[name='ids']");
				$("#selectAll").prop(
						"checked",
						$sub.length == $sub.filter(":checked").length ? true
								: false);
			})
	$("#shipments").click(function(){
		alert("已经催促处理！");
	})
})