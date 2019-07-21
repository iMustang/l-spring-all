package com.xmustang.collectioninject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Bean属性注入集合
 */
public class TestCollectionInject {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("collectioninject.xml");
        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

        System.out.println(jc.getAddressList());
        System.out.println(jc.getAddressSet());
        System.out.println(jc.getAddressMap());
        System.out.println(jc.getAddressProp());
    }
}
