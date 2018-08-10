<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri ="http://www.springframework.org/tags/form" prefix="form" %>   
<%@taglib uri ="http://java.sun.com/jstl/core_rt" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MOVIES</title>
<style type="text/css">
h3 {
	color: blue;
	text-align: center;
	text-decoration: underline;
}

.container {
	text-align: center;
}
.displaydiv{
  text-align: center;
} 
</style>
<script type="text/javascript" src="<c:url value="/public/js/jquery.js" />"></script> 
<script type="text/javascript" src="<c:url value="/public/js/jquery-1.7.js" />"></script>
<script type="text/javascript" src="<c:url value="/public/js/toastr.js" />"></script>
<script type="text/javascript" src="<c:url value="/public/js/vlidate.js" />"></script>
</head>
<body>
<h3>Movie Ticket Booking </h3><br><br>
<div class="container">
<div class="main">
			<form:form action="/SpringAnnotations/AddingMovies" method="post">
				<label for="name" style="color: blue;">MOVIE NAME</label>
				<input type="text" name="name" id="name" />
				<input type="submit" name="addMovie" value="Add Movie"
					style="color: blue">
			</form:form>
		

</div>	<br><br>
<div class="displaydiv">
				<table align="center" style=" color :blue; ">
					<thead></thead>
					 <tbody>
												<c:forEach var="moviesList" items="${moviesList}">
													
													<tr >
													 
													<td ><a href="#" alt ="BookNow">${moviesList.getName()}</a></td> 
													 
													</tr>
												</c:forEach>
											</tbody>
				</table>
			</div>

</div>

		
</body>
</html>