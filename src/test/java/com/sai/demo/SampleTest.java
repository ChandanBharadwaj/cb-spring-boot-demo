package com.sai.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {

	@Test
	public void testConcatenate() {
		Sample myUnit = new Sample();

		String result = myUnit.concatenate("one", "two");

		assertEquals("onetwo", result);

	}
}