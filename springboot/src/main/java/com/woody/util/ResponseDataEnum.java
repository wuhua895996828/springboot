package com.woody.util;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.util
 * @author: wh
 * @date: 2017年12月5日 上午9:49:53
 */
public enum ResponseDataEnum {

	OK("0", "SUCCESS"), FAIL("-1", "FAIL"), ERROR("-2", "ERROR");

	private ResponseDataEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	};

	private String code;

	private String msg;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
