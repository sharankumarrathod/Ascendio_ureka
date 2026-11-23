package com.eurake.clinet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClinetApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClinetApplication.class, args);
	}

}
