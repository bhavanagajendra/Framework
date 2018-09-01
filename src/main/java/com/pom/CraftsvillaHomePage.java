package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.Generic;

public class CraftsvillaHomePage extends Generic{
	
	@FindBy(xpath="//nav[@id='mega-menu']//a[contains(text(),'SAREES')]")
	private WebElement sareesLink;
	
	public CraftsvillaHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//Generic g = new Generic();
		//g.getProperties();
	}
	
	public void clickOnSarees()
	{
		sareesLink.click();
	}

}
