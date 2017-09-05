package com.zhongruan.bizcard.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhongruan.bizcard.entity.CuisineEntity;
import com.zhongruan.bizcard.entity.MerchantEntity;
import com.zhongruan.bizcard.service.UserService;

@Controller
public class Merchant {
	@Autowired
	UserService userserivce; 
	@RequestMapping(value="/")
	public String shangjiaxinxi(){
		return "index";
	}
	@RequestMapping(value="/index2")
	public String shangjiaxinxi6(){
		return "index2";
	}
	@GetMapping("/index")
	public String Merchant1(Map map,Map m){
		List<MerchantEntity> list = userserivce.Merchant();
		map.put("list", list);
		List<CuisineEntity> list1 = userserivce.Cuisine();
		m.put("list1", list1);
		return "index";
	}
	
	@GetMapping("/caixi")
	public String caixi(
		@RequestParam(value="cuisine_number",defaultValue="")String cuisine_number	
			,Map m){
		Map<String,Object> map = userserivce.Menu(cuisine_number);
		m.put("map",map);
		return "index2";
	}
	/*
	@PostMapping("/")
	@ResponseBody
	public List<MerchantEntity> indexPost(
			@RequestParam(value = "keyword", defaultValue = "") String keyword) {
			List<MerchantEntity> contacts = userserivce.findByName(keyword);
			return contacts;
	}
	*/
}
