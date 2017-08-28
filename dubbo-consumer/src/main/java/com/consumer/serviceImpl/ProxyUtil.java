package com.consumer.serviceImpl;

public class ProxyUtil<T> extends ProxyFactory<T> {

	public ProxyUtil(T target) {
		super(target);
	}

	@Override
	public void doBefore(Object[] args) {
		//System.out.println("request before...");
	}

	@Override
	public void doAfter(Object[] args) {
		//System.out.println("request after...");
	}

}
