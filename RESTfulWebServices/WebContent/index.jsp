<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Add New Data</title>
<script type="text/javascript" src="js/jquery-min.js"></script>
<script type="text/javascript" src="js/polyfill.js"></script>
<script type="text/javascript" src="js/insert.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form class="form-horizontal" id="userRegistration"
			name="userRegistration" action="#">
			<fieldset>

				<!-- Form Name -->
				<legend>Add Profile</legend>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="id">ID</label>
					<div class="col-md-4">
						<input id="id" name="id" type="text" placeholder=""
							class="form-control input-md" required value="" />

					</div>
				</div>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="fullname">Full
						Name</label>
					<div class="col-md-4">
						<input id="fullname" name="fullname" type="text" placeholder=""
							class="form-control input-md" required value="" />

					</div>
				</div>

				<!-- radio input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="gender">Gender</label>
					<div class="col-md-4">
						<input type="radio" name="gender" id="gender" value="Male" checked>
						Male <br>
						<input type="radio" name="gender" id="gender" value="Female">
						Female

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="state">State</label>
					<div class="col-md-4">
						<input id="state" name="state" type="text" placeholder=""
							class="form-control input-md" required />

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="city">City</label>
					<div class="col-md-4">
						<input id="city" name="city" type="text" placeholder=""
							class="form-control input-md" required />
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="street">Street</label>
					<div class="col-md-4">
						<input id="street" name="street" type="text" placeholder=""
							class="form-control input-md" required />
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="zip">Zip Code</label>
					<div class="col-md-4">
						<input id="zip" name="zip" type="text" placeholder=""
							class="form-control input-md" required />
					</div>
				</div>

				<div class="form-group">
					<label class="col-md-4 control-label" for="birthyear">Birth
						Year</label>
					<div class="col-md-4">
						<input id="birthyear" name="birthyear" type="text" placeholder=""
							class="form-control input-md" required />
						<p id="ageError"></p>
					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="email">Email</label>
					<div class="col-md-4">
						<input id="email" name="email" type="text" placeholder=""
							class="form-control input-md" required />
					</div>
				</div>
				<!-- Register Button -->
				<div class="form-group">
					<label class="col-md-4 control-label"></label>
					<div class="col-md-8">
						<button id="add" name="add" class="btn btn-success">Add</button>
						<a href="select.jsp" class="btn btn-danger">Go Back</a>
					</div>
				</div>
			</fieldset>
		</form>
      <br />
	<div id="div_ajaxResponse"></div>
	</div>
</body>
</html>