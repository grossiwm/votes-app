package com.votesapp.votesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VotesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotesappApplication.class, args);
	}

}
