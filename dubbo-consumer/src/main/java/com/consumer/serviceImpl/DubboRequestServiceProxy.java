package com.consumer.serviceImpl;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

import com.consumer.service.IDubboRequestService;

@Service("dubboService")
public class DubboRequestServiceProxy implements IDubboRequestService {

	@Override
	public Object dubboRequest(String serviceName, String dubboInterface, String dubboFuncName, 
			Object[] args, HttpServletRequest request) throws Exception {
		
		DubboRequestServiceImpl rs = new DubboRequestServiceImpl();
		IDubboRequestService proxy = new ProxyUtil<DubboRequestServiceImpl>(rs).getObject();
		Object obj = proxy.dubboRequest(serviceName, dubboInterface, dubboFuncName, args, request);

		return obj;
	}
}

