package com.designpattern.creational.abstractfactory.factory;

import com.designpattern.creational.abstractfactory.datasource.DataSource;
import com.designpattern.creational.abstractfactory.datasource.DerbyDataSource;
import com.designpattern.creational.abstractfactory.datasource.MySQLDataSource;
import com.designpattern.creational.abstractfactory.datasource.OracleDataSource;
import com.designpattern.creational.abstractfactory.enums.DataSourceType;

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
