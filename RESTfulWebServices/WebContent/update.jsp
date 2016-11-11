<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
<html>
<head>
	<title>Edit Data</title>
	<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script> -->
	<script type="text/javascript" src="js/jquery-min.js"></script>
	<script type="text/javascript" src="js/polyfill.js"></script>
	<script type="text/javascript" src="js/update.js"></script>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	
	</head><body>
	<div class="container">
		<form class="form-horizontal" id="updateData" name="updateData" action="#">
			<fieldset>
				<!-- Form Name -->
				<legend>Update Data</legend>
                	<input type="hidden" id="id_update" value='<%= request.getParameter("id") %>'>	
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="id">ID</label>  
					<div class="col-md-4">
						<input id="id"  name="id" type="text" placeholder="" class="form-control input-md" required readonly/>
					</div>
				</div>
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="fullname">Full Name</label>  
					<div class="col-md-4">
						<input id="fullname"  name="fullname" type="text" placeholder="" class="form-control input-md" required/>
					</div>
				</div>
                
				<!-- radio input-->
						<div class="form-group">
							<label class="col-md-4 control-label" for="gender">Gender</label>
							<div class="col-md-4" >
								<input type="radio"
									name="gender" id="gender" value="1" checked>
									Male <br><input type="radio" name="gender" id="gender"
									value="0"> Female
								
							</div>
						</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="state">State</label>  
					<div class="col-md-4">
						<input id="state"  name="state" type="text" placeholder="" class="form-control input-md" required/>

					</div>
				</div>

				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="city">City</label>  
					<div class="col-md-4">
						<input id="city" name="city" type="text" placeholder="" class="form-control input-md" required/>
					</div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="street">Street</label>  
					<div class="col-md-4">
						<input id="street" name="street" type="text" placeholder="" class="form-control input-md" required/>
					</div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="zip">Zip Code</label>  
					<div class="col-md-4">
						<input id="zip" class="zip" name="zip" type="text" placeholder="" class="form-control input-md" required/>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-4 control-label" for="birthyear">Birth Year</label>  
					<div class="col-md-4">
						<input id="birthyear" name="birthyear" type="text" placeholder="" class="form-control input-md" required/>
						<p id="ageError"></p>
					</div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
					<label class="col-md-4 control-label" for="email">Email</label>  
					<div class="col-md-4">
						<input id="email" name="email" type="text" placeholder="" class="form-control input-md" required/>
					</div>
				</div>
				<input type="hidden" id="userid">
				<!-- Register Button -->
				<div class="form-group">
				<label class="col-md-4 control-label" ></label>
					<div class="col-md-8">
						<button  id="btnUpdate" name="btnUpdate" class="btn btn-success">Update</button>
						<a href="select.jsp" class="btn btn-danger">Go Back</a>
					</div>
				</div>
			
			</fieldset>
			
		</form>
		<br>
    <div id="success_update"></div>
	</div>
</body>
</html>