package org.sudhcha.cincycleancode;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ValidTriangleClassifierTest {

	public ValidTriangleClassifierTest(int argLen1, int argLen2, int argLen3,
			TriangleType argResultType) {
		super();
		this.len1 = argLen1;
		this.len2 = argLen2;
		this.len3 = argLen3;
		this.resultType = argResultType;
	}

	private int len1;

	private int len2;

	private int len3;

	private TriangleType resultType;

	TriangleClassifier classifier;

	@Before
	public void createNewClassifier() {
		classifier = new TriangleClassifier();
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 1, 2, 3, TriangleType.SCALENE },
				{ 2, 2, 3, TriangleType.ISOSCELES },
				{ 2, 2, 2, TriangleType.EQUILATERAL },
				{ 2, 1, 2, TriangleType.ISOSCELES } };
		return Arrays.asList(data);
	}

	@Test
	public void testIsValidTypeFound(){
		assertEquals(resultType, classifier.classify(len1, len2, len3));
	}
}
