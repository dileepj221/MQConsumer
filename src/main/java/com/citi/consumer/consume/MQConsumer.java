package com.citi.consumer.consume;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MQConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(MQConsumer.class);
	
	private CountDownLatch latch = new CountDownLatch(1);
	
	@Value("${listener.activemq.queue}")
	private String destination;
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	public CountDownLatch getLatch() {
		return latch;
	}
	
	@JmsListener(destination = "${listener.activemq.queue}")
	public void receive(String message){
		
		//LOGGER.info("received message='{}'", cust.getId());
		System.out.println("received message=" + message);
		latch.countDown();
	}

}
