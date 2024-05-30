package com.example.calculations;

import com.example.addition.AdditionUtils;
import com.example.math.MathOperations;

public class CalculationUtils {
	public static String calculate(int intParam1, int intParam2, String strParam1, String strParam2) {
		String result;
		
		result = strParam1 + MathOperations.multiply(intParam1, intParam2);
		
		result += "\n" + strParam2 + AdditionUtils.sum(intParam1, intParam2);
		
		return result;
	}

}
