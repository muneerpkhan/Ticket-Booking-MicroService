$(document).ready(function(){
	
		/*var dateToday = new Date(); 
	    var slot; 
	    var dates = $("#bookingDate").datepicker({ 
	    	defaultDate: "+1w", 
	        changeMonth: true, 
	        minDate: dateToday, 
	        onSelect: function(selectedDate) { 
	         var option = this.id == "from" ? "minDate" : "maxDate", 
	          instance = $(this).data("datepicker"), 
	          date = $.datepicker.parseDate(instance.settings.dateFormat || $.datepicker._defaults.dateFormat, selectedDate, instance.settings); 
	         dates.not(this).datepicker("option", option, date); 
	         //if(validateInput(false)){ 
	          //getSlotInfo(); 

	         }//
	        }*/
	   /* });*/

		
	
		
	$('#name-error-message').hide();
	$('#password-error-message').hide();
	$('#repassword-error-message').hide();
	$('#email-error-message').hide();
	
	var error_name=false;
	var error_password=false;
	var error_repassword=false;
	var error_email=false;
//$("#submit").validate(){
	$('#name').focusout(function(){
		ckeck_name();
	});
		$('#password').focusout(function(){
			ckeck_password();
		});
			$('#repassword').focusout(function(){
				ckeck_repassword();
			});
				$('#email').focusout(function(){
					ckeck_email();
		
	});
function ckeck_name(){
var name_length = $("#name").val().length;
if(name_length<5 || name_length>20){
	toastr.options.progressBar = true;
	toastr.options.closeButton = true;
	toastr.success('Enter name');
//$("#username-error-message").html("should be between 5-20 characters");
//$("#username-error-message").show();
error_username=true;
}
else{
$("#name-error-message").hide();
					
}
}
function ckeck_password(){
var password_length=$("#password").val().length;
if(password_length<8){
	toastr.info('Password < 8 characters');
//$("#password-error-message").html("password length should be 8");
//$("#password-error-message").show();
error_password=true;
}
else{
$("#password-error-message").hide();
}
}
function ckeck_repassword(){
var password=$("#password").val();
var retypassword=$("#repassword").val();
if(password!=retypassword){
	toastr.error('Password Not Matched');
//$("#repassword-error-message").html("retype password must be match");
//$("#repassword-error-message").show();
 error_repassword=true;
}
else{
$("#repassword-error-message").hide();
}
}
function ckeck_email(){
var pattern=new RegExp(/^[+a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i);
if(pattern.test($("#email").val())){
$("#email-error-message").hide();
				}
else
{
	toastr.warning('Invalid Email');
//$("#email-error-message").html("invalid email");
//$("#email-error-message").show();
error_email=true;
}
}
	 
$("#register_form").submit(function(){
					error_name=false;
					 error_password=false;
					 error_repassword=false;
					 error_email=false;
					 
					 ckeck_name();
					 ckeck_password();
					 ckeck_repassword();
					 ckeck_email();
					 
 if(error_name == false && error_password == false && error_repassword == false && error_email == false){
	return true;
					 }
					 else{
						 return false;
					 }
					 
				});
$('#register').click(function(){
	var name=$('#name').val();
	var password=$('#password').val();
	var repassword=$('#repassword').val();
	var email=$('#email').val();
	 var data = 'name='+ name + '&password='+ email + '&repassword='+ password + '&email='+ email;
	/* $.ajax({
         url: 'register.jsp', // url where to submit the request
         type : "POST", // type of action POST || GET
         data : data, // post data || get data
         success : function(data) {
        	 $('#name').val(data.name);
        	 toastr.success('Successfully Loaded'); 
         }
         });*/
	 if(name == '' || password == '' || repassword == '' || email == ''){
		 $('#ajxdiv').load('failure.jsp');
	 }
	 else{
		 
		 //$('#ajxdiv').load('register.jsp');
		 toastr.success('successfully stored');
	 }
	
});

    });  


	

				