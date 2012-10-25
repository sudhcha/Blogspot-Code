package org.sudhcha.cincycleancode;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InvalidTriangleClassifierTest {

	TriangleClassifier classifier;
	
	@Before
	public void createNewClassifier(){
		classifier = new TriangleClassifier();
	}
	
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	@Test
	public void testInvalidSidesThrowException() {
		expectedEx.expect(IllegalArgumentException.class);
	    expectedEx.expectMessage("The given lengths of the sides cannot correspond to a real triangle");
		classifier.classify(1, 2, 4);
	}

}
