package com.zhongruan.bizcard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhongruan.bizcard.entity.CommodityEntity;
import com.zhongruan.bizcard.entity.MerchantEntity;

public interface UserDao {
	
	//��Ʒ��ѯ
	 //List<CommodityEntity> Commodity(@Param("Restaurant_number") String Restaurant_number );
	 //�̼Ҳ�ѯ
	 List<MerchantEntity> Merchant();
	 //ģ����ѯ
	// List<MerchantEntity> findByName(@Param("keyword") String keyword);
}
