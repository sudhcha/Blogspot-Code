package org.sudhcha.cincyclean.old;

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
			double thisAmount = 0;

			// determine amounts for each line
			switch (each.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (each.getDaysRented() > 2)
					thisAmount += (each.getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				thisAmount += each.getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (each.getDaysRented() > 3)
					thisAmount += (each.getDaysRented() - 3) * 1.5;
				break;

			}

			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
					&& each.getDaysRented() > 1)
				frequentRenterPoints++;

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

}
