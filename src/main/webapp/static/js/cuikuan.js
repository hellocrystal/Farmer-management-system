/**
 *
 */
function cuikuan(n) {

    $.post("cuikuan.action", {oid: n}, function (result) {
        console.log(result);
        q = $("#td" + n);
        q.html("已催款");
        q.css("color", "red");
        q.css("font-size", "26px");
    }, "json");
}

function showadd(n, oid) {
    $("#oid").val(oid);
    $("#ownername").val(n);
    $("#messinfo").val(n + "你好：");
    var div = $("#sendmessdiv");
    div.css("display", "block");
}

function quxiao() {
    var div = $("#sendmessdiv");
    div.css("display", "none");
}

/**
 * 发送消息ajax
 * @returns
 */
function sendmess() {

    var uid = $("#oid").val();
    var messinfo = $("#messinfo").val();
    /*console.log(uid);
    console.log(messinfo);*/

    $.post("sendmess.action", {message: messinfo, oid: uid}, function (result) {
        var div = $("#sendmessdiv");
        div.css("display", "none");
        alert("已经给" + result + "成功发送了消息");

    }, "json");

}