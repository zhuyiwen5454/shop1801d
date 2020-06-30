package com.zhuyiwen.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author zhuyiwen
 *
 */

@Controller
public class MainController {
	
	@RequestMapping({"/","main","index"})
	public String main() {
		return "main";
	}
	
}
