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

  
  public List<ContactEntity> findByName(String name) {
    return contactDao.findByName(name);
  }
  
public List<ContactEntity> findAll() {
	// TODO Auto-generated method stub
	return contactDao.findAll();
}

public void add(String sid,String sname,String age) {
	contactDao.add(sid,sname,age);
}

public void shan(String sid) {
	contactDao.shan(sid);
}

public Map<String, Object> login(String sid,String age) {
	// TODO Auto-generated method stub
	return contactDao.login(sid,age);
}

public Map<String,Object> yanzheng(String sid) {
	// TODO Auto-generated method stub
	return contactDao.yanzheng(sid);
}












}
