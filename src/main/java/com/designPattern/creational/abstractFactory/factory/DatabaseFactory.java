package com.designPattern.creational.abstractFactory.factory;

import com.designPattern.creational.abstractFactory.datasource.DataSource;
import com.designPattern.creational.abstractFactory.datasource.DerbyDataSource;
import com.designPattern.creational.abstractFactory.datasource.MySQLDataSource;
import com.designPattern.creational.abstractFactory.datasource.OracleDataSource;
import com.designPattern.creational.abstractFactory.enums.DataSourceType;

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
