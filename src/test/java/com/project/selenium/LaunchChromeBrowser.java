package com.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing course\\Software for Automation\\Selenium chrome driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();

		// By using id

		WebElement elm = driver.findElement(By.id("site-name"));
		System.out.println(elm.getText());

		// By using name

		driver.findElement(By.name("userName")).sendKeys("user1");

		// By using xpath

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password1");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//By using link text

		driver.findElement(By.linkText("REGISTER")).click();

		// By using partial link text

		// driver.findElement(By.partialLinkText("REGI")).click();

		// By using class name

		/*
		 * String str = driver.findElement(By.className("row topper")).getText();
		 * System.out.println();
		 */

		// By using css selector

		driver.findElement(By.cssSelector("a[href='register.php']")).click();

		// By using tag name

		driver.findElement(By.tagName("a"));

		Thread.sleep(10000);
		driver.close();

	}

}
