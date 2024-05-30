package com.samul.javaсorelessons.lesson12.internetstore;

public class GoodsReport {
	public static void makeReport(String[] goods, int[] prices) {
		for (String elem : goods) {
			System.out.println(
					"Название товара: " + elem + " ,Палиндром: " + (GoodsOperations.isPolindrome(elem) ? "Да" : "Нет"));
		}

		GoodsOperations.sort(prices);

		System.out.print("Отсортированные цены: [");

		for (int i = 0; i < prices.length; i++) {
			System.out.print(prices[i] + (i == prices.length - 1 ? "" : ", "));
		}

		System.out.print("]");

	}

}
