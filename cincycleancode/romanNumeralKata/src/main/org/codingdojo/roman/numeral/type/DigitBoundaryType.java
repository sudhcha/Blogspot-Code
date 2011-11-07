package org.codingdojo.roman.numeral.type;

public enum DigitBoundaryType {
	
	NULL( -1, "", null), ONE(1, "I", NULL), FIVE(5, "V", ONE),
	TEN(10, "X", FIVE), FIFTY(50, "L", TEN), HUNDRED(100, "C", FIFTY),
	FIVEHUNDRED(500, "D", HUNDRED), THOUSAND(1000, "M", FIVEHUNDRED){

		@Override
		protected boolean isNextAvailable() {
			return false;
		}
		
	};
	
	
	
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
	
	protected boolean isNextAvailable(){
		return true;
	}

	private DigitBoundaryType(int value, String symbol, DigitBoundaryType previousType) {
		this.symbol = symbol;
		this.previousType = previousType;
		this.value = value;
	}
	
	public static DigitBoundaryType findType(int n){
		for (DigitBoundaryType type : values()){
			if (n <=type.value || !type.isNextAvailable()){
				return type;
			}
		}
		throw new IllegalArgumentException("The Romans weren't that clever to find: "+n);
	}
	

}
