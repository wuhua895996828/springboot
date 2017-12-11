package com.woody.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.woody.dao.UserDao;
import com.woody.domain.User;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.service
 * @author: wh
 * @date: 2017年12月6日 下午4:27:41
 */
@Service
@Transactional
public class DubboDemoServiceImpl implements DubboDemoService {

	@Autowired
	private UserDao userDao;

	public DubboDemoServiceImpl() {
		System.out.println("=====DubboDemoServiceImpl=======");
	}

	public String sayHello() {
		System.out.println("isConsumerSide=" + RpcContext.getContext().isConsumerSide());
		System.out.println("getRemoteHost=" + RpcContext.getContext().getRemoteHost());
		System.out.println(RpcContext.getContext().getUrl());

		return "==========hello world===========";
	}

	public int updateUser() throws Exception {
		User user = userDao.selectByPrimaryKey(7L);
		user.setEmail("895996828@qq.com");
		System.out.println(user);
		return userDao.updateByPrimaryKey(user);
	}

}
