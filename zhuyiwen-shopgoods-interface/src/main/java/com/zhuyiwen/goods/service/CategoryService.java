package com.zhuyiwen.goods.service;

import java.util.List;

import com.zhuyiwen.goods.pojo.Category;

/**
 * 分类的管理
 * @author zhuyiwen
 *
 */
public interface CategoryService {
	
	public int add(Category category);
	
	public int udpate(Category category);
	
	public int del(int id);
	
	public List<Category> list(int parentId);
	
	

}
