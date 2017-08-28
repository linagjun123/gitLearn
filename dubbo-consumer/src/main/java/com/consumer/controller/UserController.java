package com.consumer.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.consumer.service.IDubboRequestService;

@Controller
public class UserController {
	
	@Resource
	private IDubboRequestService dubbo;
	
	@RequestMapping("testUser")
	@ResponseBody
	public void testUser(HttpServletRequest request) throws Exception{
		dubbo.dubboRequest("testUserService","com.api.service.IUserService", "getUsers", null, request);
	}
	
	@RequestMapping("testLogin")
	@ResponseBody
	public void testLogin(HttpServletRequest request) throws Exception{
		dubbo.dubboRequest("testLoginService","com.api.service.ILoginService", "isLogin", new Object[]{"lg_zhangsan"}, request);
	}
	
}
