package com.woody.util;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.util
 * @author: wh
 * @date: 2017年12月5日 上午10:10:16
 */
public class MyException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private ResponseDataEnum responseDataEnum;

	public MyException() {
	}

	public MyException(ResponseDataEnum responseDataEnum) {
		this.responseDataEnum = responseDataEnum;
	}

	public ResponseDataEnum getResponseDataEnum() {
		return responseDataEnum;
	}

	public void setResponseDataEnum(ResponseDataEnum responseDataEnum) {
		this.responseDataEnum = responseDataEnum;
	}
	
	
}
