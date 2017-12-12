package com.woody.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.service.EchoService;
import com.woody.service.DubboDemoService;
import com.woody.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/view")
	@ResponseBody
	public List<?> view() {
		System.out.println("hello world");
		return userService.getUsers();
	}

	@RequestMapping("/demo/ok")
	public String ok() {
		System.out.println("demo ok");
		return "ok";
	}

	@ResponseBody
	@RequestMapping("error500")
	public void error500() throws Exception {
		// userService.updateUser();
		throw new Exception();
	}

	@Reference
	private DubboDemoService dubboDemoService;

	@ResponseBody
	@RequestMapping("dubbotest")
	public String dubbotest() {
		System.out.println(dubboDemoService.getClass());
		System.out.println(dubboDemoService.sayHello());

		EchoService echoService = (EchoService) dubboDemoService;
		System.out.println(echoService.$echo("ok"));

		return "success";
	}

	@ResponseBody
	@RequestMapping("dubbotx")
	public String dubbotx() throws Exception {
		System.out.println("sayHello ==" + dubboDemoService.sayHello());
		return "success";
	}
}
