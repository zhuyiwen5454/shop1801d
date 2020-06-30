package com.zhuyiwen.goods.dao;

import java.util.List;

import com.zhuyiwen.goods.pojo.Brand;

public interface BrandDao {

	List<Brand> queryAll();

	Brand findById(int id);

}
