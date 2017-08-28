package com.consumer.service;

import javax.servlet.http.HttpServletRequest;

public interface IDubboRequestService {

	public Object dubboRequest(String serviceName, String dubboInterface, String dubboFuncName, Object[] args, HttpServletRequest request) throws Exception;
}
