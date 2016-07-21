package com.designPattern.creational.abstractFactory.datasource;

import com.designPattern.creational.abstractFactory.connections.Connections;
import com.designPattern.creational.abstractFactory.connections.DerbyConnection;

public class DerbyDataSource extends DataSource{

	public Connections getConnections() {
		return DerbyConnection.getInstance();
	}
	
}
