package com.zhuyiwen.goods.service.impl;


import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhuyiwen.goods.dao.BrandDao;
import com.zhuyiwen.goods.pojo.Brand;
import com.zhuyiwen.goods.service.BrandService;
import com.github.pagehelper.PageInfo;

@Service(interfaceClass = BrandService.class)
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	BrandDao brandDao ;

	@Override
	public int add(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Brand brand) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageInfo<Brand> list(Brand brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Brand> list() {
		// TODO Auto-generated method stub
		 return brandDao.queryAll();
	}

	@Override
	public Brand getById(int id) {
		// TODO Auto-generated method stub
		return brandDao.findById(id);
	}

}
