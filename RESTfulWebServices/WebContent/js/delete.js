$(function() {
	var id=$('#id_delete').val();
	$.ajax({
		type : "DELETE",
		url : "./api/data/delete?id="+id,
		error : function(jqXHR, textStatus, errorThrown) {
			console.log("Error " + jqXHR.getAllResponseHeaders() + " "
					+ errorThrown);
		},
		success : function(data) {
			//console.log(data);
			if (data[0].HTTP_CODE == 200) {
				$('#success_delete').text(data[0].MSG);
			}
		},
		complete : function(XMLHttpRequest) {
			//console.log( XMLHttpRequest.getAllResponseHeaders() );
		},
		dataType : "json" //request JSON
	});
});
