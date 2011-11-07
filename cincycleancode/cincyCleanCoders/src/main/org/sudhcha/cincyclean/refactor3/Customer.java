package org.sudhcha.cincyclean.refactor3;

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
			double thisAmount = each.getCharge();
			frequentRenterPoints+= each.getFrequentRenterPoints();

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
