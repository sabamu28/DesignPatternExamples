package com.designPattern.creational.abstractFactory;

public class OracleFactory extends DataSourceFactory{


	@Override
	public Connections getConnection() {
		return OracleConnection.getInstance();
	}
}
