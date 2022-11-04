package com.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisableVerification {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing course\\Software for Automation\\Selenium chrome driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.automationtesting.co.uk/buttons.html");
		driver.manage().window().maximize();

		// is Displayed

		System.out.println(driver.findElement(By.xpath("//button[@id='btn_one']")).isDisplayed());

		// is Enabled

		System.out.println(driver.findElement(By.xpath("//button[@id='btn_three']")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//button[@id='btn_four']")).isEnabled());

		// get Accessible Name

		System.out.println(driver.findElement(By.xpath("//button[@id='btn_two']")).getAccessibleName());
		
		// get getAttribute Name

		System.out.println(driver.findElement(By.xpath("//button[@id='btn_two']")).getAttribute("type"));
		
		// get css attribute

		System.out.println(driver.findElement(By.xpath("//button[@id='btn_one']")).getCssValue("color"));
		Thread.sleep(2000);
		driver.close();

	}

}
