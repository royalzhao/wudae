package com.zhongruan.bizcard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import com.zhongruan.bizcard.service.ContactService;

@Controller
public class IndexContorller {

	private final Logger logger = LoggerFactory.getLogger(IndexContorller.class);
	@Autowired
	ContactService service;
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	@PostMapping(value="Login")
	@ResponseBody
	public Map<String, String> Login(
			@RequestParam(value="account",defaultValue="") String user_name,
			@RequestParam(value="password",defaultValue="") String user_password,
			HttpServletRequest request
			) {
		HttpSession session= request.getSession();
		Map<String, Object> result=service.userlogin(user_name, user_password);
		Map<String, String> map  = new HashMap();
		
		if(!"1".equals(result.get("counter").toString())) {
			map.put("message","error");
			return map;
		}
		session.setAttribute("result", result);
		map.put("message", "ok");
		return map;
	}
	
	@PostMapping(value="uname")
	@ResponseBody
	public Map<String, String> uname(@RequestParam(value="account",defaultValue="") String user_name,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Map<String,Object> result = service.uname(user_name);
		Map<String,String> map = new HashMap();
		if(!"1".equals(result.get("counter").toString())) {
			map.put("messages", "error");
			System.out.println("qqq"+map);
			return map;
		}
		session.setAttribute("result", result);
		map.put("messages", "ok");
		System.out.println("ssss"+map);
		return map;
	}
	
	@PostMapping(value="add")
	@ResponseBody
	public String add(@RequestParam(value="account",defaultValue="") String user_name,
			@RequestParam(value="password",defaultValue="") String user_password) {
		System.out.println("-------"+user_name);
		service.add(user_name,user_password);
		return "index";
	}

	
}



