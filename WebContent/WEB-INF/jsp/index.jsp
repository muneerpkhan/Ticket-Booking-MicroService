<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajax Call</title>

<script type="text/javascript" src="<c:url value="/public/js/jquery.js" />"></script> 
<script type="text/javascript" src="<c:url value="/public/js/jquery-1.7.js" />"></script>
<!-- <script type="text/javascript">
    function process(){
    $.ajax({
    	
    	url:"index.htm" ,
    	success :	function(data){
    		$("underInput").html(data);
    		
    	}
    	
    });
    }
</script> -->
</head>
<body>
 <h3>The Chef Bucket</h3>
 Enter the food you like to order:
 <input type="text" id="userInputmine" name="userInputmine"/>
 <div id="underInput"></div>
 <a href="RegisterForm.htm">Register</a>
</body>
</html>