package com.testNG.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssetionExamples {

	@Test
	public void one() {
		System.out.println("Hi, I am Test One");
		Assert.assertEquals("FaceBook", "FaceBook");

	}

	@Test
	public void two() {
		
		Assert.assertEquals(404, 200);// Hard Assertion : If test cases gets fail(halt) that test test case skipped execution remaining  test cases will run 
		System.out.println("Hi, I am Test Two");

	}

	@Test
	public void three() {
		System.out.println("Hi, I am Test Three");
		Assert.assertTrue(true);

	}

	@Test
	public void four() {
		System.out.println("Hi, I am Test Four");
		Assert.assertTrue(false, "Making Test Failure");

	}

	@Test
	public void five() {
		System.out.println("Hi, I am Test Five");
	}

	@Test
	public void six() {
		System.out.println("Hi, I am Test Six");
	}

}
