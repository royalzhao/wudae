package com.zhongruan.bizcard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.zhongruan.bizcard.entity.ContactEntity;
import com.zhongruan.bizcard.service.ContactService;

@Controller
public class IndexContorller {

	private final Logger logger = LoggerFactory.getLogger(IndexContorller.class);
	@RequestMapping(value="/")
	public String index(){
		return "index";
	}
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}

	@RequestMapping(value="/content")
	public String content(){
		return "content";
	}


	//��ѯ
	@Autowired
	ContactService contactservice;
	@RequestMapping(value="/index")
	//@PostMapping("quancha1")
	public String select(Map m){
		List<ContactEntity> list= contactservice.findAll();
		m.put("list", list);
		return "index";
	}

	@PostMapping("/")
	@ResponseBody
	public List<ContactEntity> indexPost(
			@RequestParam(value = "keyword", defaultValue = "") String keyword) {
		logger.info("{}", keyword);
		List<ContactEntity> contacts = contactservice.findByName(keyword);
		logger.info("{}", contacts);
		return contacts;
	}


	//����
	@PostMapping("add2")
	//@GetMapping("add2")
	@ResponseBody
	public String add1(
			@RequestParam(value="sid",defaultValue="") String sid,
			@RequestParam(value="sname",defaultValue="")String sname,
			@RequestParam(value="age",defaultValue="")String age
			) {
		System.out.print("----------------"+sid+sname+age);
		contactservice.add(sid,sname,age);
		return "ok";
	}


	//ɾ��
	@GetMapping("/shan")
	public String shan(
			@RequestParam(value="sid",defaultValue="")String sid
			){
		contactservice.shan(sid);
		return "redirect:/index";
	}
	//��¼��֤
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,String> loginPost(
			@RequestParam(value="sid",defaultValue="")String sid,
			@RequestParam(value="age",defaultValue="")String age,
			HttpServletRequest request
			) {

		HttpSession session = request.getSession();
		Map<String, Object> result = contactservice.login(sid,age);
		Map<String, String> map = new HashMap();
		if (!"1".equals(result.get("counter").toString())) {
			map.put("message", "ERROR");
			return map;
		}
		session.setAttribute("result", result);
		map.put("message", "OK"); 
		// ��id�����ݱ��浽Session��Cookie�򷵻�token
		// redirect: ������ת������ҳ��
		return map;
	}


	/*
@PostMapping("/login")
public Map<String, String> login1(
		HttpServletRequest request,
		@SessionAttribute ContactEntity uesr
		) {
		HttpSession session = request.getSession();
		Map<String,Object> user = contactservice.login(user);
		session.setAttribute("user",user);
		 Map<String, String> map = new HashMap();

		    // �ж�counter�����������������һ��˵��û��������˺Ż��������쳣
		    if (!"1".equals(user.get("counter").toString())) {
		      // ���ݳ����ض��򵽵�¼��url
		      map.put("message", "ERROR");
		      return map;
		    }
		    map.put("message", "OK");
		    // ��id�����ݱ��浽Session��Cookie�򷵻�token
		    // redirect: ������ת������ҳ��
		    return map;
		  }
	 */

	@PostMapping("/check")
	@ResponseBody
	public Map<String, String> check(
			@RequestParam(value = "qqq", defaultValue = "") String qqq
			) {
		// logger.info("{}", account);
		System.out.println(qqq);
		Map<String,Object> user = contactservice.yanzheng(qqq);
		Map<String,String> map = new HashMap();
		 if (!"1".equals(user.get("counter").toString())) {
		      // ���ݳ����ض��򵽵�¼��url
		      map.put("message", "OK");
		      return map;
		    }
		  map.put("message", "ELL");
		    // ��id�����ݱ��浽Session��Cookie�򷵻�token
		    // redirect: ������ת������ҳ��
		    return map;
	}
	 

	
}



