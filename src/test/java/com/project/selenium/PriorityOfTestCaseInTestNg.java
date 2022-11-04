package com.project.selenium;

import java.rmi.server.SkeletonNotFoundException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityOfTestCaseInTestNg {

	@Test(priority = 2)
	public void testA() {
		System.out.println("A");
	}

	@Test(priority = 1)
	public void testB() {
		System.out.println("B");
	}

	@Test
	public void testZ() {

		String str = "Loggedin successfully";

		if (str.endsWith("Loggedin successfully")) {
			throw new SkipException("Excution Skipped");
		}
		// System.out.println("Z");
	}

	@Test(priority = -9)
	public void test1() {
		System.out.println("1");
	}

	// @Test(enabled = true)
	// public void testC() {
	// System.out.println("C");
	// }

	@Test(enabled = false)
	public void testC() {
		System.out.println("C");
	}

}
