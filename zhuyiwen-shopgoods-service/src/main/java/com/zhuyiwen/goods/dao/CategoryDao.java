package com.zhuyiwen.goods.dao;

import java.util.List;

import com.zhuyiwen.goods.pojo.Category;

public interface CategoryDao {

	int add(Category category);

	int update(Category category);

	int delete(int id);

	 List<Category>  list(int parentId);

}
