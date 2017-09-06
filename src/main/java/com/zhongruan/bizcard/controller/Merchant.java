package com.zhongruan.bizcard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
	public String Merchant1(Map map,Map m,HttpServletRequest request){
		HttpSession session = request.getSession();
		List<CuisineEntity> list1 = userserivce.Cuisine();
		m.put("list1", list1);
		
			List<MerchantEntity> list = userserivce.Merchant();
			map.put("list", list);
			return "index"; 
	
	}
	
	@RequestMapping(value="/index2")
	public String caixi(
		@RequestParam(value="sid",defaultValue="")String cuisine_number	
			,Map m,HttpServletRequest request){
		HttpSession session = request.getSession();
		System.out.println("--------"+cuisine_number);
		List<CuisineEntity> list1 = userserivce.Cuisine();
		m.put("list1", list1);
		
		if(session.getAttribute("contacts")==null){
			List<MerchantEntity> list = userserivce.Menu(cuisine_number);
			m.put("list",list);
			return "index2";
		}
		else {
		List<MerchantEntity> list =  (List<MerchantEntity>) session.getAttribute("contacts");
		m.put("list", list);
		session.removeAttribute("contacts");
		return "index";
		}	
	}
	
	@PostMapping("/mohu")
	@ResponseBody
	public Map<String, String> indexPost(
			@RequestParam(value = "keyword", defaultValue = "") String keyword,HttpServletRequest request) {
		HttpSession session = request.getSession();
		List<MerchantEntity> contacts = userserivce.findByName(keyword);
		Map<String, String> map  = new HashMap();
		System.out.println("test"+session.getAttribute("contacts"));
		if(contacts.equals("0")){
			map.put("message","error");
			return map;	
		}
		else {
		session.setAttribute("contacts", contacts);
		map.put("message","ok");
		return map;
		}
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
