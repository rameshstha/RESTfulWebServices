package com.rest.dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DataConnection {
	private static DataSource Con=null;
	private static Context context=null;
	
	private static DataSource DataConn() throws Exception{
		if(Con!=null){
			return Con;
		}
		try{
			if(context==null){
				context=new InitialContext();
			}
			Con=(DataSource)context.lookup("testConnOracle");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return Con;
	}
	
	protected static Connection DatabaseConnect(){
		Connection conn=null;
		try{
			conn=DataConn().getConnection();
			return conn;
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
}
