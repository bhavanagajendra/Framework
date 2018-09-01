package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class SareesPage {

	@FindBy(xpath="//ul[@id='price']//span[contains(text(),'2000-5000')]")
	private WebElement priceRangeChkbx;
	
	@FindBy(xpath="//div[@data-id='6178440']//a[@class='product-image']/img")
	private WebElement selectedSareeImg;
	
	@FindBy(xpath="//span[text()='Add to Cart']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//button[@id=\"place-order-btn\"]")
	private WebElement placeOrderBtn;
	
	public SareesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddToCartAndPlaceOrder(WebDriverWait wait) throws InterruptedException
	{
		//priceRangeChkbx.click();
		//Reporter.log("Clicked on the given price range",true);
		
		//wait.until(ExpectedConditions.elementToBeClickable(selectedSareeImg)).click();
		Thread.sleep(5000);
		selectedSareeImg.click();
		Reporter.log("Selected the saree",true);
		
		Thread.sleep(5000);
		addToCartBtn.click();
		Reporter.log("Clicked on the Add To Cart Button",true);
		Thread.sleep(5000);
		placeOrderBtn.click();
		Reporter.log("Clicked on the Place Order",true);
	}
	
}
