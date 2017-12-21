package com.woody.service;

import java.util.List;

import com.woody.domain.User;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.service
 * @author: wh
 * @date: 2017年12月5日 上午9:06:25
 */
public interface UserService {

	List<User> getUsers();

	int updateUser() throws Exception;

	User getByUsername(String username);

	String getRoleName(Long id);
}
