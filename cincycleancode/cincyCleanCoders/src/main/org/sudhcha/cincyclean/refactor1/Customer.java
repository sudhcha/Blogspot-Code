package org.sudhcha.cincyclean.refactor1;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;

	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public void addRental(Rental arg) {
		rentals.add(arg);
	}

	public String getName() {
		return name;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		StringBuilder result = new StringBuilder();
		result.append("Rental Record for ").append(getName()).append("\n");
		for (Rental each : rentals) {
			double thisAmount = amountFor(each);
			frequentRenterPoints+= getFrequentRenterPoints(each);

			// show figures for this rental
			result.append(each.getMovie().getTitle()).append("\t").append(
					String.valueOf(thisAmount)).append("\n");
			totalAmount += thisAmount;

		}
		// add footer lines
		result.append("Amount owed is ").append(totalAmount).append("\n");
		result.append("You earned ").append(frequentRenterPoints).append(
				" frequent renter points");
		return result.toString();

	}

	private int getFrequentRenterPoints(Rental aRental) {
		if ((aRental.getMovie().getPriceCode() == Movie.NEW_RELEASE)
				&& aRental.getDaysRented() > 1)
			return 2;
		return 1;
	}

	private double amountFor(Rental aRental) {
		double thisAmount = 0;

		// determine amounts for each line
		switch (aRental.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			thisAmount += 2;
			if (aRental.getDaysRented() > 2)
				thisAmount += (aRental.getDaysRented() - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			thisAmount += aRental.getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			thisAmount += 1.5;
			if (aRental.getDaysRented() > 3)
				thisAmount += (aRental.getDaysRented() - 3) * 1.5;
			break;

		}
		return thisAmount;
	}

}
