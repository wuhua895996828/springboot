package com.woody.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woody.dao.UserDao;
import com.woody.domain.User;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.service
 * @author: wh
 * @date: 2017年12月5日 上午9:07:15
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public List<User> getUsers() {
		return userDao.getUsers();
	}

	public int updateUser() throws Exception {
		User user = userDao.selectByPrimaryKey(1L);
		user.setEmail("2212460086@qq.com");
		return userDao.updateByPrimaryKeySelective(user);
	}

	public User getByUsername(String username) {
		return userDao.getByUsername(username);
	}

	public String getRoleName(Long id) {
		return userDao.getRoleName(id);
	}
}
