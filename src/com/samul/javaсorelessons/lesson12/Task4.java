package com.samul.javaсorelessons.lesson12;

import com.example.calculations.CalculationUtils;

public class Task4 {

	public static void main(String[] args) {
		String result;
		int a = 10, b = 20;
		
		result = CalculationUtils.calculate(a, b, " a * b = ", " a + b = ");
		
		System.out.println(result);

	}

}
