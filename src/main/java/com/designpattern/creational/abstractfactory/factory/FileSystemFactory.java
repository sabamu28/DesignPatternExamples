package com.designpattern.creational.abstractfactory.factory;

import com.designpattern.creational.abstractfactory.datasource.DataSource;
import com.designpattern.creational.abstractfactory.datasource.FileSystemDataSource;
import com.designpattern.creational.abstractfactory.enums.DataSourceType;

public class FileSystemFactory extends DataSourceFactory {

	@Override
	public DataSource getDataSource(DataSourceType dst) {
		return new FileSystemDataSource();
	}

}
