package com.project.selenium;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssert {

	WebDriver driver;

	@Test
	public void veritfyValidLogIn() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing course\\Software for Automation\\Selenium chrome driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		String actualUserName = driver.findElement(By.xpath("//span[text()='Admin']")).getText();

		assertEquals("actualUserName", "Admin");
		driver.findElement(By.xpath("//i[contains(@class,'userdropdown-icon')]")).click();
		driver.findElement(By.xpath("//a[text()='logout']")).click();
		
		assertTrue(loginButton.getText().equals("Login"));
		
		

	}

	@Test
	public void veritfyValidLogOut() {

	}

}
