package org.sudhcha.cincyclean.refactor3;

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
		
		return getMovie().getCharge(getDaysRented());
	}

	public int getFrequentRenterPoints() {
		if ((getMovie().getPriceCode() == Movie.PriceCode.NEW_RELEASE)
				&& getDaysRented() > 1)
			return 2;
		return 1;
	}

}
