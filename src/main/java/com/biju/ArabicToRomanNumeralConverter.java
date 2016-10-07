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
		
		for (int i = 0; i < number; i++) {
			result.append("I");
		}
		return result.toString();
	}

}
