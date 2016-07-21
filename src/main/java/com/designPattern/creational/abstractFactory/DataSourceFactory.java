package com.designPattern.creational.abstractFactory;

public abstract class DataSourceFactory {

	public static DataSourceFactory getDataSource(DataSource d){
		switch(d){
		case MYSQL:
			return new MySQLFactory();
		case DERBY:
			return new DerbyFactory();
		case ORACLE:
			return new OracleFactory();
		default:
			break;
		}
		return null;
	}

	public Connections getConnection(){

		return null;
	}


}
