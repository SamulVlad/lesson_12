package com.samul.javaсorelessons.lesson12.internetstore;

import java.util.Arrays;

public class GoodsOperations {
	public static boolean isPolindrome(String param) {
		boolean result = false;
		String reverced = new StringBuilder(param.toLowerCase()).reverse().toString();

		if (param.toLowerCase().equals(reverced)) {

			result = true;
		}

		return result;
	}

	public static void sort(int[] param) {
		Arrays.sort(param);
	}

}
