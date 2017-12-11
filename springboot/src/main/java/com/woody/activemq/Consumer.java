package com.woody.activemq;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**   
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.activemq 
 * @author: wh   
 * @date: 2017年12月6日 上午11:47:00 
 */

//@Component
public class Consumer {

	@JmsListener(destination = "sample.queue")
	public void receiveQueue(String text) {
		System.out.println("=======receiveQueue======");
		System.out.println(text);
		System.out.println("=======receiveQueue======");
	}

}