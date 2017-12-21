package com.woody.vo;

import javax.validation.constraints.NotNull;

/**    
 * @Title: LoginVo.java  
 * @Package com.woody.vo  
 * @Description: TODO  
 * @author wh 
 * @date 2017年12月21日 上午11:18:40  
 * @version V1.0    
 */
public class LoginVo {
	
	@NotNull(message="用户名不能为空")
	private String username ;
	
	@NotNull(message="密码不能为空")
	private String password ;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
