package com.consumer.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.api.service.ILoginService;
import com.consumer.service.IDubboRequest;


@Component("testLoginService")
public class TestLoginServiceImpl implements IDubboRequest {

	@Resource
	private ILoginService loginService;
	
	public Object getServiece() throws Exception {
		return loginService;
	}

}
