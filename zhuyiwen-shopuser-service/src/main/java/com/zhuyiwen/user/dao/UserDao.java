package com.zhuyiwen.user.dao;

import com.zhuyiwen.user.pojo.User;

public interface UserDao {

	User findUserById(Integer uid);

	int add(User user);

	User findUser(User user);

	User findByName(String name);

}
