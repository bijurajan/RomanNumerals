package com.biju;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ArabicToRomanNumeralConverterTest {
	
	private ArabicToRomanNumeralConverter converter = new ArabicToRomanNumeralConverter();

	@Test
	public void shouldConvert1ToI() throws Exception {
		String result = this.converter.convert(1);
		
		assertThat(result, is("I"));
	}	
}
