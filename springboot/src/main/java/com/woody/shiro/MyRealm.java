package com.woody.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.pagehelper.StringUtil;
import com.woody.domain.User;
import com.woody.service.UserService;

/**
 * @Title: MyRealm.java
 * @Package com.woody.shiro
 * @Description: TODO
 * @author wh
 * @date 2017年12月21日 上午10:38:57
 * @version V1.0
 */
@Component
public class MyRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	/*
	 * (non-Javadoc)
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 * 配置权限
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		String username = (String) principalCollection.getPrimaryPrincipal();
		User user = userService.getByUsername(username);
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		String roleName = userService.getRoleName(user.getRoleId());
		if (StringUtil.isEmpty(roleName)) {
			authorizationInfo.addRole(roleName);
		}
		return authorizationInfo;
	}

	/*
	 * (non-Javadoc)
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 * 登陆认证
	 */
	
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws AuthenticationException {
		String username = authenticationToken.getPrincipal().toString();
		User user = userService.getByUsername(username);
		if (user == null) {
			throw new UnknownAccountException();
		}
		return new SimpleAuthenticationInfo(username, user.getPassword(), getName());
	}

}
