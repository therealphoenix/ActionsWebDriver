package com.klindziuk.protesting.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPanel {
	WebDriver driver;
	public static By googleSearchBoxLocator = By.cssSelector(".searchbox");
	public static By googleSearchButtonLocator = By.cssSelector(".searchbutton");
	public static By googlePlusLocator = By.cssSelector(".uzlpSb");
	public static By facebookLikeLocator = By.cssSelector(
			"div.pluginButton:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)");

	public SearchPanel(WebDriver driver) {
		this.driver = driver;
	}

	public String searchButtonGetText() {
		return driver.findElement(googleSearchButtonLocator).getText();
	}

	public String googlePlusgetText() {
		return driver.findElement(googlePlusLocator).getText();
	}

	public String faceBookLikeGetText() {
		return driver.findElement(facebookLikeLocator).getText();
	}

	public void pushSearchButton() {
		driver.findElement(googleSearchButtonLocator).click();
	}

	public void findTextWithGoogle(String text) {
		WebElement element = driver.findElement(googleSearchBoxLocator);
		element.clear();
		element.sendKeys(text);
		pushSearchButton();
	}

	public void putPlusAtGooglePlus() {
		driver.findElement(googlePlusLocator).click();
	}

	public void putLikeAtFaceBook() {
		driver.findElement(facebookLikeLocator).click();
	}
}
