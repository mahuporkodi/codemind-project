package com.project.selenium;

import org.testng.annotations.Test;

public class GroupTestcaseInTestNg {

	@Test(groups = { "sanity" })
	public void test1() {
		System.out.println("This is Sanity Check Test Case");
	}

	@Test(groups = { "sanity" })
	public void test2() {
		System.out.println("This is Sanity Check Test Case");
	}

	@Test(groups = { "smoke" })
	public void test3() {
		System.out.println("This is Smoke Check Test Case");
	}

	@Test(groups = { "smoke" })
	public void test4() {
		System.out.println("This is Smoke Check Test Case");
	}

	@Test(groups = { "E2E"})
	public void test5() {
		System.out.println("This is E2E Check Test Case");
	}
	
	@Test(groups = { "E2E","smoke"})
	public void test6() {
		System.out.println("This is E2E Check Test Case");
	}
	

}
