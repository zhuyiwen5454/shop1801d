package com.zhuyiwen.goods.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhuyiwen.goods.dao.CategoryDao;
import com.zhuyiwen.goods.pojo.Category;
import com.zhuyiwen.goods.service.CategoryService;

/**
 * 分类管理的服务
 * @author zhuyiwen
 *
 */
@Service(interfaceClass = CategoryService.class)
public class CategoryServiceImpl  implements CategoryService {

	@Autowired
	CategoryDao catDao;
	
	@Override
	public int add(Category category) {
		// TODO Auto-generated method stub
		return catDao.add(category);
	}

	@Override
	public int udpate(Category category) {
		// TODO Auto-generated method stub
		return catDao.update(category);
	}

	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return catDao.delete(id);
	}

	@Override
	public  List<Category>  list(int parentId) {
		// TODO Auto-generated method stub
		return catDao.list(parentId);
	}

}
