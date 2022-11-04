package com.project.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownWhichIsNotCommingUnderSelectTag {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing course\\Software for Automation\\Selenium chrome driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.airvistara.com/in/en/vistara-exclusives/vistara-direct?utm_source=google&utm_medium=search&uthttps://www.airvistara.com/in/en/vistara-exclusives/vistara-direct?utm_source=google&utm_medium=search&utm_campaign=brand-exact&utm_content=vd&utm_term=vistara&ef_id=Cj0KCQjw852XBhC6ARIsAJsFPN2W93Y3PKHcOY54bUGp-alVTIfWTTVmwL0V3uz0KDObQPxlFQtp58YaAh-_EALw_wcB:G:s&s_kwcid=AL!596!3!511212724204!e!!g!!vistara&gclid=Cj0KCQjw852XBhC6ARIsAJsFPN2W93Y3PKHcOY54bUGp-alVTIfWTTVmwL0V3uz0KDObQPxlFQtp58YaAh-_EALw_wcB%22);");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//img[contains(@src,'dropdown-arrow-purple.png')]")).click();

		List<WebElement> dropdownOption = driver.findElements(By.xpath("//ul[@id='country-scroll']//li//span"));

		for (WebElement country : dropdownOption) {
			if (country.getText().equals("Qatar")) {
				country.click();
			}
		}

	}

}
