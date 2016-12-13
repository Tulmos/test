$(function() {
	// 登陆面板输入项键盘弹起事件
    $("#clear").click(function(){
        $("#text").val("");
    })
	$("#count").click(function(){
		var str = $("#text").val();
		$.ajax({
			"url" : "hello",
			"type" : "post",
			"dataType" : "json",
            //"contentType": "application/x-www-form-urlencoded; charset=utf-8",
			"data" : {
				text : str
			},
			"success" : function(json) {
                console.log(json);
				console.log("true1");
                $("#number").val(json.number);
                $("#Chinese_Characters").val(json.Chinese_characters);
                $("#symbol").val(json.symbol);
                $("#letter").val(json.letter);
                $("#Seq0").val(json.Seq0);
                $("#Seq1").val(json.Seq1);
                $("#Seq2").val(json.Seq2);
			},
			"error" : function() {
				console.log("fail");
			}
		});
	})
	
});