package com.designPattern.creational.abstractFactory.datasource;

import com.designPattern.creational.abstractFactory.connections.Connections;

public abstract class DataSource {
	protected String filePath;
	Connections connections;
	
	public String getName() {
		return filePath;
	}

	public void setName(String filePath) {
		this.filePath = filePath;
	}

	public Connections getConnections() {
		return null;
	}

}
