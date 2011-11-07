package org.sudhcha.cincyclean.refactor3;

public class Movie {

	public enum PriceCode {
		CHILDRENS {
			@Override
			public double getCharge(int daysRented) {
				double amount = 1.5;
				if (daysRented > 3)
					amount += (daysRented - 3) * 1.5;
				return amount;
			}
		},

		REGULAR {
			@Override
			public double getCharge(int daysRented) {
				double amount = 2;
				if (daysRented > 2)
					amount += (daysRented - 2) * 1.5;
				return amount;
			}
		},
		NEW_RELEASE {
			@Override
			public double getCharge(int daysRented) {
				return daysRented * 3;
			}
		};

		public abstract double getCharge(int daysRented);

	}

	private String title;

	private PriceCode priceCode;

	public Movie(String title, PriceCode code) {
		super();
		this.title = title;
		priceCode = code;
	}

	public PriceCode getPriceCode() {
		return priceCode;
	}

	public String getTitle() {
		return title;
	}

	public void setPriceCode(PriceCode priceCode) {
		this.priceCode = priceCode;
	}

	public double getCharge(int daysRented) {
		return priceCode.getCharge(daysRented);
	}

}
