package com.designPattern.creational.abstractFactory;

public class FileSystemFactory extends DataSourceFactory {

	@Override
	public DataSource getDataSource(DataSourceType dst) {
		return new FileSystemDataSource();
	}

}
