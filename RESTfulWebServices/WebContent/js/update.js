$(function() {

	var id=$('#id_update').val();

	$.ajax({  
			type: "GET",
			url: "./api/data/details?id="+id,
			error: function(jqXHR, textStatus, errorThrown) {
				console.log(jqXHR.responseText);
			},
			success: function(data) {
				dataDetails(data);
			},
			complete: function(XMLHttpRequest) {
				//console.log( XMLHttpRequest.getAllResponseHeaders() );
			}, 
			dataType: "json" //request JSON
		});
	
	$('#btnUpdate').click(function(e) {
		e.preventDefault(); //cancel form submit
		var jsObj = $('#updateData').serializeObject();
		
		
		$.ajax({  
			type: "PUT",
			url: "./api/data/update", 
			data: JSON.stringify(jsObj), 
			contentType:"application/json",
			error: function(jqXHR, textStatus, errorThrown) {
				console.log("Error " + jqXHR.getAllResponseHeaders() + " " + errorThrown);
			},
			success: function(data) { 
				//console.log(data);
				if(data[0].HTTP_CODE == 200) {
					$('#success_update').text( data[0].MSG );
				}
			},
			complete: function(XMLHttpRequest) {
				//console.log( XMLHttpRequest.getAllResponseHeaders() );
			}, 
			dataType: "json" //request JSON
		});
	});
});

function dataDetails(data){
	var obj=data[0];
	$("#id").val(obj.id);
	$("#fullname").val(obj.fullname);
	$("#gender").val(obj.gender);
	$("#state").val(obj.state);
	$("#city").val(obj.city);
	$("#street").val(obj.street);
	$("#birthyear").val(obj.birthyear);
	$("#zip").val(obj.zip);
	$("#email").val(obj.email);
}