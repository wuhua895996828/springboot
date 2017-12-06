package com.woody.service;

import org.springframework.stereotype.Service;

/*
 * 	dubbo
 */
@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService {

	public String test() {
		return "hello world";
	}

}
