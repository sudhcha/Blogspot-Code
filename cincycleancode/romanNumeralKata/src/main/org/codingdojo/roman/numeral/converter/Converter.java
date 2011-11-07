package org.codingdojo.roman.numeral.converter;

import org.codingdojo.roman.numeral.type.DigitBoundaryType;

public class Converter {

	public String toNumeral(Integer digit) {
		StringBuilder numeral = new StringBuilder();
		DigitBoundaryType type = DigitBoundaryType.findType(digit);
		int value = type.getValue();
		int previousValue = type.getPreviousType().getValue();
		int diffWithCurrent = value - digit;
		int diffWithPrevious = digit - previousValue;
		if (diffWithCurrent == 0){
			return numeral.append(type.getSymbol()).toString();
		}
		if (diffWithPrevious == 0){
			return numeral.append(type.getPreviousType().getSymbol()).toString();
		}
		
		if (diffWithCurrent < diffWithPrevious){
			numeral.append(toNumeral(diffWithCurrent));
			numeral.append(type.getSymbol());
		} else {
			numeral.append(type.getPreviousType().getSymbol());
			numeral.append(toNumeral(diffWithPrevious));
		}
		
		return numeral.toString();
	}

}