package org.cincycleancoders.businessRules.domain;

public class Books extends Physical {

	@Override
	protected String generatePackagingSlip(ProductType productType) {
		return super.generatePackagingSlip(productType)
				+ " and create a duplicate packing slip for the royalty department for "
				+ productType.name();
	}

}
