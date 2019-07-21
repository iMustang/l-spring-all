package com.xmustang.beanpostprocessor;

import lombok.Getter;
import lombok.Setter;

/**
 * 测试创建bean的init、destory
 */
@Getter
@Setter
public class HelloSpring {
	private String message;
	public void init(){
		System.out.println("Bean is going through init.");
	}
	public void destroy(){
		System.out.println("Bean will destroy now.");
	}
}
