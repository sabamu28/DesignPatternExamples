package com.designpattern.creational.abstractfactory.datasource;

import com.designpattern.creational.abstractfactory.connections.Connections;
import com.designpattern.creational.abstractfactory.connections.MySQLConnection;

public class MySQLDataSource extends DataSource {

	public Connections getConnections() {
		return MySQLConnection.getInstance();
	}
	
	
}
