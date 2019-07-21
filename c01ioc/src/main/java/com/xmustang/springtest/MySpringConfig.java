package com.xmustang.springtest;

import com.xmustang.hellospring.HelloSpring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfig {
	@Bean
	public HelloSpring helloSpring() {
		HelloSpring helloSpring = new HelloSpring();
		helloSpring.setMessage("hello Spring");
		return helloSpring;
	}
}
