package com.xmustang.container;

import com.xmustang.hellospring.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Context 是 BeanFactory 的子接口，也被成为 Spring 上下文。
 * Application Context 是 spring 中较高级的容器。
 */
public class TestApplicationContext {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("hellospring.xml");
		HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
		System.out.println(obj.getMessage());
	}
}
