package com.designPattern.creational.abstractFactory;

public class DerbyFactory extends DataSourceFactory{

	@Override
	public Connections getConnection() {
		return DerbyConnection.getInstance();
	}
	
}
