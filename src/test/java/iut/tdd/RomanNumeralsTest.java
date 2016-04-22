package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	private RomanNumerals romanNumeral;

	@Test
	public void should_return_I_when_1 () {
		//Given
		String input = "1";
		String expected = "I";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void should_return_1_when_I () {
		//Given
		String input = "I";
		String expected = "1";
		RomanNumerals romanNumeral2 = new RomanNumerals();
		//When
		String actual = romanNumeral2.convertFromRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	
}
