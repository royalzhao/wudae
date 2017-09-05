package com.zhongruan.bizcard.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhongruan.bizcard.dao.UserDao;
import com.zhongruan.bizcard.entity.CommodityEntity;
import com.zhongruan.bizcard.entity.CuisineEntity;
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


	public List<MerchantEntity> Commodity(String Restaurant_number) {
		// TODO Auto-generated method stub
		return userdao.Commodity(Restaurant_number);
	}

	/*
	public List<MerchantEntity> findByName(String keyword) {
		// TODO Auto-generated method stub
		return userdao.findByName(keyword);
	}
	*/
	@Override
	public List<CuisineEntity> Cuisine() {
		// TODO Auto-generated method stub
		return userdao.Cuisine();
	}
	@Override
	public Map<String, Object> Menu(String cuisine_number) {
		// TODO Auto-generated method stub
		return userdao.Menu(cuisine_number);
	}

}
