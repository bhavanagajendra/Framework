package com.ty.generic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static ChromeDriver driver;
	public static WebDriverWait wait;
	
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver" , "E:/Bhavana/workspace/Automation/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.craftsvilla.com/");
		wait = new WebDriverWait(driver, 30);
		Reporter.log("Home page of craftsvilla", true);
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		//Thread.sleep(1000);
		driver.close();
	}
}
