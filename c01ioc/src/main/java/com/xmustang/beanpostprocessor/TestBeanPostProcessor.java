package com.xmustang.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanPostProcessor {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanpostprocessor.xml");
        HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
        System.out.println(obj.getMessage());
        context.registerShutdownHook();
    }
}
