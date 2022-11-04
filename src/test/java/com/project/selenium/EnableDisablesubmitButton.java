package com.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisablesubmitButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing course\\Software for Automation\\Selenium chrome driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("userName");
		driver.findElement(By.xpath("//input[@name='submit']")).submit();

		Dimension d = driver.findElement(By.xpath("//a[text()='Flights']")).getSize();
		d.getHeight();
		d.getWidth();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());

		System.out.println(driver.findElement(By.xpath("//a[text()='Flights']")).getLocation().getX());
		System.out.println(driver.findElement(By.xpath("//a[text()='Flights']")).getLocation().getY());

		// driver.findElement(By.xpath("//a[text()='Flights']")).click();
		// System.out.println(driver.findElement(By.xpath("//input[@value='roundtrip']")).isSelected());
		// System.out.println(driver.findElement(By.xpath("//input[@value='oneway']")).isSelected());

	}

}
