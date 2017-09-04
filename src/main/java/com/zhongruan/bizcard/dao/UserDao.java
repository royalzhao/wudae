package com.zhongruan.bizcard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhongruan.bizcard.entity.CommodityEntity;
import com.zhongruan.bizcard.entity.MerchantEntity;

public interface UserDao {
	
	//商品查询
	 //List<CommodityEntity> Commodity(@Param("Restaurant_number") String Restaurant_number );
	 //商家查询
	 List<MerchantEntity> Merchant();
	 //模糊查询
	// List<MerchantEntity> findByName(@Param("keyword") String keyword);
}
