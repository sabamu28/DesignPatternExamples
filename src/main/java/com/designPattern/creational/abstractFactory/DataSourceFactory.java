package com.designPattern.creational.abstractFactory;

public abstract class DataSourceFactory {

	public static DataSourceFactory getDataSourceFactory(DataSourceName d){
		switch(d){
		case DATABASE:
			return new DatabaseFactory();
		case FILE:
			return new FileSystemFactory();
		default:
			break;
		}
		return null;
	}

	public abstract DataSource getDataSource(DataSourceType dst);
/*	public Connections getConnection(){

		return null;
	}*/


}
