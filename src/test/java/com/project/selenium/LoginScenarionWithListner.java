package com.project.selenium;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListners.class)
public class LoginScenarionWithListner {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowaer() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Testing course\\Software for Automation\\Selenium chrome driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@Test
	public void logInToNewTours() {

		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("user1");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password1");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		WebElement successfullLoginMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		assertEquals(successfullLoginMsg.getText(), "Login Successfully");

	}

	@Test
	public void loginToOrangeLiveHrm() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		String actualUserName = driver.findElement(By.xpath("//span[text()='Admin']")).getText();
		assertEquals("Admin", "Admin");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

	public void getScreenShot() {

		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File file = takescreenshot.getScreenshotAs(OutputType.FILE);
		
	}

}
