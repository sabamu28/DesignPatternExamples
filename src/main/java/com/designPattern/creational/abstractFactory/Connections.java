package com.designPattern.creational.abstractFactory;

import java.sql.Connection;

public abstract class Connections {
/*	private static Connection instance=new Connection();
	
	private Connection(){
		try {
			DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/"
			        );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
	public Connection connect(){
		return null;
	}
	
}
