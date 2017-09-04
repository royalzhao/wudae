package com.zhongruan.bizcard.entity;

public class MerchantEntity {
private String Restaurant_number;
private String Restaurant_name;
private String Restaurant_phone;
private String Room_serivce_range;
private String Room_money;
private String Restaurant_address;
private String Restaurant_manager;
private String Menu_number;
private String Room_service_number;
private String Administrator_number;
public String getRestaurant_number() {
	return Restaurant_number;
}
public void setRestaurant_number(String restaurant_number) {
	Restaurant_number = restaurant_number;
}
public String getRestaurant_name() {
	return Restaurant_name;
}
public void setRestaurant_name(String restaurant_name) {
	Restaurant_name = restaurant_name;
}
public String getRestaurant_phone() {
	return Restaurant_phone;
}
public void setRestaurant_phone(String restaurant_phone) {
	Restaurant_phone = restaurant_phone;
}
public String getRoom_serivce_range() {
	return Room_serivce_range;
}
public void setRoom_serivce_range(String room_serivce_range) {
	Room_serivce_range = room_serivce_range;
}
public String getRoom_money() {
	return Room_money;
}
public void setRoom_money(String room_money) {
	Room_money = room_money;
}
public String getRestaurant_address() {
	return Restaurant_address;
}
public void setRestaurant_address(String restaurant_address) {
	Restaurant_address = restaurant_address;
}
public String getRestaurant_manager() {
	return Restaurant_manager;
}
public void setRestaurant_manager(String restaurant_manager) {
	Restaurant_manager = restaurant_manager;
}
public String getMenu_number() {
	return Menu_number;
}
public void setMenu_number(String menu_number) {
	Menu_number = menu_number;
}
public String getRoom_service_number() {
	return Room_service_number;
}
public void setRoom_service_number(String room_service_number) {
	Room_service_number = room_service_number;
}
public String getAdministrator_number() {
	return Administrator_number;
}
public void setAdministrator_number(String administrator_number) {
	Administrator_number = administrator_number;
}
@Override
public String toString() {
	return "MerchantEntity [Restaurant_number=" + Restaurant_number + ", Restaurant_name=" + Restaurant_name
			+ ", Restaurant_phone=" + Restaurant_phone + ", Room_serivce_range=" + Room_serivce_range + ", Room_money="
			+ Room_money + ", Restaurant_address=" + Restaurant_address + ", Restaurant_manager=" + Restaurant_manager
			+ ", Menu_number=" + Menu_number + ", Room_service_number=" + Room_service_number
			+ ", Administrator_number=" + Administrator_number + "]";
}

}
