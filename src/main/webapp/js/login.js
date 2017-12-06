$(document).ready(function(){
	$("#loginId").on("click",dofindByUname)

		$("#modal-dialog").on("click",dofindByUname1);
	
	//2.模态框隐藏时移除click事件,移除绑定的数据
	$("#modal-dialog").on('hidden.bs.modal', function (e) {
		$("#modal-dialog").off("click",".ok"); 
		$("#modal-dialog").removeData("id");
	})
});


function dofindByUname(){
	console.log("登录");
	var url = "doLogin.do";
	$("#modal-dialog .modal-body").load(url,function(e){
		$("#myModalLabel").html("登录");
		//显示模态框
		$('#modal-dialog').modal('show');
	});
	
}

function setEditFormData(result){
	$("#dlzhId").val(result.uname);
	$("#dlmmId").val(result.password);
}

function dofindByUname1(){
	//debugger
	//0.对表单数据进行非空验证
	console.log("1212");
	if(!$("#dlFormId").valid()){//  对required
		return;
	}
	//1.获取表单数据
	var params = getEditFormData();
	if(params.uname==null){
		return;
	}
	console.log(params);
	//2.异步提交表单数据
	var url = "doFindByUname.do";
	$.post(url,params,function(result){
		if(result.state==1){
			alert(result.message);
			doGetObjects();
			$("#modal-dialog").modal('hide');
		}else{
			alert(result.message);
		}
	});
}
function getEditFormData(){
	var params = {
			"uname":$("#dlzhId").val(),
			"password":$("#dlmmId").val()
	}
	return params;
}