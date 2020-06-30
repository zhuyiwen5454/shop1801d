package com.zhuyiwen.goods;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动类
 * @author zhuyiwen
 *
 */
public class GoodsStarter { 
	
	public static void main(String[] args) throws IOException {
		System.out.println("商品服务启动开始。。。");
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("classpath:applicationContext-dubbo-provider.xml",
				"classpath:applicationContext-dao.xml");
		context.start();
		
		System.out.println("商品服务启动成功，可以正常使用");
		System.in.read();
	}

}
