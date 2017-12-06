package com.woody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.woody.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/view")
	@ResponseBody
	public PageInfo<?> view() {
		Page<?> page = PageHelper.startPage(1, 3);
		userService.getUsers();
		return new PageInfo<>(page);
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

}
