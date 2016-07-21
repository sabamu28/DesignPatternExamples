package com.designpattern.creational.abstractfactory.datasource;

import com.designpattern.creational.abstractfactory.connections.Connections;
import com.designpattern.creational.abstractfactory.connections.DerbyConnection;

public class DerbyDataSource extends DataSource{

	public Connections getConnections() {
		return DerbyConnection.getInstance();
	}
	
}
