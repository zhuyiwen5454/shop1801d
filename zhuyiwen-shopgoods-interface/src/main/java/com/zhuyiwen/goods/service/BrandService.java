package com.zhuyiwen.goods.service;

import java.util.List;

import com.zhuyiwen.goods.pojo.Brand;
import com.github.pagehelper.PageInfo;

/**
 * 品牌的管理
 * @author zhuyiwen
 * 
 */
public interface BrandService {
	
	int add(Brand brand);
	int update(Brand brand);
	int delete(int[] ids);
	PageInfo<Brand> list(Brand brand);
	List<Brand> list();
	Brand getById(int id);
	
	

}
