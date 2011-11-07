package org.cincycleancode;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays
				.asList(new Object[][] { { 1, "1" }, { 2, "2" },
						{ 3, "Three" }, { 4, "4" }, { 5, "Buzz" },
						{ 15, "FizzBuzz" } });
	}

	private int input;

	private String expected;

	public FizzBuzzTest(int input, String expected) {
		super();
		this.input = input;
		this.expected = expected;
	}
	
	@Test
	public void testIsInputGivesExpected(){
		assertEquals(FizzBuzz.fizzBuzzIt(input), expected);
	}

}
