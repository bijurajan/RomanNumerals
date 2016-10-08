package com.biju;

public class ArabicToRomanNumeralConverter {

	private static final int[] CUTOFF_NUMBERS = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
	private static final String[] CUTOFF_VALUES = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

	public String convert(int number) {
		StringBuilder result = new StringBuilder();

		int difference = number;

		for (int i = CUTOFF_NUMBERS.length - 1; i >= 0; i--) {
			int cutOffNumber = CUTOFF_NUMBERS[i];
			String cutOffValue = CUTOFF_VALUES[i];
			int count=0;
			while(difference > 0 && count < 3){
				difference = calculateDifference(result, difference, cutOffNumber, cutOffValue);
				count++;
			}
		}

		return result.toString();
	}

	private int calculateDifference(StringBuilder result, int difference, int cutOffNumber, String cutOffValue) {
		if (difference >= cutOffNumber) {
			result.append(cutOffValue);
			difference = difference - cutOffNumber;
		}
		return difference;
	}

}
