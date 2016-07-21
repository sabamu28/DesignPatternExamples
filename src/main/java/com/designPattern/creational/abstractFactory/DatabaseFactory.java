package com.designPattern.creational.abstractFactory;

public class DatabaseFactory extends DataSourceFactory {

	@Override
	public DataSource getDataSource(DataSourceType dst) {
		switch(dst){
		case MYSQL:
			return new MySQLDataSource();
		case DERBY:
			return new DerbyDataSource();
		case ORACLE:
			return new OracleDataSource();
		default:
			break;
		}
		return null;
	}

}
