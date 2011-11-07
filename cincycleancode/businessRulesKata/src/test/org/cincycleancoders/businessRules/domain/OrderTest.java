package org.cincycleancoders.businessRules.domain;

import org.cincycleancoders.businessRules.domain.Membership.MembershipType;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.cincycleancoders.businessRules.domain.ProductType.*;

public class OrderTest {

	@Test
	public void testExecuteOrderForPhysical() {
		Order order = new Order(PHYSICAL);
		assertEquals(order.executeOrder(),
				"generate a packing slip for shipping " + PHYSICAL.name());
	}

	@Test
	public void testExecuteOrderForBook() {
		Order order = new Order(BOOK);
		assertEquals(
				order.executeOrder(),
				"generate a packing slip for shipping "
						+ BOOK.name()
						+ " and create a duplicate packing slip for the royalty department for "
						+ BOOK.name());
	}

	@Test
	public void testExecuteOrderForMembership() {
		Order order = new Order(NEW_MEMBERSHIP);
		assertEquals(order.executeOrder(), MembershipType.ACTIVATE.name()
				+ " Membership");
	}

	@Test
	public void testExecuteOrderForMembershipUpgrade() {
		Order order = new Order(MEMBERSHIP_UPGRADE);
		assertEquals(order.executeOrder(), MembershipType.UPGRADE.name()
				+ " Membership");
	}

}
