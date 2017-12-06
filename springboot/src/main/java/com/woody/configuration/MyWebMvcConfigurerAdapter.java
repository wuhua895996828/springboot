package com.woody.configuration;

import java.util.Properties;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.github.pagehelper.PageHelper;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.configuration
 * @author: wh
 * @date: 2017年12月5日 上午11:03:02
 */
@SpringBootConfiguration
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyHandlerInterceptor()).addPathPatterns("/**");
	}

	@Bean
	public PageHelper pageHelper() {
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum", "true");
		properties.setProperty("rowBoundsWithCount", "true");
		properties.setProperty("reasonable", "true");
		properties.setProperty("supportMethodsArguments", "true");
		properties.setProperty("returnPageInfo", "check");
		properties.setProperty("params", "pageNum=page;pageSize=rows;orderBy=orderBy");
		pageHelper.setProperties(properties);
		return pageHelper;
	}

}
