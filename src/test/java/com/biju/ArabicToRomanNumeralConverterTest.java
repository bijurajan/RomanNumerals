package com.biju;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicToRomanNumeralConverterTest {
	
	private ArabicToRomanNumeralConverter converter = new ArabicToRomanNumeralConverter();

	@Test
	public void shouldConvert1ToI() throws Exception {
		assertThat(convertArabicToRomanOf(1), is("I"));
	}
	
	@Test
	public void shouldConvert2ToII() throws Exception {
		assertThat(convertArabicToRomanOf(2), is("II"));
	}
	
	@Test
	public void shouldConvert3ToIII() throws Exception {
		assertThat(convertArabicToRomanOf(3), is("III"));
	}

	private String convertArabicToRomanOf(int arabicNumeral) {
		return this.converter.convert(arabicNumeral);
	}
	
}
