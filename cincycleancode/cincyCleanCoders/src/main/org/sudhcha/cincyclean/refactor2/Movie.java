package org.sudhcha.cincyclean.refactor2;

public class Movie {
	
	public enum PriceCode {CHILDRENS, REGULAR, NEW_RELEASE};


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

}
