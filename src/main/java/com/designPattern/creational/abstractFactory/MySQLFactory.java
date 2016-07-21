package com.designPattern.creational.abstractFactory;

public class MySQLFactory extends DataSourceFactory{


	@Override
	public Connections getConnection() {
		return MySQLConnection.getInstance();
	}
}
