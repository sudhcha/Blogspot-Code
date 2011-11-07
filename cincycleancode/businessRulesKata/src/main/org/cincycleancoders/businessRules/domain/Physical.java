package org.cincycleancoders.businessRules.domain;

public class Physical implements Product{

	@Override
	public String execute(ProductType productType) {
		return this.generatePackagingSlip(productType);
		
	}

	protected String generatePackagingSlip(ProductType productType) {
		return "generate a packing slip for shipping "+productType.name();
		
	}
	

}
