package com.designPattern.creational.abstractFactory.factory;

import com.designPattern.creational.abstractFactory.datasource.DataSource;
import com.designPattern.creational.abstractFactory.datasource.FileSystemDataSource;
import com.designPattern.creational.abstractFactory.enums.DataSourceType;

public class FileSystemFactory extends DataSourceFactory {

	@Override
	public DataSource getDataSource(DataSourceType dst) {
		return new FileSystemDataSource();
	}

}
