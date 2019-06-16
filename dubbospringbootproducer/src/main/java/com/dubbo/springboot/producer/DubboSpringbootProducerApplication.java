package com.dubbo.springboot.producer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableDubbo
@SpringBootApplication
public class DubboSpringbootProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboSpringbootProducerApplication.class, args);
	}

}
