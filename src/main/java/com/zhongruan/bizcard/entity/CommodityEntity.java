package com.zhongruan.bizcard.entity;

public class CommodityEntity {
	private String Dish_number;
	private String Dish_name;
	private String Dish_price;
	private String Dish_introdiction;
	private String Dish_Classification;
	private String Restaurant_number;
	public String getRestaurant_number() {
		return Restaurant_number;
	}
	public void setRestaurant_number(String restaurant_number) {
		Restaurant_number = restaurant_number;
	}
	public String getDish_name() {
		return Dish_name;
	}
	public void setDish_name(String dish_name) {
		Dish_name = dish_name;
	}
	public String getDish_price() {
		return Dish_price;
	}
	public void setDish_price(String dish_price) {
		Dish_price = dish_price;
	}
	public String getDish_introdiction() {
		return Dish_introdiction;
	}
	public void setDish_introdiction(String dish_introdiction) {
		Dish_introdiction = dish_introdiction;
	}
	public String getDish_Classification() {
		return Dish_Classification;
	}
	public void setDish_Classification(String dish_Classification) {
		Dish_Classification = dish_Classification;
	}
	public String getDish_number() {
		return Dish_number;
	}
	public void setDish_number(String dish_number) {
		Dish_number = dish_number;
	}
	@Override
	public String toString() {
		return "CommodityEntity [Dish_number=" + Dish_number + ", Dish_name=" + Dish_name + ", Dish_price=" + Dish_price
				+ ", Dish_introdiction=" + Dish_introdiction + ", Dish_Classification=" + Dish_Classification
				+ ", Restaurant_number=" + Restaurant_number + "]";
	}
	
	
}
