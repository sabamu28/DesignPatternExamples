package com.designpattern.creational.builderpattern.builder;

import com.designpattern.creational.builderpattern.domain.Event;
import com.designpattern.creational.builderpattern.domain.Offer;

public class TodaysSpecial {

	private FoodSpecial foodSpecial;
	private Event event;
	private Offer offer;

	
	public static class SpecialsBuilder{
		private FoodSpecial foodSpecial;
		private Event event;
		private Offer offer;
		
		public TodaysSpecial build(){
			return new TodaysSpecial(this);
		}
		
		public SpecialsBuilder foodSpecial(FoodSpecial foodSpecial){
			this.foodSpecial=foodSpecial;
			return this;
		}
		
		public SpecialsBuilder event(Event event){
			this.event=event;
			return this;
		}
		
		public SpecialsBuilder offer(Offer offer){
			this.offer=offer;
			return this;
		}
		
	}
	
	public TodaysSpecial(SpecialsBuilder specialsBuilder) {
		this.foodSpecial=specialsBuilder.foodSpecial;
		this.event=specialsBuilder.event;
		this.offer=specialsBuilder.offer;
	}
	public FoodSpecial getFoodSpecial() {
		return foodSpecial;
	}
	public Event getEvent() {
		return event;
	}
	public Offer getOffer() {
		return offer;
	}
	
	
	
	
	
	
}
