package com.designpattern.creational.builderpattern.builder;

public class FoodSpecial {
	private String breakfast;
	private String lunch;
	private String dinner;
	private String drinks;
	private String dessert;
	
	public static class FoodBuilder{
		private String breakfast;
		private String lunch;
		private String dinner;
		private String drinks;
		private String dessert;
		
		public FoodBuilder(){
			
		}
		
		public FoodSpecial build(){
			return new FoodSpecial(this);
		}
		
		public FoodBuilder breakfast(String breakfast){
			this.breakfast=breakfast;
			return this;
			
		}
		
		public FoodBuilder lunch(String lunch){
			this.lunch=lunch;
			return this;
			
		}
		
		public FoodBuilder dinner(String dinner){
			this.dinner=dinner;
			return this;
			
		}
		
		public FoodBuilder drinks(String drinks){
			this.drinks=drinks;
			return this;
			
		}
		
		public FoodBuilder dessert(String dessert){
			this.dessert=dessert;
			return this;
			
		}
	}
	
	public FoodSpecial(FoodBuilder builder) {
		this.breakfast=builder.breakfast;
		this.lunch=builder.lunch;
		this.dinner=builder.dinner;
		this.drinks=builder.drinks;
		this.dessert=builder.dessert;
		
	}
	public String getBreakfast() {
		return breakfast;
	}
	public String getLunch() {
		return lunch;
	}
	public String getDinner() {
		return dinner;
	}
	public String getDrinks() {
		return drinks;
	}
	public String getDesert() {
		return dessert;
	}
	@Override
	public String toString() {
		StringBuilder food=new StringBuilder("Food Specials"+"\n");
		if(breakfast!=null){
			food.append("Breakfast:" + breakfast+"\n");
		}
		if(lunch!=null){
			food.append("Lunch:" + lunch+"\n");
		}
		if(dinner!=null){
			food.append("Dinner:" + dinner+"\n");
		}
		if(drinks!=null){
			food.append("Drinks:" + drinks+"\n");
		}
		if(dessert!=null){
			food.append("Dessert:" + dessert+"\n");
		}
		return food.toString();
	}
	
}
