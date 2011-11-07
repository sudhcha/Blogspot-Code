package org.cincycleancoders.businessRules.domain;

public class Order {
	
	private ProductType productType;
	
	public Order(ProductType productType) {
		super();
		this.productType = productType;
	}

	public String executeOrder(){
		return productType.getProductOutput().execute(productType);
	}

}
