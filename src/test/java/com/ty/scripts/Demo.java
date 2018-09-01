package com.ty.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.pom.CraftsvillaHomePage;
import com.ty.generic.BaseTest;

public class Demo extends BaseTest{

	@Test
	public void getTitle() throws InterruptedException
	{
		CraftsvillaHomePage hp = new CraftsvillaHomePage(driver);
		hp.clickOnSarees();
		Thread.sleep(1000);
		Reporter.log("The title of the page is: " + driver.getTitle(), true);
	}
}
