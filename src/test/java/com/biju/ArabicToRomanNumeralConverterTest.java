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
	
	@Test
	public void shouldConvert15ToXV() throws Exception {
		assertThat(convertArabicToRomanOf(15), is("XV"));
	}
	
	@Test
	public void shouldConvert20ToXX() throws Exception {
		assertThat(convertArabicToRomanOf(15), is("XV"));
	}
	
	@Test
	public void shouldConvert50ToL() throws Exception {
		assertThat(convertArabicToRomanOf(50), is("L"));
	}
	
	@Test
	public void shouldConvert40ToXL() throws Exception {
		assertThat(convertArabicToRomanOf(40), is("XL"));
	}
	
	@Test
	public void shouldConvert100ToC() throws Exception {
		assertThat(convertArabicToRomanOf(100), is("C"));
	}
	
	@Test
	public void shouldConvert90ToXC() throws Exception {
		assertThat(convertArabicToRomanOf(90), is("XC"));
	}
	
	@Test
	public void shouldConvert99ToXCIX() throws Exception {
		assertThat(convertArabicToRomanOf(99), is("XCIX"));
	}
	
	@Test
	public void shouldConvert1066ToMLXVI() throws Exception {
		assertThat(convertArabicToRomanOf(1066), is("MLXVI"));
	}
	
	@Test
	public void shouldConvert1989ToMCMLXXXIX() throws Exception {
		assertThat(convertArabicToRomanOf(1989), is("MCMLXXXIX"));
	}

	private String convertArabicToRomanOf(int arabicNumeral) {
		return this.converter.convert(arabicNumeral);
	}
	
}
