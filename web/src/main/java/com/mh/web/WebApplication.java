package com.mh.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude = SecurityAutoConfiguration.class) //启动类配置springsecurity不生效
@SpringBootApplication
//@ComponentScan(basePackages = {"com.mh.service","com.mh.web.controller"})
@ComponentScan(basePackages = {"com.mh"})
@MapperScan("com.mh.dao")
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
