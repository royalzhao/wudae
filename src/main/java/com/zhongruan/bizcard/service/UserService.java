package com.zhongruan.bizcard.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhongruan.bizcard.entity.CommodityEntity;
import com.zhongruan.bizcard.entity.MerchantEntity;

public interface UserService {
	//List<CommodityEntity> Commodity(String Restaurant_number);
	List<MerchantEntity> Merchant();
	//List<MerchantEntity> findByName(String keyword);
}
