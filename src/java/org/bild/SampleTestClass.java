package org.bild;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SampleTestClass {
	@Test
	public void testOne() {
		assertEquals(1,1);
	}

	@Test
	public void testTwo() {
		assertEquals(2,2);
		System.out.println("some stdout");
	}

	@Test
	public void testThree() {
		assertEquals(3,3);
		System.out.println("some stdout");
		System.err.println("some stderr");
	}

	@Test
	public void testFail() {
		assertEquals(3,4);
		System.out.println("some stdout");
		System.err.println("some stderr");
	}
}
