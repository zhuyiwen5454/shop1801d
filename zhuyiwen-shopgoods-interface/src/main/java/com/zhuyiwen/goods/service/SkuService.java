package com.zhuyiwen.goods.service;

import com.zhuyiwen.goods.pojo.Sku;
import com.zhuyiwen.goods.pojo.SkuVo;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * sku的管理
 * @author zhuyiwen
 *
 */
public interface SkuService {
	
	int add(Sku sku);
	int update(Sku sku);
	int delete(int[] ids);
	
	PageInfo<Sku> list(SkuVo skuvo);
	
	Sku getById(int id);
	List<Sku> listDetailBySpu(int spuId);
	

}
