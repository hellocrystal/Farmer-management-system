$(function() {
	var iframe1 = $("#iframe1");

	/* 投诉 */
	$("#complain").click(function() {
		iframe1.attr("src", "complain.action");
	})

	$("#complainstate").click(function() {
		iframe1.attr("src", "complainstate.action?state=0");
	})

	$("#complainstateyes").click(function() {
		iframe1.attr("src", "complainstate.action?state=1");
	})

	$("#liushui").click(function() {
		iframe1.attr("src", "test.action");
	})
	/* 车位 */
	$("#allcar").click(function() {
		iframe1.attr("src", "allcar.action");
	})
	$("#acar").click(function() {
		iframe1.attr("src", "findcarbyarea.action?area=A");
	})
	$("#bcar").click(function() {
		iframe1.attr("src", "findcarbyarea.action?area=B");
	})
	$("#ccar").click(function() {
		iframe1.attr("src", "findcarbyarea.action?area=C");
	})
	$("#dcar").click(function() {
		iframe1.attr("src", "findcarbyarea.action?area=D");
	})
	$("#yescar").click(function() {
		iframe1.attr("src", "findcarbystate.action?state=1");
	})
	$("#nocar").click(function() {
		iframe1.attr("src", "findcarbystate.action?state=0");
	})
	/*出售车位*/
	$("#sellcar").click(function() {
		iframe1.attr("src", "sellcar.action");
	})
	
	

	/* 业主 */
	$("#alllose").click(function() {
		iframe1.attr("src", "findpagess.action?pageSize=5&pageNum=1&str=n");
	})
	$("#lose1").click(function() {
		iframe1.attr("src", "list2.action?towernum=1");
	})
	$("#lose2").click(function() {
		iframe1.attr("src", "list2.action?towernum=2");
	})
	$("#lose3").click(function() {
		iframe1.attr("src", "list2.action?towernum=3");
	})
	$("#lose4").click(function() {
		iframe1.attr("src", "list2.action?towernum=4");
	})
	$("#lose5").click(function() {
		iframe1.attr("src", "list2.action?towernum=5");
	})
	$("#lose6").click(function() {
		iframe1.attr("src", "list2.action?towernum=6");
	})
	$("#lose7").click(function() {
		iframe1.attr("src", "list2.action?towernum=7");
	})
	$("#lose8").click(function() {
		iframe1.attr("src", "list2.action?towernum=8");
	})
	$("#lose9").click(function() {
		iframe1.attr("src", "list2.action?towernum=9");
	})
	$("#lose10").click(function() {
		iframe1.attr("src", "list2.action?towernum=10");
	})

	/* 维修 */
	$("#allmaintain").click(function() {
		iframe1.attr("src", "malist.action");
	})
	$("#accomplish").click(function() {
		iframe1.attr("src", "malist2.action?mbit=已修理");
	})
	$("#listmaintain").click(function() {
		iframe1.attr("src", "malist2.action?mbit=未修理");
	})
	/* 保洁 */
	$("#clen1").click(function() {
		iframe1.attr("src", "cleanact1.action");
	})
	$("#clen2").click(function() {
		iframe1.attr("src", "cleanact2.action?claccomplish=已完成");
	})
	$("#clen3").click(function() {
		iframe1.attr("src", "cleanact2.action?claccomplish=未完成");
	})
	/* 绿化 */
	$("#afforest1").click(function() {
		iframe1.attr("src", "afforestact1.action");
	})
	$("#afforest2").click(function() {
		iframe1.attr("src", "afforestact2.action?afplush=已完成");
	})
	$("#afforest3").click(function() {
		iframe1.attr("src", "afforestact2.action?afplush=未完成");
	})

	/* 缴费 */
	$("#daijiao").click(function() {
		iframe1.attr("src", "unpayfy.action?pageSize=3&pageNum=1&type=f");
	})
	$("#sfmanage").click(function() {
		iframe1.attr("src", "sfmanage.action");
	})
	/* 职员管理 */
	$("#zhiyuanxinxi").click(function() {
		iframe1.attr("src", "findpage.action?pageSize=5&pageNum=1&str=n");
	})
	$("#zhiyuanqiandao").click(function() {
		iframe1.attr("src", "findpage.action?pageSize=5&pageNum=1&str=n");
	})
	$("#zhiyaunxiangqing").click(function() {
		iframe1.attr("src", "findpage.action?pageSize=5&pageNum=1&str=n");
	})
	/* 物料管理 */
	$("#wuliaoxiangqing").click(function() {
		iframe1.attr("src", "suppliesselectall.action");
	})
	$("#wuliaoshenpi").click(function() {
		iframe1.attr("src", "unpay.action");
	})
	$("#wuliaocaigou").click(function() {
		iframe1.attr("src", "unpay.action");
	})
	/* 装修 */
	$("#allAdorn").click(function() {
		iframe1.attr("src", "adornall.action");
	})
	$("#yesAdorn").click(function() {
		iframe1.attr("src", "findbystate.action?state=完成");
	})
	$("#actionAdorn").click(function() {
		iframe1.attr("src", "findbystate.action?state=装修中");
	})
	$("#noAdorn").click(function() {
		iframe1.attr("src", "findbystate.action?state=未装修");
	})

	/* 设备 */
	$("#chakanshebei").click(function() {
		iframe1.attr("src", "facilityselectall.action");
	})

	/* 商铺 */
	$("#allStore").click(function() {
		iframe1.attr("src", "allstore.action");
	})
	$("#yesStore").click(function() {
		iframe1.attr("src", "findadornbystate.action?state=占用");
	})
	$("#noStore").click(function() {
		iframe1.attr("src", "findadornbystate.action?state=未占用");
	})
	$("#biddingstore").click(function() {
		iframe1.attr("src", "biddingshow.action");
	})
	/* 商铺竞标审核 */
	$("#biddinging").click(function() {
		iframe1.attr("src", "biddinging.action");
	})
	/* 未审核 */
	$("#auditing").click(function() {
		iframe1.attr("src", "auditingbyaudit.action?audit=审核中");
	})
	/* 审核通过 */
	$("#yesaudit").click(function() {
		iframe1.attr("src", "auditingbyaudit.action?audit=审核通过");
	})
	/* 未通过 */
	$("#noaudit").click(function() {
		iframe1.attr("src", "auditingbyaudit.action?audit=审核未通过");
	})
	/* 取消竞标 */
	$("#exitaudit").click(function() {
		iframe1.attr("src", "auditingbyliftstate.action?liftstate=1");
	})

	/* 房屋资源管理 */
	$("#allhouse").click(function() {
		iframe1.attr("src", "showhouse.action?type=a");
	})
	$("#saledhouse").click(function() {
		iframe1.attr("src", "showhouse.action?type=y");
	})
	$("#unsaledhouse").click(function() {
		iframe1.attr("src", "showhouse.action?type=x");
	})
})
