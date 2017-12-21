package com.woody.util;

/**
 * @Title: StringUtil.java
 * @Package com.woody.util
 * @Description: TODO
 * @author wh
 * @date 2017年12月21日 上午10:58:40
 * @version V1.0
 */
public class StringUtil {

	public static final String empty = "";

	public static boolean isEmpty(String str) {
		if (str == null || str.equals(empty)) {
			return true;
		} else {
			return false;
		}
	}

}
