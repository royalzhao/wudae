package com.zhongruan.bizcard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhongruan.bizcard.dao.UserDao;
import com.zhongruan.bizcard.entity.CommodityEntity;
import com.zhongruan.bizcard.entity.MerchantEntity;
import com.zhongruan.bizcard.service.UserService;
@Service
@Transactional
public class UserServiceimpl implements UserService{
@Autowired
UserDao userdao;
	public List<MerchantEntity> Merchant() {
		// TODO Auto-generated method stub
		return userdao.Merchant();
	}
/*

	public List<CommodityEntity> Commodity(String Restaurant_number) {
		// TODO Auto-generated method stub
		return userdao.Commodity(Restaurant_number);
	}


	public List<MerchantEntity> findByName(String keyword) {
		// TODO Auto-generated method stub
		return userdao.findByName(keyword);
	}
*/
}
