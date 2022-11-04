package com.project.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotationAll {
	
	@BeforeSuite
	public void test() 
	{
		System.out.println("BeforeSuit");
	}
	
	@BeforeTest
	public void beforeTestPlan() 
	{
		System.out.println("BeforeTestPlan");
	}
	
	@BeforeClass
	public void beforeClass() 
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void launchBrowser()
	{
		System.out.println("TestCase1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("SecondTestCase2");
	}
	
	@Test
	public void testCase3()
	{
		System.out.println("ThirdTestCase3");
	}
	
	
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("AfterMethod");
	}	
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("AfterClass");
	}	
	
	@AfterTest
	public void afterTestPlan() 
	{
		System.out.println("AfterTestPlan");
	}	
	
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("AfterSuit");
	}
	

}
