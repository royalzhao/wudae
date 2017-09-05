package com.zhongruan.bizcard.entity;

public class MerchantEntity {
private String restaurant_number;
private String restaurant_name;
private String restaurant_phone;
private String restaurant_name1;
private String restaurant_money;
private String restaurant_address;
private String restaurant_manager;
private String restaurant_description;
private String menu_number;
private String room_service_number;
private String administrator_number;
private String Cuisine_number;
public String getCuisine_number() {
	return Cuisine_number;
}
public void setCuisine_number(String cuisine_number) {
	Cuisine_number = cuisine_number;
}
public String getRestaurant_number() {
	return restaurant_number;
}
public void setRestaurant_number(String restaurant_number) {
	this.restaurant_number = restaurant_number;
}
public String getRestaurant_name() {
	return restaurant_name;
}
public void setRestaurant_name(String restaurant_name) {
	this.restaurant_name = restaurant_name;
}
public String getRestaurant_phone() {
	return restaurant_phone;
}
public void setRestaurant_phone(String restaurant_phone) {
	this.restaurant_phone = restaurant_phone;
}
public String getRestaurant_name1() {
	return restaurant_name1;
}
public void setRestaurant_name1(String restaurant_name1) {
	this.restaurant_name1 = restaurant_name1;
}
public String getRestaurant_money() {
	return restaurant_money;
}
public void setRestaurant_money(String restaurant_money) {
	this.restaurant_money = restaurant_money;
}
public String getRestaurant_address() {
	return restaurant_address;
}
public void setRestaurant_address(String restaurant_address) {
	this.restaurant_address = restaurant_address;
}
public String getRestaurant_manager() {
	return restaurant_manager;
}
public void setRestaurant_manager(String restaurant_manager) {
	this.restaurant_manager = restaurant_manager;
}
public String getRestaurant_description() {
	return restaurant_description;
}
public void setRestaurant_description(String restaurant_description) {
	this.restaurant_description = restaurant_description;
}
public String getMenu_number() {
	return menu_number;
}
public void setMenu_number(String menu_number) {
	this.menu_number = menu_number;
}
public String getRoom_service_number() {
	return room_service_number;
}
public void setRoom_service_number(String room_service_number) {
	this.room_service_number = room_service_number;
}
public String getAdministrator_number() {
	return administrator_number;
}
public void setAdministrator_number(String administrator_number) {
	this.administrator_number = administrator_number;
}
@Override
public String toString() {
	return "MerchantEntity [restaurant_number=" + restaurant_number + ", restaurant_name=" + restaurant_name
			+ ", restaurant_phone=" + restaurant_phone + ", restaurant_name1=" + restaurant_name1
			+ ", restaurant_money=" + restaurant_money + ", restaurant_address=" + restaurant_address
			+ ", restaurant_manager=" + restaurant_manager + ", restaurant_description=" + restaurant_description
			+ ", menu_number=" + menu_number + ", room_service_number=" + room_service_number
			+ ", administrator_number=" + administrator_number + ", Cuisine_number=" + Cuisine_number + "]";
}



}
