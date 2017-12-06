package com.woody.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.configuration
 * @author: wh
 * @date: 2017年12月5日 上午11:04:26
 * 
 * @see 自定义一个filter：使用@WebFilter
 * @see 自定义一个listener：使用@WebListener
 * @see 自定义一个servlet：使用@WebServlet
 * 
 */
public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("=====MyHandlerInterceptor preHandle=====");
		return true;
	}

}
