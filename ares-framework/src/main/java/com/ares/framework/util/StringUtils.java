package com.ares.framework.util;

/**
 * @author wesley.zhong
 */
public class StringUtils {

	public static boolean isNullOrWhitespace( String string ) {
		return string == null || string.trim().length() == 0;
	}
}
