/*$(function() {
	var num = 0;
	var bbb = $(".selectOne");
	var ddd = $(".selectOne").length;
	$("#selectAll").click(function() {
		var aaa = $("#selectAll").prop("checked");
		if (aaa) {
			num = bbb.length;
			console.log(num);
			$(".selectOne").prop("checked", "checked");
		} else {
			num = 0;
			console.log(num);
			$(".selectOne").removeAttr("checked");
		}
	})
	$(".selectOne").click(function() {
		var ccc = $(".selectOne").prop("checked");
		if (ccc) {
			num++;
			console.log(num);
			name(num);
		} else {
			num--;
			console.log(num);
			name(num);
		}
	})
	function name(num) {
		if (num == ddd) {
			$("#selectAll").prop("checked", "checked");
		}
	}

})*/
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

})