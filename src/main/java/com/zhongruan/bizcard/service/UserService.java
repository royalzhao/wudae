package com.zhongruan.bizcard.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhongruan.bizcard.entity.CommodityEntity;
import com.zhongruan.bizcard.entity.CuisineEntity;
import com.zhongruan.bizcard.entity.MerchantEntity;

public interface UserService {
	List<MerchantEntity> Commodity(String Restaurant_number);
	List<MerchantEntity> Merchant();
	//List<MerchantEntity> findByName(String keyword);
	List<CuisineEntity> Cuisine();
	Map<String,Object> Menu(String cuisine_number);
}
