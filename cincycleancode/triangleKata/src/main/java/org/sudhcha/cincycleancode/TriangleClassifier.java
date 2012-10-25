package org.sudhcha.cincycleancode;


public class TriangleClassifier {

	public TriangleType classify(int len1, int len2, int len3) {

		if (!isValidSides(len1, len2, len3)) {
			throw new IllegalArgumentException(
					"The given lengths of the sides cannot correspond to a real triangle");
		}

		for (TriangleType eachType : TriangleType.values()) {
			if (eachType.satisfies(len1, len2, len3)) {
				return eachType;
			}
		}
		throw new RuntimeException(
				"Something unknown is seriously wrong with the code");
	}

	private boolean isValidSides(int len1, int len2, int len3) {
		return len1 + len2 >= len3 && len2 + len3 >= len1 && len1 + len3>= len2;
	}
}
