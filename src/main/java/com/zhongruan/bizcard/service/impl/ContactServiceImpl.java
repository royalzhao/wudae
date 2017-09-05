package com.zhongruan.bizcard.service.impl;

import com.zhongruan.bizcard.dao.ContactDao;
import com.zhongruan.bizcard.entity.ContactEntity;
import com.zhongruan.bizcard.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {

  @Autowired
  ContactDao contactDao;

public Map<String, Object> userlogin(String user_name, String user_password) {
	// TODO Auto-generated method stub
	return contactDao.userlogin(user_name, user_password);
}

public void add(String user_name, String user_password) {
	// TODO Auto-generated method stub
	contactDao.add(user_name, user_password);
}

public Map<String, Object> uname(String user_name) {
	// TODO Auto-generated method stub
	return contactDao.uname(user_name);
}













}
