package org.codingdojo.roman.numeral.type;

public enum DigitBoundaryType {

	NULL(-1, -1, null), I(1, 0, NULL), V(5, 1, I), X(10, 5, I), L(50, 10, X), C(100, 50, X), D(500, 100, C), 
	M(1000, 500, C);

	private final int value;

	public int getValue() {
		return value;
	}

	private final DigitBoundaryType allowedSubtractType;

	private final int previousValue;

	public DigitBoundaryType getAllowedSubtractType() {
		return allowedSubtractType;
	}

	private DigitBoundaryType(int value, int previousValue, DigitBoundaryType allowedSubtractType) {
		this.previousValue = previousValue;
		this.allowedSubtractType = allowedSubtractType;
		this.value = value;
	}

	public static DigitBoundaryType findType(int n) {
		for (DigitBoundaryType type : values()) {
			if (n == type.value) {
				return type;
			}
		}
		throw new IllegalArgumentException("The Romans weren't that clever to find: " + n);
	}

	public int getAllowedCurrentDifference() {
		return getAllowedSubtractType().getValue();
	}

	public int getPreviousValue() {
		return previousValue;
	}

	public String addPreviousAndThisSymbol() {
		return getAllowedSubtractType().toString() + toString();
	}

}
