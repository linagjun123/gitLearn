package com.consumer.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import com.api.service.IUserService;
import com.consumer.service.IDubboRequest;

@Component("testUserService")
public class TestUserServiceImpl implements IDubboRequest {
	
	@Resource
	private IUserService userServiceFacade; 
	
	public Object getServiece() throws Exception{
		return userServiceFacade;
	}
}




