package org.sudhcha.cincyclean.old;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {

	private static final String JERRY_STATEMENT = "Rental Record for Jerry Seinfield\n"
			+ "Everybody Hates Raymond\t14.0\n"
			+ "My Dog Skip\t4.5\n"
			+ "Hangover2\t6.0\n"
			+ "Amount owed is 24.5\n"
			+ "You earned 4 frequent renter points";

	@Test
	public void testStatement() {
		Customer customer = new Customer("Jerry Seinfield");
		Movie movie1 = new Movie("Everybody Hates Raymond", Movie.REGULAR);
		Movie movie2 = new Movie("My Dog Skip", Movie.CHILDRENS);
		Movie movie3 = new Movie("Hangover2", Movie.NEW_RELEASE);

		customer.addRental(new Rental(movie1, 10));
		customer.addRental(new Rental(movie2, 5));
		customer.addRental(new Rental(movie3, 2));
		
		assertEquals(customer.statement(), JERRY_STATEMENT);

		
	}

}
