package com.woody.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.MonitorConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved. dubbo 配置
 * 
 * @Package: com.woody.dubbo
 * @author: wh
 * @date: 2017年12月6日 下午4:11:55
 * @see dubbo 配置
 * 
 * @see 模型 API RpcException URL
 */
@Configuration
public class DubboConfiguration {

	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("dubbo");
		applicationConfig.setLogger("slf4j");
		applicationConfig.setOwner("woody");
		// 当业务线程池满时，我们需要知道线程都在等待哪些资源、条件，以找到系统的瓶颈点或异常点
		// applicationConfig.setDumpDirectory();
		return applicationConfig;
	}

	/*
	 * 注冊中心配置
	 */
	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setAddress("zookeeper://120.79.7.181:2181");
		registryConfig.setClient("curator");
		return registryConfig;
	}

	/*
	 * 消费者配置
	 */
	@Bean
	public ConsumerConfig consumerConfig() {
		ConsumerConfig consumerConfig = new ConsumerConfig();
		consumerConfig.setTimeout(3000);
		consumerConfig.setCheck(false);
		consumerConfig.setOwner("woody");
		return consumerConfig;
	}

	/*
	 * 提供者配置
	 */
	@Bean
	public ProviderConfig providerConfig() {
		ProviderConfig providerConfig = new ProviderConfig();
		// Spring 初始化完成后，再暴露服务
		providerConfig.setDelay(-1);
		providerConfig.setTimeout(1000);
		providerConfig.setRetries(2);
		providerConfig.setLoadbalance("random");
		providerConfig.setThreads(200);
		providerConfig.setActives(200);
		providerConfig.setOwner("woody");
		return providerConfig;

	}

	/**
	 * 协议配置
	 */
	@Bean
	public ProtocolConfig protocolConfig() {
		ProtocolConfig protocolConfig = new ProtocolConfig();
		// 服务IP地址(多网卡时使用) ;
		// protocolConfig.setHost(host);
		// 服务提供方限制大接收连接数
		protocolConfig.setAccepts(1000);
		return protocolConfig;
	}

	
	//@Bean
	public MonitorConfig monitorConfig() {
		MonitorConfig monitorConfig = new MonitorConfig() ;
		monitorConfig.setAddress("121.40.97.202:9090");
		return monitorConfig;
		
	}

}
