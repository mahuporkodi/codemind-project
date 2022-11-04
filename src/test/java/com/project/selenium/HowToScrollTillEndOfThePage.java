package com.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToScrollTillEndOfThePage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Testing course\\\\Software for Automation\\\\Selenium chrome driver\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com./");

		driver.manage().window().maximize();

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		// scroll vertically

		javascriptExecutor.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);

		javascriptExecutor.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(2000);

		// how to scroll till web element or scroll into view

		/*
		 * WebElement element =
		 * driver.findElement(By.xpath("(//a[text()='See all offers'])[18]"));
		 * javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);",
		 * element); Thread.sleep(2000);
		 */

		// scroll till end of the page

		javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

}
