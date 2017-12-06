package com.woody.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.woody.util.Constant;
import com.woody.util.LogUtil;
import com.woody.util.MyException;
import com.woody.util.ResponseData;
import com.woody.util.ResponseDataEnum;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.controller
 * @author: wh
 * @date: 2017年12月5日 上午9:47:52
 */
@ControllerAdvice
public class ThrowableController {

	@ExceptionHandler
	public void handler(HttpServletRequest request, HttpServletResponse response, Throwable throwable)
			throws Exception {

		System.out.println("@ExceptionHandler");

		ResponseData responseData = null;
		String method = request.getMethod();
		LogUtil.error(throwable);

		// 自定义错误
		if (throwable instanceof MyException) {
			MyException myException = (MyException) throwable;
			ResponseDataEnum responseDataEnum = myException.getResponseDataEnum();
			responseData = new ResponseData(responseDataEnum);
			if (responseDataEnum != null) {
				LogUtil.error(responseDataEnum.getMsg());
				LogUtil.error(responseDataEnum.getCode());
			}
		}

		if (method.equalsIgnoreCase("get")) {
			request.getRequestDispatcher(Constant.PATH_500).forward(request, response);
		} else {
			response.setContentType("text/html;charset=UTF-8");
			Gson gson = new GsonBuilder().create();
			response.getWriter().write(gson.toJson(responseData));
		}

	}

}
