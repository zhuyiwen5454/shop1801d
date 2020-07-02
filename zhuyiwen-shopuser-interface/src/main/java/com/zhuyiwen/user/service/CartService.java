package com.zhuyiwen.user.service;

import java.util.List;

import com.zhuyiwen.user.pojo.Cart;

/**
 * 购物车的服务
 * @author 45466
 *
 */
public interface CartService {
	
	int add(Cart cart);
	
	int delete(int[] ids);
	/**
	 * 
	 * @param uid 用户id
	 * @return
	 */
	List<Cart> list(int uid);
	
	List<Cart> ListByIds(int[] ids);
	
	
	

}
