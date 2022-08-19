package com.mh.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
////@ComponentScan({"com.mh.service","com.mh.web"})
//@ComponentScan("com.mh.service")
@ComponentScan(basePackages = {"com.mh.service","com.mh.web.controller"})
@MapperScan("com.mh.dao")
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
