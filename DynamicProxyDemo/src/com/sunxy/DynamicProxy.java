package com.sunxy;


import java.lang.reflect.Proxy;

import com.sunxy.port.Subject;
import com.sunxy.proxy.ProxyHandler;
import com.sunxy.proxy.RealSubject;

/**
 * 动态代理测试
 * Created by Administrator on 2017/5/22.
 */

public class DynamicProxy
{
	public static void main( String args[] )
	{
		dynamicProxyTest();
	}

	public static void dynamicProxyTest()
	{
		RealSubject real = new RealSubject();
		Subject proxySubject = (Subject)
				Proxy.newProxyInstance(Subject.class.getClassLoader(),
						new Class[]{Subject.class},
						new ProxyHandler(real));

		proxySubject.doSomething();
	}

}
