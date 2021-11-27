package com.accountms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountmsApplication.class, args);
	}

}
