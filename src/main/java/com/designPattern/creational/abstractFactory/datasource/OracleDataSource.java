package com.designPattern.creational.abstractFactory.datasource;

import com.designPattern.creational.abstractFactory.connections.Connections;
import com.designPattern.creational.abstractFactory.connections.OracleConnection;

public class OracleDataSource extends DataSource{

	public Connections getConnections() {
		return OracleConnection.getInstance();
	}
}
