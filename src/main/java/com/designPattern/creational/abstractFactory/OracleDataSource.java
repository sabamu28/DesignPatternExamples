package com.designPattern.creational.abstractFactory;

public class OracleDataSource extends DataSource{

	public Connections getConnections() {
		return OracleConnection.getInstance();
	}
}
