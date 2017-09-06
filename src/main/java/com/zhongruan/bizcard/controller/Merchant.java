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
	@RequestMapping(value="/index3")
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
	
	@RequestMapping(value="/index2")
	public String caixi(
		@RequestParam(value="sid",defaultValue="")String cuisine_number	
			,Map m){
		System.out.println("--------"+cuisine_number);
		List<MerchantEntity> list = userserivce.Menu(cuisine_number);
		m.put("list",list);
		List<CuisineEntity> list1 = userserivce.Cuisine();
		m.put("list1", list1);
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
