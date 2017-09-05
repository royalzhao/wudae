package com.zhongruan.bizcard.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhongruan.bizcard.entity.ContactEntity;

public interface ContactService {

  Map<String,Object> userlogin(String user_name,String user_password);

  void add(String user_name,String user_password);

  Map<String ,Object> uname(String user_name);
}