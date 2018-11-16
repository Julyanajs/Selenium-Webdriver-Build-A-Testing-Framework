package com.julyanajs.testing;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {

	@Test
	public void firstTest() {
		System.out.print("This is my first test");


	}
	@Test 
	public void secondtTest() {

		if(false) {
			System.out.print("This is my second test");
		} else {
			throw new SkipException("Login failed");
		}
	}

	@Test (enabled = false)
	public void thirdTest() {
		System.out.print("This is my third test");
	}
}