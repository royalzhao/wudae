package com.zhongruan.bizcard.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhongruan.bizcard.controller.Merchant;
import com.zhongruan.bizcard.entity.CommodityEntity;
import com.zhongruan.bizcard.service.UserService;

@Controller
public class Commodity {
	@Autowired
	UserService userservices;
	/*
	@RequestMapping(value="/")
	public String shangpinxinxi(){
		return"";
	}
	
 @PostMapping(value="")
 public String Merchant1(
		@RequestParam(value="Restaurant_number",defaultValue="")String Restaurant_number 
		,Map map ){
	 List<CommodityEntity> list = userservices.Commodity(Restaurant_number);
	map.put("list",list);
	 return "";
 }
 */
}
