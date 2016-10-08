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
	
	@Test
	public void shouldConvert5ToV() throws Exception {
		assertThat(convertArabicToRomanOf(5), is("V"));
	}
	
	@Test
	public void shouldConvert4ToIV() throws Exception {
		assertThat(convertArabicToRomanOf(4), is("IV"));
	}
	
	@Test
	public void shouldConvert6ToVI() throws Exception {
		assertThat(convertArabicToRomanOf(6), is("VI"));
	}
	
	@Test
	public void shouldConvert7ToVII() throws Exception {
		assertThat(convertArabicToRomanOf(7), is("VII"));
	}
	
	@Test
	public void shouldConvert8ToVIII() throws Exception {
		assertThat(convertArabicToRomanOf(8), is("VIII"));
	}
	
	@Test
	public void shouldConvert9ToIX() throws Exception {
		assertThat(convertArabicToRomanOf(9), is("IX"));
	}
	
	@Test
	public void shouldConvert10ToX() throws Exception {
		assertThat(convertArabicToRomanOf(10), is("X"));
	}
	
	@Test
	public void shouldConvert11ToXI() throws Exception {
		assertThat(convertArabicToRomanOf(11), is("XI"));
	}

	private String convertArabicToRomanOf(int arabicNumeral) {
		return this.converter.convert(arabicNumeral);
	}
	
}
