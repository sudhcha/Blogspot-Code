package org.cincycleancoders.businessRules.domain;

import org.cincycleancoders.businessRules.domain.Membership.MembershipType;

public enum ProductType {

	PHYSICAL(new Physical()),
	BOOK(new Books()),
	NEW_MEMBERSHIP(new Membership(MembershipType.ACTIVATE)),
	MEMBERSHIP_UPGRADE(new Membership(MembershipType.UPGRADE));

	private final Product productOutput;


	public Product getProductOutput() {
		return productOutput;
	}

	private ProductType(Product productOutput) {
		this.productOutput = productOutput;
	}

}
