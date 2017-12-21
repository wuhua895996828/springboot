package com.woody.configuration.web;

import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.woody.util.Constant;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.configuration
 * @author: wh
 * @date: 2017年12月5日 上午9:37:00
 */
@Component
public class CommonErrorPageRegistrar implements ErrorPageRegistrar {

	/*
	 * (non-Javadoc)
	 *  定义 400，500页面
	 */
	public void registerErrorPages(ErrorPageRegistry registry) {
		ErrorPage page404 = new ErrorPage(HttpStatus.NOT_FOUND,Constant.PATH_404);
		ErrorPage page500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, Constant.PATH_500);
		registry.addErrorPages(page404, page500);
	}

}
