package com.designPattern.creational.abstractFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DerbyConnection extends Connections{
	private static DerbyConnection instance=null;

	private	Connection conn=null;


	private DerbyConnection() {
		 try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//add driver for derby
	}

	public static Connections getInstance(){
		if(instance==null){
			synchronized (DerbyConnection.class) {
				if(instance==null){
					instance =new DerbyConnection();
				}
			}
		}
		return instance;
	}


	@Override
	public Connection connect() {
		if(conn==null){
			synchronized (DerbyConnection.class) {
				if(conn==null){
					try {
						conn= DriverManager.getConnection(
									"jdbc:derby:testdb;create=true"
							        );
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
					//add connection code for derby
					System.out.println("Trying to connect Derby Database");
				}
			}

		}
		
		if(conn!=null){
			System.out.println("Connected to Derby Database");
		}else{
			System.out.println("Connection to Derby Failed");

		}

		return conn;
	}
}
