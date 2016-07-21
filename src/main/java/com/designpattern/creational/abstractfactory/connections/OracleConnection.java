package com.designpattern.creational.abstractfactory.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection implements Connections {
	private static OracleConnection instance=null;

	private	Connection conn=null;


	private OracleConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	public static Connections getInstance(){
		if(instance==null){
			synchronized (OracleConnection.class) {
				if(instance==null){
					instance =new OracleConnection();
				}
			}
		}
		return instance;
	}


	@Override
	public Connection connect() {
		if(conn==null){
			synchronized (OracleConnection.class) {
				if(conn==null){
					try {
						conn= DriverManager.getConnection(
									"jdbc:oracle:thin:@localhost:1521:xe"
							        );
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	

					//add connection code for oracle
					System.out.println("Trying to connect to Oracle Database");
				}
			}

		}
		if(conn!=null){
			System.out.println("Connected to Oracle Database");
		}else{
			System.out.println("Connection to Oracle Database Failed");
		}
		return conn;
	}
}
