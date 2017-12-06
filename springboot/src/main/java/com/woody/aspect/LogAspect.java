package com.woody.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.woody.util.LogUtil;

/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.aspect
 * @author: wh
 * @date: 2017年12月5日 上午9:10:33
 */
@Component
@Aspect
public class LogAspect {

	@Pointcut("execution(* com.woody..*.*(..))")
	public void pointcut() {
	}

	@Before("pointcut()")
	public void before() {
		LogUtil.info("before");
	}

	@After("pointcut()")
	public void after() {
		LogUtil.info("after");
	}

	@AfterReturning(pointcut = "pointcut()", returning = "returnVal")
	public void afterReturn(JoinPoint joinPoint, Object returnVal) {
		System.out.println("AOP AfterReturning Advice:");
	}

	@AfterThrowing(pointcut = "pointcut()", throwing = "error")
	public void afterThrowing(JoinPoint joinPoint, Throwable error) {
		System.out.println("AfterThrowing...");
		//LogUtil.error(error);
	}

	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("AOP Aronud");
		Object object = pjp.proceed();
		return object;
	}

}
