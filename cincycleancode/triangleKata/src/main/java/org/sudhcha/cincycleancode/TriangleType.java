package org.sudhcha.cincycleancode;

public enum TriangleType {

	SCALENE {

		@Override
		public boolean satisfies(int len1, int len2, int len3) {
			return len1 != len2 && len2 != len3 && len1 != len3;
		}

	},
	ISOSCELES {

		@Override
		public boolean satisfies(int len1, int len2, int len3) {
			return (len1 == len2 && len2 != len3)
					|| (len1 == len3 && len2 != len3)
					|| (len3 == len2 && len1 != len3);
		}

	},
	EQUILATERAL {

		@Override
		public boolean satisfies(int len1, int len2, int len3) {
			return len1 == len2 && len2 == len3;
		}

	};

	public abstract boolean satisfies(int len1, int len2, int len3);

}
