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
	//商家信息遍历
	@GetMapping("/index")
	public String Merchant1(Map map){
		List<MerchantEntity> list = userserivce.Merchant();
		map.put("list", list);
		return "index";
	}
	/*
	//模糊查询遍历
	@PostMapping("/")
	@ResponseBody
	public List<MerchantEntity> indexPost(
			@RequestParam(value = "keyword", defaultValue = "") String keyword) {
			List<MerchantEntity> contacts = userserivce.findByName(keyword);
			return contacts;
	}
	*/
}
