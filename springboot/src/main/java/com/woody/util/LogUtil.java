package com.woody.util;
/**   
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.woody.util 
 * @author: wh   
 * @date: 2017年12月5日 上午9:11:12 
 */

import java.io.PrintWriter;
import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {

	public static Logger logger = LoggerFactory.getLogger("logUtil");

	public static void trace(String msg) {
		logger.trace(msg);
	}

	public static void debug(String msg) {
		logger.debug(msg);
	}

	public static void info(String msg) {
		logger.info(msg);
	}

	public static void warn(String msg) {
		logger.warn(msg);
	}

	public static void error(String msg) {
		logger.error(msg);
	}

	public static void error(Throwable exception) {
		try {
			StringWriter stringWriter = new StringWriter();
			PrintWriter printWriter = new PrintWriter(stringWriter);
			exception.printStackTrace(printWriter);
			logger.error(stringWriter.toString());
		} catch (Exception e) {
			logger.error(exception.getMessage());
			logger.error("==========================");
			logger.error("   logutil error 出错了");
			logger.error("==========================");
		}

	}

	public static Boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	public static Boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	public static Boolean isWarnEnabled() {
		return logger.isWarnEnabled();
	}

	public static Boolean isInfoEnabled() {
		return logger.isInfoEnabled();
	}
}
