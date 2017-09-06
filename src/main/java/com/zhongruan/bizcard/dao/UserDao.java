package com.zhongruan.bizcard.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhongruan.bizcard.entity.CommodityEntity;
import com.zhongruan.bizcard.entity.CuisineEntity;
import com.zhongruan.bizcard.entity.MerchantEntity;

public interface UserDao {
	
	 List<MerchantEntity> Commodity(@Param("Restaurant_number") String Restaurant_number );
	 List<MerchantEntity> Merchant();
	 List<CuisineEntity> Cuisine();
	 List<MerchantEntity> Menu(@Param("cuisine_number") String cuisine_number);
	// List<MerchantEntity> findByName(@Param("keyword") String keyword);
}
