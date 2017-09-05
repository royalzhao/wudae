package com.zhongruan.bizcard.entity;

public class CuisineEntity {
	private String Cuisine_number;
	private String Cuisine_name;
	private String restaurant_number;
	public String getCuisine_number() {
		return Cuisine_number;
	}
	public void setCuisine_number(String cuisine_number) {
		Cuisine_number = cuisine_number;
	}
	public String getCuisine_name() {
		return Cuisine_name;
	}
	public void setCuisine_name(String cuisine_name) {
		Cuisine_name = cuisine_name;
	}
	public String getRestaurant_number() {
		return restaurant_number;
	}
	public void setRestaurant_number(String restaurant_number) {
		this.restaurant_number = restaurant_number;
	}
	@Override
	public String toString() {
		return "CuisineEntity [Cuisine_number=" + Cuisine_number + ", Cuisine_name=" + Cuisine_name
				+ ", restaurant_number=" + restaurant_number + "]";
	}
	
}
