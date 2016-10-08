package com.biju;

public class ArabicToRomanNumeralConverter {

	private static final String I = "I";
	private static final int[] CUTOFF_NUMBERS = { 5, 10, 50 };
	private static final String[] CUTOFF_VALUES = { "V", "X", "L" };

	public String convert(int number) {
		StringBuilder result = new StringBuilder();

		int difference = number;

		for (int counter = CUTOFF_NUMBERS.length - 1; counter >= 0; counter--) {
			int cutOffNumber = CUTOFF_NUMBERS[counter];
			String cutOffValue = CUTOFF_VALUES[counter];
			if (difference >= cutOffNumber) {
				result.append(cutOffValue);
				difference = difference - cutOffNumber;
			}
			if (difference == cutOffNumber - 1) {
				result.append(I + cutOffValue);
				difference = difference - cutOffNumber - 1;
			}
		}

		for (int i = 0; i < difference; i++) {
			result.append(I);
		}
		return result.toString();
	}

}
