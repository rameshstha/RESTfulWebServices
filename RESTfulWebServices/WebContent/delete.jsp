<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Delete Data</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
	<!--<script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script> -->
<!-- <script type="text/javascript" src="js/jquery-min.js"></script> -->
<!-- <script type="text/javascript" src="js/polyfill.js"></script> -->
<script type="text/javascript" src="js/delete.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

</head>
<body>
	<div class="container">
		<form>
			<input type="hidden" id="id_delete"
				value='<%= request.getParameter("id")%>' />
		</form>
		<div id="success_delete"></div>
		<div class="col-md-8">
			<a href="select.jsp" class="btn btn-danger">Go Back</a>
		</div>
	</div>
</body>
</html>