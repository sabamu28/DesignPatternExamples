package com.designPattern.creational.abstractFactory.main;

import com.designPattern.creational.abstractFactory.datasource.DataSource;
import com.designPattern.creational.abstractFactory.enums.DataSourceName;
import com.designPattern.creational.abstractFactory.enums.DataSourceType;
import com.designPattern.creational.abstractFactory.factory.DataSourceFactory;

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
		fileSystemDataSource.setName("/src/main/resources/com/designPattern/testFile/csv/testFile.csv");
		fileSystemDataSource.getConnections();
		System.out.println(fileSystemDataSource.getClass());
	
	}
}
