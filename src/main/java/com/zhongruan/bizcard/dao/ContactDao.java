package com.zhongruan.bizcard.dao;

import com.zhongruan.bizcard.entity.ContactEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface ContactDao {
	
  List<ContactEntity> findAll();
 void add(@Param("sid") String sid,@Param("sname") String sname,@Param("age") String age);
 void shan(@Param("sid")String sid);
 List<ContactEntity> findByName(@Param("keyword") String keyword);
 Map<String, Object> yanzheng(@Param("sid") String sid);
 Map<String, Object> login(@Param("sid") String sid,@Param("age") String age);
}
