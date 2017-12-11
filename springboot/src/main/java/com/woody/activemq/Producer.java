package com.woody.activemq;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.activemq
 * @author: wh
 * @date: 2017年12月6日 上午11:48:02
 */

//@Component
public class Producer implements CommandLineRunner {

	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;

	@Autowired
	private Queue queue;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Message was sent to the Queue");
		send("Sample message");
		System.out.println("Message was sent to the Queue");
	}

	public void send(String msg) {
		this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
	}

}