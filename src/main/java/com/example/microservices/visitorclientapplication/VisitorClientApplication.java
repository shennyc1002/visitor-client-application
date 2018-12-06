package com.example.microservices.visitorclientapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class VisitorClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisitorClientApplication.class, args);
	}
}
