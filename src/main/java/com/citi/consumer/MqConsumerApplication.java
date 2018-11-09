package com.citi.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.citi.consumer.consume.MQConsumer;

@SpringBootApplication
public class MqConsumerApplication implements CommandLineRunner{
	
	@Autowired
	MQConsumer mqConsumer;

	public static void main(String[] args) {
		SpringApplication.run(MqConsumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
}
