package com.designpattern.creational.abstractfactory.factory;

import com.designpattern.creational.abstractfactory.datasource.DataSource;
import com.designpattern.creational.abstractfactory.enums.DataSourceName;
import com.designpattern.creational.abstractfactory.enums.DataSourceType;

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
