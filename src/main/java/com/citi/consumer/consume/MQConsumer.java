package com.citi.consumer.consume;

import java.util.concurrent.CountDownLatch;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;

import com.citi.consumer.vo.Customer;

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
	
	public void receive(TextMessage message) throws JMSException {
		Customer cust = (Customer) jmsTemplate.receiveAndConvert(destination);
		LOGGER.info("received message='{}'", cust.getId());
		System.out.println("received message=" + cust.getId());
		latch.countDown();
	}

}
