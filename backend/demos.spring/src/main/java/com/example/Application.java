package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.oas.annotations.EnableOpenApi;





import javax.transaction.Transactional;


import org.springframework.boot.CommandLineRunner;
@EnableOpenApi
@EnableEurekaClient
@SpringBootApplication
public class Application implements CommandLineRunner { 

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	

	@Override
	@Transactional
	public void run(String... args) {

}
}
