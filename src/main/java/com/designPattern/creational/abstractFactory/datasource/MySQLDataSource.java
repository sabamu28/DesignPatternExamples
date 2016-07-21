package com.designPattern.creational.abstractFactory.datasource;

import com.designPattern.creational.abstractFactory.connections.Connections;
import com.designPattern.creational.abstractFactory.connections.MySQLConnection;

public class MySQLDataSource extends DataSource {

	public Connections getConnections() {
		return MySQLConnection.getInstance();
	}
	
	
}
