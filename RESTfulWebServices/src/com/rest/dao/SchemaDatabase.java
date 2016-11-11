package com.rest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.rest.util.JSONArray;

public class SchemaDatabase extends DataConnection {
	public int insertData(int id, String fullname, String gender, String state, String city, String street, int zip,
			int birthyear, String email) throws Exception {
		PreparedStatement query = null;
		Connection conn = null;
		try {
			conn = DatabaseConnect();
			query = conn.prepareStatement(
					"insert into system.data(id,fullname,gender,state,city,street,zip,birthyear,email) values(?,?,?,?,?,?,?,?,?)");
			query.setInt(1, id);
			query.setString(2, fullname);
			query.setString(3, gender);
			query.setString(4, state);
			query.setString(5, city);
			query.setString(6, street);
			query.setInt(7, zip);
			query.setInt(8, birthyear);
			query.setString(9, email);
			query.executeQuery();
			query.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			return 500;
		} finally {
			if (conn != null)
				conn.close();
		}

		return 200;
	}
	
	public JSONArray dataDetails()throws Exception{
		PreparedStatement query=null;
		Connection conn=null;
		JSONArray jsonArray=new JSONArray();
		
		try{
			conn=DatabaseConnect();
			query=conn.prepareStatement("select id,fullname,gender,state,city,street,zip,birthyear,email from system.data");
			ResultSet rs=query.executeQuery();
			jsonArray=JSONArray.convertResultSetIntoJSON(rs);
			
			query.close();
		}
		catch(Exception e){
			e.printStackTrace();
			return jsonArray;
		}
		finally{
			if(conn!=null)
				conn.close();
		}
		return jsonArray;
	}
	
	public JSONArray data4Details(int id)throws Exception{
		PreparedStatement query=null;
		Connection conn=null;
		JSONArray jsonArray=new JSONArray();
		
		try{
			conn=DatabaseConnect();
			query=conn.prepareStatement("select id,fullname,gender,state,city,street,zip,birthyear,email from system.data where id=?");
			query.setInt(1, id);
			ResultSet rs=query.executeQuery();
			jsonArray=JSONArray.convertResultSetIntoJSON(rs);
			
			query.close();
		}
		catch(Exception e){
			e.printStackTrace();
			return jsonArray;
		}
		finally{
			if(conn!=null)
				conn.close();
		}
		return jsonArray;
	}
	
	//update
	public int updateData(int id, String fullname, String gender, String state, String city, String street, int zip,
			int birthyear, String email) throws Exception {
		PreparedStatement query = null;
		Connection conn = null;
		try {
			conn = DatabaseConnect();
			query = conn.prepareStatement(
					"update system.data set fullname=?,gender=?,state=?,city=?,street=?,zip=?,birthyear=?,email=? where id=?");
			
			query.setString(1, fullname);
			query.setString(2, gender);
			query.setString(3, state);
			query.setString(4, city);
			query.setString(5, street);
			query.setInt(6, zip);
			query.setInt(7, birthyear);
			query.setString(8, email);
			query.setInt(9, id);
			query.executeQuery();
			query.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			return 500;
		} finally {
			if (conn != null)
				conn.close();
		}

		return 200;
	}

	public int deleteDetails(int id) throws Exception {
		PreparedStatement query=null;
		Connection conn=null;
		try{
			conn=DatabaseConnect();
			query=conn.prepareStatement("delete from system.data where id=?");
			query.setInt(1, id);
			query.executeUpdate();
			query.close();
		}
		catch(Exception e){
			e.printStackTrace();
			return 500;
		}
		finally{
			if(conn!=null)
				conn.close();
		}
		return 200;
	}
}
