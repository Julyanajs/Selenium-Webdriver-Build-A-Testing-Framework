package com.julyanajs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrder {

	@BeforeClass
	public void firstMethod() {
		System.out.println("In BeforeClass");

	}

	@AfterClass
	public void sixMethod() {
		System.out.println("In afterClass");

	}
	@BeforeMethod
	public void secondMethod() {
		System.out.println("In BeforeMethod");

	}
	@AfterMethod
	public void sevenMethod() {
		System.out.println("In AfterMethod");

	}
	@BeforeSuite
	public void thirdMethod() {
		System.out.println("In BeforeSuite");

	}

	@AfterSuite
	public void eightMethod() {
		System.out.println("In AfterSuite");

	}
	@BeforeTest
	public void forthdMethod() {
		System.out.println("In BeforeTest");

	}
	@AfterTest
	public void nineMethod() {
		System.out.println("In AfterTest");

	}
	@Test
	public void fifhtMethod() {
		System.out.println("In Test");

	}
}