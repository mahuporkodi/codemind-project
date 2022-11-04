package com.project.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing course\\Software for Automation\\Selenium chrome driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

		driver.navigate().refresh();
		WebElement dropdownLocator = driver.findElement(By.xpath("//select[@name='country']"));
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", dropdownLocator);

		Select select = new Select(dropdownLocator);

		List<WebElement> dropdownOptions = select.getOptions();
		System.out.println(dropdownOptions.size());

		for (WebElement elm : dropdownOptions) {
			System.out.println(elm.getAttribute("innerHTML"));
		}
		System.out.println(select.isMultiple());

		select.selectByIndex(13);
		Thread.sleep(1000);

		select.selectByValue("SINGAPORE");
		Thread.sleep(1000);

		select.selectByVisibleText("INDIA");
		Thread.sleep(1000);

		// select.deselectByVisibleText("INDIA");
		// Thread.sleep(2000);

		System.out.println(select.getFirstSelectedOption());

	}

}
