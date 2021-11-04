package com.hashkartnamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HashkartnamingserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HashkartnamingserverApplication.class, args);
	}

}
