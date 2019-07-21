package com.xmustang.container;

import com.xmustang.hellospring.HelloSpring;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 在资源宝贵的移动设备或者基于 applet 的应用当中， BeanFactory 会被优先选择。否则，一般使用的是 ApplicationContext
 * <p>
 * 测试BeanFactory
 */
public class TestBeanFactory {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("hellospring.xml"));
        HelloSpring obj = (HelloSpring) factory.getBean("helloSpring");
        System.out.println(obj.getMessage());
    }
}
