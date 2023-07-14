var flag = true;
function douseglim() {
	document.bgColor = "#000000";
}

function lightup() {
	document.bgColor = "#ffffff";
}

function big() {
	var v = document.getElementsByTagName("video")[0];
	v.style.width = "1000px";
}

function small() {
	var v = document.getElementsByTagName("video")[0];
	v.style.width = "325px";
}

function moderation() {
	var v = document.getElementsByTagName("video")[0];
	v.style.width = "700px";
}

function on() {
	var deng = document.getElementById("deng");
	if(flag) {
		deng.src = "../img/on.gif";
	} else {
		deng.src = "../img/off.gif";
	}
	flag = !flag;

}