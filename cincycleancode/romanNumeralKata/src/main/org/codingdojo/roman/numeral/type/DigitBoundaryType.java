package org.codingdojo.roman.numeral.type;

public enum DigitBoundaryType {
	
	NULL( -1, "", null), ONE(1, "I", NULL), FIVE(5, "V", ONE),
	TEN(10, "X", FIVE), FIFTY(50, "L", TEN), HUNDRED(100, "C", FIFTY);
	
	
	
	private final int value;
	
	public int getValue() {
		return value;
	}

	
	private final String symbol;
	
	private final DigitBoundaryType previousType;

	public String getSymbol() {
		return symbol;
	}
	
	public DigitBoundaryType getPreviousType(){
		return previousType;
	}

	private DigitBoundaryType(int value, String symbol, DigitBoundaryType previousType) {
		this.symbol = symbol;
		this.previousType = previousType;
		this.value = value;
	}
	
	public static DigitBoundaryType findType(int n){
		for (DigitBoundaryType type : values()){
			if (n <=type.value){
				return type;
			}
		}
		throw new IllegalArgumentException("The Romans weren't that clever to find: "+n);
	}
	

}
