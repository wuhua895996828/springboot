package com.woody.controller;

import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woody.domain.User;
import com.woody.service.UserService;
import com.woody.util.ResponseData;
import com.woody.util.ResponseDataEnum;
import com.woody.vo.LoginVo;

/**
 * @Title: LoginController.java
 * @Package com.woody.controller
 * @Description: TODO
 * @author wh
 * @date 2017年12月21日 上午11:16:04
 * @version V1.0
 */
@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseData login(@Valid LoginVo vo) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			return new ResponseData();
		}
		User user = userService.getByUsername(vo.getUsername());
		if (user.getPassword().equals(vo.getPassword())) {
			UsernamePasswordToken token = new UsernamePasswordToken(vo.getUsername(), user.getPassword());
			SecurityUtils.getSubject().login(token);
			return new ResponseData();
		} else {
			return new ResponseData(ResponseDataEnum.FAIL);
		}

	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String success() {
		return "success";
	}

	@RequestMapping(value = "/unauthorized", method = RequestMethod.GET)
	public String unauthorized() {
		return "unauthorized";
	}

}
