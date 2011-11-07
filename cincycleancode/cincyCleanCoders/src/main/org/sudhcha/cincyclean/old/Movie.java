package org.sudhcha.cincyclean.old;

public class Movie {

	public static final int CHILDRENS = 2;

	public static final int REGULAR = 0;

	public static final int NEW_RELEASE = 1;

	private String title;

	private int priceCode;

	public Movie(String title, int code) {
		super();
		this.title = title;
		priceCode = code;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public String getTitle() {
		return title;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

}
