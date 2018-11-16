package com.julyanajs.testing;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertionClass {

	private Assertion hardAssert = new Assertion();
	private SoftAssert sofAssert = new SoftAssert();

	/*	@Test
	public void testHardAssert() {
		System.out.print("Hi I'am  first Statement in Hard Assert");

		hardAssert.assertEquals(3, 3);
		System.out.println("First Hard Assert is passed");

		hardAssert.assertEquals(2,2);
		System.out.println("Second Hard Assert Fails");
	}*/

	/*	@Test
	public void testSoftAssert() {
		System.out.print("Hi I'am  first Statement in Soft Assert");

		sofAssert.assertEquals(3, 3);
		System.out.println("First Soft Assert is passed");

		sofAssert.assertEquals(1,2);
		System.out.println("Second Soft Assert Fails");



	}*/

	@Test
	public void testSoftAssertVerifyAll() {
		System.out.print("Hi I'am  first Statement in Soft Assert");

		sofAssert.assertEquals(3, 3);
		System.out.println("First Soft Assert is passed");

		sofAssert.assertEquals(2,2);
		System.out.println("Second Soft Assert Fails");

		sofAssert.assertAll();



	}
}