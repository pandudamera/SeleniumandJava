package com.testNG.examples;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void softAssertion()
	{
		SoftAssert softAssertion=new SoftAssert();
		System.out.println("Soft Assetion Method was Started");
		softAssertion.assertTrue(false);
		System.out.println("Soft Assetion Method was Failed");
		softAssertion.assertAll();
	}

	@Test
	public void hardAssertion()
	{
		System.out.println("Hard Assetion Method was Started");
		Assert.assertTrue(false);
		System.out.println("Hard Assetion Method was Failed");
	}

}
