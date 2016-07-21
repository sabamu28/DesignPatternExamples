package com.designpattern.creational.abstractfactory.main;

import com.designpattern.creational.abstractfactory.datasource.DataSource;
import com.designpattern.creational.abstractfactory.enums.DataSourceName;
import com.designpattern.creational.abstractfactory.enums.DataSourceType;
import com.designpattern.creational.abstractfactory.factory.DataSourceFactory;

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
		fileSystemDataSource.setName("/src/main/resources/com/designpattern/testfile/csv/testFile.csv");
		fileSystemDataSource.getConnections();
		System.out.println(fileSystemDataSource.getClass());
	
	}
}
