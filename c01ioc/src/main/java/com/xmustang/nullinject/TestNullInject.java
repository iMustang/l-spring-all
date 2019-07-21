package com.xmustang.nullinject;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean属性注入null值
 */
public class TestNullInject {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("nullinject.xml");
        HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
        System.out.println(obj.getMessage());
    }
}
