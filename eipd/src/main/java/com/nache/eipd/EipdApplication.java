package com.nache.eipd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class EipdApplication {

	public static void main(String[] args) {
		SpringApplication.run(EipdApplication.class, args);
	}

}
