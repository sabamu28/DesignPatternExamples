package com.designpattern.creational.builderpattern.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.designpattern.creational.builderpattern.builder.FoodSpecial;
import com.designpattern.creational.builderpattern.builder.FoodSpecial.FoodBuilder;
import com.designpattern.creational.builderpattern.builder.TodaysSpecial;
import com.designpattern.creational.builderpattern.builder.TodaysSpecial.SpecialsBuilder;
import com.designpattern.creational.builderpattern.domain.Event;
import com.designpattern.creational.builderpattern.domain.Offer;

public class TodaysSpecialMain {

	public static void main(String[] args){
		
		FoodBuilder foodSpecialBuilder=new FoodSpecial.FoodBuilder();
		foodSpecialBuilder.dinner("Pork Chops with mashed potatoes");
		foodSpecialBuilder.drinks("Cocktail");
		foodSpecialBuilder.dessert("WhiteForestWithRaspberries");
		FoodSpecial foodSpecial=foodSpecialBuilder.build();
		
		
		Event concert=new Event("Bipul Chetrri Concert","Bipul Chetrri Concert, Nepali Songs");
		Offer elderlyDiscount=new Offer("Elderly Discount","15% discount for senior citizens");
		
		
		SpecialsBuilder todaySpecialBuilder=new TodaysSpecial.SpecialsBuilder();
		todaySpecialBuilder.foodSpecial(foodSpecial);
		todaySpecialBuilder.event(concert);
		todaySpecialBuilder.offer(elderlyDiscount);
		
		TodaysSpecial todaysSpecial=todaySpecialBuilder.build();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println("Amu Resturant Today's Speciality :"+ dateFormat.format(date));
		System.out.println(todaysSpecial.getFoodSpecial().toString());
		System.out.println(todaysSpecial.getEvent().toString());
		System.out.println(todaysSpecial.getOffer().toString());
		
	}
}
