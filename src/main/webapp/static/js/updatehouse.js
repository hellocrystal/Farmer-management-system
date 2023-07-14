/**
 * 跟新房屋信息js
 */
	function show() {
		var div= $("#sale");
		var type=$("#choose").val();
		if (type == "已出售") {
			div.css("display","block");

		}else{
			div.css("display","none");
			
		}
	}
	function quxiao(){
		var status=$("#choose").val();	
		if(status=="闲置"){
			window.location="http://localhost:8089/garden/showhouse.action?type="+'x';}
		else {
			window.location="http://localhost:8089/garden/showhouse.action?type="+'y';}
			
		}
	
