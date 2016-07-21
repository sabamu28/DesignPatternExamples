package com.designPattern.creational.abstractFactory;

public abstract class DataSource {
	protected String name;
	Connections connections;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Connections getConnections() {
		return null;
	}

}
