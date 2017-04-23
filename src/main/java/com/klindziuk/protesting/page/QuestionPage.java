package com.klindziuk.protesting.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuestionPage extends BasePage {
	WebDriver driver;
	By faceBookLinkImage = By.cssSelector("#content > div > a > img");

	public QuestionPage(WebDriver driver) {
		super(driver);
	} 
	
	public FacebookPage openFacebookPage(WebDriver driver) {
		waitFor(faceBookLinkImage);
		driver.findElement(faceBookLinkImage).click();
		return new FacebookPage(driver);
	}
	
}
