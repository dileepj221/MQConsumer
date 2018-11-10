package com.citi.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MqConsumerApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(MqConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
}
