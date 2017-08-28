package com.consumer.serviceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public abstract class ProxyFactory<T> implements InvocationHandler{

	private T target;
	
	public ProxyFactory(T target) {
		super();
		this.target = target;
	}

	@SuppressWarnings("unchecked")
	public T getObject() throws Exception{
		Class<T> cls = (Class<T>) target.getClass();
		if (cls.getInterfaces() != null) {
			return (T) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
		}else{
			throw new RuntimeException(cls + " 未实现任何接口");
		}
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
		doBefore(args);
		Object obj = method.invoke(target, args);
		doAfter(args);
		return obj;
	}
	
	public abstract void doBefore(Object[] args);
	
	public abstract void doAfter(Object[] args);

}


