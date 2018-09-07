package com.abrainyun.ldc.midware.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LdcTestDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(LdcTestDeployApplication.class, args);
	}
}
