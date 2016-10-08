package com.biju;

public class ArabicToRomanNumeralConverter {

	private static final String I = "I";
	private static final int[] CUTOFF_NUMBERS = { 1, 4, 5, 9, 10, 40, 50 };
	private static final String[] CUTOFF_VALUES = { "I", "IV", "V", "IX", "X", "XL", "L" };

	public String convert(int number) {
		StringBuilder result = new StringBuilder();

		int difference = number;

		for (int counter = CUTOFF_NUMBERS.length - 1; counter >= 0; counter--) {
			int cutOffNumber = CUTOFF_NUMBERS[counter];
			String cutOffValue = CUTOFF_VALUES[counter];
			difference = calculateDifference(result, difference, cutOffNumber, cutOffValue);
		}

		for (int i = 0; i < difference; i++) {
			result.append(I);
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
