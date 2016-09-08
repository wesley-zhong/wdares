package com.ares.framework.util;


/**
 * author wesley.zhong
 */
public class RandomUtils {

	public static int nextInt( int max ) {
		return ThreadLocalSecureRandom.get().nextInt(max);
	}
}