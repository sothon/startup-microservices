package com.microservices.netflixeurakanameingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurakaNameingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurakaNameingServiceApplication.class, args);
	}

}
