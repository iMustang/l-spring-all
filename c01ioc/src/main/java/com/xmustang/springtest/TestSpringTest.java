package com.xmustang.springtest;

import com.xmustang.hellospring.HelloSpring;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 使用Spring提供的测试框架
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:hellospring.xml"})
public class TestSpringTest {
    @Autowired
    private HelloSpring helloSpring;

    @Test
    public void testSpringJavaConfig() {
        System.out.println(helloSpring.getMessage());
    }
}
