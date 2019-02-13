package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Component;

@Component
@EnableEurekaClient
@SpringBootApplication
public class QuestionsRest {

	public static void main(String[] args) {
		SpringApplication.run(QuestionsRest.class, args);
	}
}