package com.woody.activemq;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**   
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.activemq 
 * @author: wh   
 * @date: 2017年12月6日 上午11:44:50 
 * 
 * 
 * @JmsListener
 * JmsMessagingTemplate
 */
//@Configuration
public class MyActivemqConfig {

	
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("sample.queue");
	}
	
}

