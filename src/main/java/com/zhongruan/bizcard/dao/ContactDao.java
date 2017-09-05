package com.zhongruan.bizcard.dao;

import com.zhongruan.bizcard.entity.ContactEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface ContactDao {
 //
 Map<String,Object> userlogin(@Param("user_name") String user_name,@Param("user_password") String user_password);

 void add (@Param("user_name") String user_name,@Param("user_password") String user_password);

 Map<String,Object> uname(@Param("user_name") String user_name);
}
