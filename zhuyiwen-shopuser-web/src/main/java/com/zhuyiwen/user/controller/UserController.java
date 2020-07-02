package com.zhuyiwen.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhuyiwen.user.pojo.User;
import com.zhuyiwen.user.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

		@Reference
		UserService userService;
	
		/**
		 * 去登陆页面
		 * @param request
		 * @return
		 */
		@GetMapping("login")
		public String toLogin(HttpServletRequest request) {
			return "user/login";
		}	
		
		@PostMapping("login")
		public String toLogin(HttpServletRequest request,User user) {
			
			User loginUser = userService.login(user);
			if(loginUser == null)
				return "user/login";
			
			//登录成功
			request.getSession().setAttribute("USERSESSION", loginUser);
			return "user/home";
		}	
		
		@RequestMapping("checkExist")
		@ResponseBody
		public boolean checkExist(String username) {
			return null==userService.getUserByName(username);	
		}
		
		/**
		 * 去登陆页面
		 * @param request
		 * @return
		 */
		@GetMapping("register")
		public String register(HttpServletRequest request) {
			return "user/register";
		}	
		//注册验证
		@PostMapping("register")
		public String register(HttpServletRequest request,User user) {
			System.out.println("注册提交的数据:"+user);
			User reguser = userService.register(user);
			if(reguser!=null)
				return "redirect:login";
			
			return "user/register";
		}	
		
		@RequestMapping("home")
		public String home() {
			return "user/home";
		}
}
