package com.example.main;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.example")
//@SpringBootApplication(scanBasePackages = "com.example" , exclude = org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class)
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.entity")
@EnableBinding(Source.class)
public class DemoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@PostConstruct
	public void initDataBase(){
		
	}
}
