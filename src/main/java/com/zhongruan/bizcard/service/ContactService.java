package com.zhongruan.bizcard.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhongruan.bizcard.entity.ContactEntity;

public interface ContactService {
	 void add(String sid,String sname,String age);
  List<ContactEntity> findAll();
  void shan(String sid);
  List<ContactEntity> findByName(String name);
  Map<String,Object> login(String sid,String age);
  Map<String,Object> yanzheng(String sid);
}