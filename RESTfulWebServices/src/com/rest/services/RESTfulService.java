package com.rest.services;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rest.dao.SchemaDatabase;
import com.rest.util.JSONArray;
import com.rest.util.JSONObject;

@Path("/data")
public class RESTfulService {
	@Path("/insert")
	@POST
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	public Response addData(String incomingData) throws Exception {
		String returnString = null;
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObject = new JSONObject();

		SchemaDatabase schemaDAO = new SchemaDatabase();
		try {
			JSONObject jsonData = new JSONObject(incomingData);
			System.out.println(incomingData);
			int http_code = schemaDAO.insertData(jsonData.optInt("id"), jsonData.optString("fullname"),
					jsonData.optString("gender"), jsonData.optString("state"), jsonData.optString("city"),
					jsonData.optString("street"), jsonData.optInt("zip"), jsonData.optInt("birthyear"),
					jsonData.optString("email"));
			if(http_code==200){
				jsonObject.put("HTTP_CODE","200");
				jsonObject.put("MSG","Data has been inserted sucessfully");
				returnString=jsonArray.put(jsonObject).toString();
			}
			else{
				return Response.status(500).entity("Unable to enter at this time").build();
			}
			System.out.println(returnString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.ok(returnString).build();
	}
	
	@Path("/details")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response dataInfo() throws Exception{
		String returnValue=null;
		JSONArray jsonArray=new JSONArray();
		
		try{
			SchemaDatabase sdatabase=new SchemaDatabase();
			jsonArray=sdatabase.dataDetails();
			returnValue=jsonArray.toString();
		}
		catch(Exception e){
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to send data at this time").build();
		}
		return Response.ok(returnValue).build();
	}
	
	@Path("/details/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response data4Info(@PathParam("id") int id) throws Exception{
		String returnValue=null;
		JSONArray jsonArray=new JSONArray();
		
		try{
			SchemaDatabase sdatabase=new SchemaDatabase();
			jsonArray=sdatabase.data4Details(id);
			returnValue=jsonArray.toString();
		}
		catch(Exception e){
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to send data at this time").build();
		}
		return Response.ok(returnValue).build();
	}
	
	//update
	@Path("/update")
	@PUT
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateDatas(String incomingData) throws Exception {
		String returnString = null;
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObject = new JSONObject();

		SchemaDatabase schemaDAO = new SchemaDatabase();
		try {
			JSONObject jsonData = new JSONObject(incomingData);
			System.out.println(incomingData);
			int http_code = schemaDAO.updateData(jsonData.optInt("id"), jsonData.optString("fullname"),
					jsonData.optString("gender"), jsonData.optString("state"), jsonData.optString("city"),
					jsonData.optString("street"), jsonData.optInt("zip"), jsonData.optInt("birthyear"),
					jsonData.optString("email"));
			if(http_code==200){
				jsonObject.put("HTTP_CODE","200");
				jsonObject.put("MSG","Data has been updated sucessfully");
				returnString=jsonArray.put(jsonObject).toString();
			}
			else{
				return Response.status(500).entity("Unable to enter at this time").build();
			}
			System.out.println(returnString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.ok(returnString).build();
	}
	
	@Path("/delete/{id}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteData(@PathParam("id") int id) throws Exception{
		String deleteValue=null;
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObject = new JSONObject();
	
		try{
			SchemaDatabase sdatabase=new SchemaDatabase();
			
			int http_code=sdatabase.deleteDetails(id);
			if(http_code==200){
				jsonObject.put("HTTP_CODE","200");
				jsonObject.put("MSG","Data has been deleted sucessfully");
				deleteValue=jsonArray.put(jsonObject).toString();
			}
			else{
				return Response.status(500).entity("Unable to delete at this time").build();
			}
		}
		catch(Exception e){
			e.printStackTrace();
			return Response.status(500).entity("Server was not able to delete data at this time").build();
		}
		return Response.ok(deleteValue).build();
	}
}