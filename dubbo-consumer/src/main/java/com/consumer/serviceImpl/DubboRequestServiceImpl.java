package com.consumer.serviceImpl;

import java.lang.reflect.Method;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.alibaba.fastjson.JSON;
import com.consumer.service.IDubboRequest;
import com.consumer.service.IDubboRequestService;

public class DubboRequestServiceImpl implements IDubboRequestService {

	@Override
	public Object dubboRequest(String serviceName, String dubboInterface, String dubboFuncName, 
			Object[] args, HttpServletRequest request) throws Exception {
		Object res = null;

		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(request.getSession().getServletContext());
		Object obj = context.getBean(serviceName);

		Class<?> cls = Class.forName(dubboInterface);
		if (cls == null) {
			throw new RuntimeException("dubboInterface不存在:" + dubboInterface);
		}else{
			if (obj == null) { 
				throw new RuntimeException("serviceName不存在:" + serviceName);
			}else{
				for (Method method : cls.getMethods()) {
					if (method.getName().equals(dubboFuncName)) {
						res = method.invoke(((IDubboRequest) obj).getServiece(), args);
						break;
					}
				}
			}
		}

		//System.out.println(JSON.toJSONString(res));
		return res;
	}
}



