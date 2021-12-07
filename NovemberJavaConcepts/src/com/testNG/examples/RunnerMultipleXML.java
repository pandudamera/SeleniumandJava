package com.testNG.examples;

import java.util.ArrayList;

import org.testng.TestNG;

public class RunnerMultipleXML {

	public static void main(String[] args) {
		
		ArrayList<String> xmlfiles=new ArrayList<String>();
		xmlfiles.add("./dataprovidertestng.xml");
		xmlfiles.add("./grouptestng.xml");
		
		TestNG testNG=new TestNG();
		testNG.setTestSuites(xmlfiles);
		testNG.run();

	}

}
