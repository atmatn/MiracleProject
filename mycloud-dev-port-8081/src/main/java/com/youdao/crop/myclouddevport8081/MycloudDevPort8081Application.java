package com.youdao.crop.myclouddevport8081;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MycloudDevPort8081Application {

	public static void main(String[] args) {
		SpringApplication.run(MycloudDevPort8081Application.class, args);
	}
}
