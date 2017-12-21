package com.woody.util;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.util
 * @author: wh
 * @date: 2017年12月5日 上午9:49:35
 */
public class ResponseData {

	private String msg;

	private String code;

	private Object data;

	public ResponseData() {
		this.code = ResponseDataEnum.OK.getCode();
		this.msg = ResponseDataEnum.OK.getMsg();
	}

	public ResponseData(Object data) {
		this.data = data;
		this.code = ResponseDataEnum.OK.getCode();
		this.msg = ResponseDataEnum.OK.getMsg();
	}

	public ResponseData(ResponseDataEnum responseDataEnum) {
		this.code = responseDataEnum.getCode();
		this.msg = responseDataEnum.getMsg();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
