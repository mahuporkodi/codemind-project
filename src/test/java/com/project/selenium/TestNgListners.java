package com.project.selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNgListners implements ITestListener {

	public void onTestStart(ITestResult result) {

		Reporter.log("Test Case Started " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {

		Reporter.log("Test Case Passed " + result.getName());

	}

	public void onTestFailure(ITestResult result) {

		Reporter.log("Test Case Failed " + result.getName());

	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithInSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
