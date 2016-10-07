package com.biju;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class ArabicToRomanNumeralConverter {
	
	Map<Integer, String> cutOffsMap = ImmutableMap.of(
			1, "I",
			5, "V"
			);

	public String convert(int number) {
		StringBuilder result = new StringBuilder();
		if(cutOffsMap.containsKey(number)){
			return cutOffsMap.get(number);
		}
		
		int difference = number;
		if(number > 5){
			result.append("V");
			difference = number - 5;
		} else if(difference == 4){
			result.append("IV");
			difference = difference - 4;
		}
		
		for (int i = 0; i < difference; i++) {
			result.append("I");
		}
		return result.toString();
	}

}
