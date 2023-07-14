/**
 * 全选js
 * 
 */
//全选和全不选
var checks = document.getElementsByName("ids");
var quanxuan = document.getElementById("quanxuan");
quanxuan.onclick = function() {
	if (this.checked) {
		for (var i = 0; i < checks.length; i++) {
			checks[i].checked = true;
		}
	} else {
		for (var i = 0; i < checks.length; i++) {
			checks[i].checked = false;
		}
	} 
};
//给每个复选框添加点击事件
for (var i = 0; i < checks.length; i++) {
	checks[i].onclick = function() {
		var flag = true;
		for (var j = 0; j < checks.length; j++) {
			if (!checks[j].checked) {
				flag = false;
				quanxuan.checked = flag;
				break;
			}
			quanxuan.checked = flag;
		}

	}
}
function CheckPost ()
{
   var check = document.getElementsByName("ids");
   var bflag = false;

   for(var i=0;i<check.length;i++)
   {
	   if(check[i].checked)
	   {
		   bflag=true;
		   break;
	   }
   }
   if(bflag == false) {
		alert("请选择要缴费的选项");
		return false;
      }
 return bflag;
}