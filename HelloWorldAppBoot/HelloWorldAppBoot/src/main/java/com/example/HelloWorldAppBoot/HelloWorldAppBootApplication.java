package com.example.HelloWorldAppBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldAppBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HelloWorldAppBootApplication.class, args);
		Customer c=context.getBean(Customer.class);
		c.display();
	}

}
