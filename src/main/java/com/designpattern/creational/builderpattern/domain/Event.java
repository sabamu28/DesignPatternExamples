package com.designpattern.creational.builderpattern.domain;

public class Event {

	private String name;
	private String description;
	
	public Event(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder event=new StringBuilder("Events:");
		event.append(name);
		event.append("("+description+")");
		return event.toString();
	}
	
	
}
