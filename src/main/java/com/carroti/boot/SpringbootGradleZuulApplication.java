package com.carroti.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy // zuul 프록시로 작동합니다. 
@EnableEurekaServer //이 응용 프로그램을 유레카 서버로 만들기위한 것입니다.
@SpringBootApplication
public class SpringbootGradleZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGradleZuulApplication.class, args);
	}

}
