package com.woody.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Title: Role.java
 * @Package com.woody.domain
 * @Description: TODO
 * @author wh
 * @date 2017年12月12日 下午2:06:51
 * @version V1.0
 */
@ConfigurationProperties(prefix = "role")
public class Role {

	private String name;

	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	

}
