package com.designpattern.creational.abstractfactory.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection implements Connections {
	private static MySQLConnection instance=null;

	private	Connection conn=null;


	private MySQLConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connections getInstance(){
		if(instance==null){
			synchronized (MySQLConnection.class) {
				if(instance==null){
					instance =new MySQLConnection();
				}
			}
		}
		return instance;
	}


	@Override
	public Connection connect() {
		if(conn==null){
			synchronized (MySQLConnection.class) {
				if(conn==null){
					try {
						conn= DriverManager.getConnection(
								"jdbc:mysql://localhost:3306/"
								);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
					//add connection code
					System.out.println("Trying to connect to MySQL Database");
				}
			}

		}

		if(conn!=null){
			System.out.println("Connected to MySQL Database");
		}else{
			System.out.println("Connection to MySQL failed");

		}
		return conn;
	}


}
