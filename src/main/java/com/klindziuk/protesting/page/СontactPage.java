package com.klindziuk.protesting.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class СontactPage extends BasePage {
	WebDriver driver;
	By teamLocator = By.cssSelector("#leftside > p > a:nth-child(1)");
	By linksLocator = By.cssSelector("#leftside > p > a:nth-child(2)");
	By questionLocator = By.cssSelector("#leftside > p > a:nth-child(3)");

	public СontactPage(WebDriver driver){
		super(driver);
	}
	
	public QuestionPage openQuestionPage(WebDriver driver) {
		waitFor(questionLocator);
		driver.findElement(questionLocator).click();
		return new QuestionPage(driver);
	}
}
