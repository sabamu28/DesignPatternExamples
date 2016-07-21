package com.designPattern.creational.abstractFactory;

public class DerbyDataSource extends DataSource{

	public Connections getConnections() {
		return DerbyConnection.getInstance();
	}
	
}
