package com.designpattern.creational.abstractfactory.datasource;

import com.designpattern.creational.abstractfactory.connections.Connections;

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
