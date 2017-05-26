package com.sunxy.proxy;

import com.sunxy.port.Subject;

/**
 *
 * 在这里面进行代理处理
 * Created by Administrator on 2017/5/22.
 */

public class RealSubject implements Subject
{
	@Override
	public void doSomething()
	{
		System.out.println( "call doSomething()" );
	}
}
