$(".menu").mousedown(function(){
	$(this).toggleClass("closed");
	
	if($(this).hasClass("closed")) {
		$(".main.button").text("菜单");
	} else {
		$(".main.button").text("关闭");
	}
})
function mm(num) {
	var iframe1 = $("#iframe1");
	switch (num) {
	case 1:
		iframe1.attr("src", "showoerme.action");
		break;
	case 2:
		 iframe1.attr("src", "mycomplaint.action");
		break;
	case 3:
		 iframe1.attr("src", "mycarseat.action?uid="+$("#owneruid").val());
		break;
	case 4:
		console.log("----------")
		break;
	default:
		break;
	}
}