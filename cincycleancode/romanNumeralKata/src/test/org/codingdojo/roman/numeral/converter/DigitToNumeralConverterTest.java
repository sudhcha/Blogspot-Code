package org.codingdojo.roman.numeral.converter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DigitToNumeralConverterTest {

	private Integer input;

	private String output;

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {

		{ 1, "I" }, { 2, "II" }, { 3, "III" }, { 4, "IV" }, { 5, "V" }, { 6, "VI" }, { 7, "VII" }, { 8, "VIII" },
				{ 9, "IX" }, { 10, "X" }, { 11, "XI" }, { 12, "XII" }, { 13, "XIII" }, { 14, "XIV" }, { 15, "XV" },
				{ 16, "XVI" }, { 17, "XVII" }, { 18, "XVIII" }, { 19, "XIX" }, { 20, "XX" }, { 30, "XXX" },
				{ 40, "XL" }, { 80, "LXXX" }, { 90, "XC" }, { 900, "CM" }, { 990, "CMXC" }, { 1990, "MCMXC" },
				{ 1000, "M" }, { 2000, "MM" }, { 3000, "MMM" }, { 1944, "MCMXLIV" }, { 2006, "MMVI" },
				{ 2008, "MMVIII" }, { 1910, "MCMX" }, { 1954, "MCMLIV" } });
	}

	public DigitToNumeralConverterTest(Integer input, String output) {
		super();
		this.input = input;
		this.output = output;
	}

	private Converter testInstance = new Converter();

	@Test
	public void testToNumeral() throws Exception {
		assertEquals(output, testInstance.toNumeral(input));
	}

}
