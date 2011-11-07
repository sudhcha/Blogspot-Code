package org.sudhcha.cincyclean.refactor2;

public class Rental {

	private final Movie movie;

	private final int daysRented;

	public Rental(Movie movie, int rented) {
		super();
		this.movie = movie;
		daysRented = rented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public double getCharge() {

		double thisAmount = 0;

		// determine amounts for each line
		switch (getMovie().getPriceCode()) {
		case REGULAR:
			thisAmount += 2;
			if (getDaysRented() > 2)
				thisAmount += (getDaysRented() - 2) * 1.5;
			break;
		case NEW_RELEASE:
			thisAmount += getDaysRented() * 3;
			break;
		case CHILDRENS:
			thisAmount += 1.5;
			if (getDaysRented() > 3)
				thisAmount += (getDaysRented() - 3) * 1.5;
			break;

		}
		return thisAmount;

	}

	public int getFrequentRenterPoints() {
		if ((getMovie().getPriceCode() == Movie.PriceCode.NEW_RELEASE)
				&& getDaysRented() > 1)
			return 2;
		return 1;
	}

}
