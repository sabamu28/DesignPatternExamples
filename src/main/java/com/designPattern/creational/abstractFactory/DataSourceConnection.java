package com.designPattern.creational.abstractFactory;

import java.sql.Connection;

public class DataSourceConnection {
	public static void main(String[] args){
		DataSourceFactory database=DataSourceFactory.getDataSourceFactory(DataSourceName.DATABASE);
		DataSource mySQLDataSource=database.getDataSource(DataSourceType.MYSQL);
		mySQLDataSource.getConnections().connect();
				
		DataSource derbyDataSource=database.getDataSource(DataSourceType.DERBY);
		derbyDataSource.getConnections().connect();
//				
//		DataSource oracleDataSource=database.getDataSource(DataSourceType.ORACLE);
//		oracleDataSource.getConnections().connect();
				
		DataSourceFactory fileSystem=DataSourceFactory.getDataSourceFactory(DataSourceName.FILE);
		DataSource fileSystemDataSource=fileSystem.getDataSource(DataSourceType.FILE);
		System.out.println(fileSystemDataSource.getClass());
	
	}
}
