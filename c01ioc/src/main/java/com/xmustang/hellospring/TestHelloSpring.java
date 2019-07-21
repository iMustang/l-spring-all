package com.xmustang.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Context获取bean
 */
public class TestHelloSpring {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("hellospring.xml");
        HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
        System.out.println(obj.getMessage());
    }
}
