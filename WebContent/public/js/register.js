$(document).ready(function(){
	$('#register').click(function(){
	var name=$("#name").val();
	var password=$("#password").val();
	var repassword=$("#repassword").val();
	var email=("#email").val();
	if(name=='' || password == '' || repassword == '' || email == '' ){
		toastr.options.progressBar = true;
		toastr.options.closeButton = true;
		toastr.success('fill all the fields');
	}
	else if((password.length)< 8)
	{
		toastr.options.progressBar = true;
		toastr.options.closeButton = true;
		toastr.success('password should be lessthan 8');
		
	}
	else if((password).match(repassword)){
		toastr.options.progressBar = true;
		toastr.options.closeButton = true;
		toastr.success('password should be match');
		
	}
	else if(email){
		toastr.success('enter valid email');	
	}
	$.post("register.jsp", {
		name1: name,
		email1: email,
		password1: password,
		}, function(data) {
		if (data == 'You have Successfully Registered.....') {
		$("form")[0].reset();
		}
		alert(data);
		});
	});
		
		
	
	
});