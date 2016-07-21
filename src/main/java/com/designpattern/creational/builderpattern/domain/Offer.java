package com.designpattern.creational.builderpattern.domain;

public class Offer {
	
	public Offer(String title, String description) {
		this.title = title;
		this.description = description;
	}

	private String title;
	private String description;
	
	public String getDescription() {
		return description;
	}
	public String getTitle() {
		return title;
	}
	@Override
	public String toString() {
		StringBuilder offer=new StringBuilder("Offers:");
		offer.append(title);
		offer.append("("+description+")");
		return offer.toString();
	}
	
}
