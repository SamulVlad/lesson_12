package com.samul.javaсorelessons.lesson12.internetstore;

public class InterStore {

	public static void main(String[] args) {
		String[] goods = new String[] {"apple", "radar", "banana"};
		int[] prices = new int[] {100, 50, 75};
		
		GoodsReport.makeReport(goods, prices);

	}

}
