package com.woody;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.woody.dao.UserDao;
import com.woody.util.LogUtil;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.controller
 * @author: wh
 * @date: 2017年12月5日 上午9:47:52
 * 
 *        =============启动类===========
 */
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
// @ImportResource(locations = { "classpath:dubbo.xml" })
@DubboComponentScan(basePackages = "com.woody")
@EnableTransactionManagement
@ServletComponentScan
// @EnableJms
public class App {

	public static void main(String[] args) throws Exception {

		SpringApplication springApplication = new SpringApplication(App.class);

		// springApplication.setAdditionalProfiles("prod");

		ConfigurableApplicationContext context = springApplication.run(args);

		ConfigurableEnvironment environment = context.getEnvironment();

		System.out.println("role.name" + environment.getProperty("role.name"));

		DataSource dataSource = context.getBean(DataSource.class);
		LogUtil.info(dataSource.getClass().toString());

		UserDao userDao = context.getBean(UserDao.class);
		LogUtil.info(userDao.getUsers().toString());

		SqlSessionFactory sessionFactory = context.getBean(SqlSessionFactory.class);
		LogUtil.info(sessionFactory.toString());

		// context.close();
	}

}