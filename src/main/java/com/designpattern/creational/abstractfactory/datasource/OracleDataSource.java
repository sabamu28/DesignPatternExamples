package com.designpattern.creational.abstractfactory.datasource;

import com.designpattern.creational.abstractfactory.connections.Connections;
import com.designpattern.creational.abstractfactory.connections.OracleConnection;

public class OracleDataSource extends DataSource{

	public Connections getConnections() {
		return OracleConnection.getInstance();
	}
}
