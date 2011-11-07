package org.cincycleancoders.businessRules.domain;

public class Membership implements Product {
	
	public enum MembershipType{ACTIVATE, UPGRADE};
	
	private final MembershipType memberShipType;

	public Membership(MembershipType memberShipType) {
		super();
		this.memberShipType = memberShipType;
	}

	@Override
	public String execute(ProductType productType) {
		return memberShipType.name()+" Membership";
	}

}
