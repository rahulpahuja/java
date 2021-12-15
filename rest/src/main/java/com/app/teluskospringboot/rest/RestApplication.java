package com.app.teluskospringboot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RestApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();
		Alien a1 = context.getBean(Alien.class);
		a1.show();
	}

}
