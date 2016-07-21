package com.designPattern.creational.abstractFactory.factory;

import com.designPattern.creational.abstractFactory.datasource.DataSource;
import com.designPattern.creational.abstractFactory.enums.DataSourceName;
import com.designPattern.creational.abstractFactory.enums.DataSourceType;

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
