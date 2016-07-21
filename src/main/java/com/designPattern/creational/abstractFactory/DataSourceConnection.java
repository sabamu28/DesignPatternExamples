package com.designPattern.creational.abstractFactory;

import java.sql.Connection;

public class DataSourceConnection {
	public static void main(String[] args){
		DataSourceFactory dbFactoryMySql1=DataSourceFactory.getDataSource(DataSource.MYSQL);
		Connections dbConnnectionMySql1=dbFactoryMySql1.getConnection();
		System.out.println(dbConnnectionMySql1);
		Connection connMySql1=dbConnnectionMySql1.connect();
		
		DataSourceFactory dbFactoryMySql2=DataSourceFactory.getDataSource(DataSource.MYSQL);
		Connections dbConnnectionMySql2=dbFactoryMySql2.getConnection();
		System.out.println(dbConnnectionMySql2);
		Connection connMySql2=dbConnnectionMySql2.connect();
		
		
		DataSourceFactory dbFactoryDerby=DataSourceFactory.getDataSource(DataSource.DERBY);
		Connections dbConnnectionDerby=dbFactoryDerby.getConnection();
		Connection connDerby=dbConnnectionDerby.connect();
		
		DataSourceFactory dbFactoryOracle=DataSourceFactory.getDataSource(DataSource.ORACLE);
		Connections dbConnnectionOracle=dbFactoryOracle.getConnection();
		Connection connOracle=dbConnnectionOracle.connect();
		
	}
}
