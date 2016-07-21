package com.designPattern.creational.abstractFactory;

public class MySQLDataSource extends DataSource {

	public Connections getConnections() {
		return MySQLConnection.getInstance();
	}
	
	
}
