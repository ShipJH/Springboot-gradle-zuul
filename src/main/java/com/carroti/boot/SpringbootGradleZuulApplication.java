package com.carroti.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringbootGradleZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGradleZuulApplication.class, args);
	}

}
