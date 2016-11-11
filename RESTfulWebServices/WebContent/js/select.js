/**
 * js file for post.html Please use modern web browser as this file will not
 * attempt to be compatible with older browsers. Use Chrome and open javascript
 * console or Firefox with developer console.
 * 
 * jquery is required
 */
$(function() {

	$.ajax({
		type : "GET",
		url : "http://localhost:7001/RESTfulWebServices/api/data/details",
		contentType : "application/json",
		error : function(jqXHR, textStatus, errorThrown) {
			console.log(jqXHR.responseText);
		},
		success : function(data) {
			// console.log(data);
			var html_string = '<tr>' + '<td>Full Name</td>'
					+ '<td> Gender</td>' + '<td>State </td>' + '<td>City</td>'
					+ '<td>Street</td>' + '<td>Zip</td>' + '<td>Birthyear</td>'
					+ '<td>Email</td>' + '<td>Action</td>' + '</tr>';

			$.each(data, function(index, item) {
				// console.log(val1);
				html_string = html_string + templateGetDetails(item);
			});

			$('#getData').html(
					"<table class='table'>" + html_string + "</table>");
		},
		complete : function(XMLHttpRequest) {
			// console.log( XMLHttpRequest.getAllResponseHeaders() );
		},
		dataType : "json" // request JSON
	});
	$('#btnAdd').click(btnadd);

});
function btnadd() {
	window.location.href = './index.jsp';
}
function templateGetDetails(param) {
	return '<tr>' + '<td class="fullname">' + param.fullname + '</td>'
			+ '<td class="gender">' + param.gender + '</td>'
			+ '<td class="state">' + param.state + '</td>' + '<td>'
			+ param.city + '</td>' + '<td>' + param.street + '</td>' + '<td>'
			+ param.zip + '</td>' + '<td>' + param.birthyear + '</td>' + '<td>'
			+ param.email + '</td>' + '<td><a class="update" id="' + param.id
			+ '" href="javascript:updateData(' + param.id
			+ ');">Update</a> | <a class="delete" id="' + param.id
			+ '" href="javascript:deleteData(' + param.id
			+ ');">Delete</a></td>' + '</tr>';
}

function updateData(id) {
	window.location.href = './update.jsp?id='
			+ id;
}
function deleteData(id) {
	window.location.href = './delete.jsp?id='
			+ id;
}