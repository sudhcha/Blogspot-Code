package org.sudhcha.cincyclean.refactor1;

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

}
