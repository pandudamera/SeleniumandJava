package com.testNG.dataProvider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest {
	@Test(priority = 1)
	public void testLogin() {
		System.out.println("Browser Opened");

		// Hard Assert
		Assert.assertEquals(true, false);

		// This line won't be printed
		System.out.println("Login Page displayed");
		System.out.println("Title Verified");

	}

	@Test(priority = 2)
	public void register() {
		System.out.println("click on register");

		// We can also print messages. Messages are only printed when assert fails
		Assert.assertTrue(false, "This is also hard assert");

		// This line won't be executed
		System.out.println("Register page opened");

	}

}
