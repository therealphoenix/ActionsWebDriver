package com.klindziuk.protesting.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header {
	WebDriver driver;
	WebDriverWait wait;
	WebElement element;
	Actions actions;
	public static By mainSignLocator = By.cssSelector(
			"#sitename > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)");
	public static By mainLocator = By.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)");
	public static By qualityAssuranceLocator = By
			.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)");
	public static By testingLocator = By.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)");
	public static By automationLocator = By
			.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)");
	public static By serviceLocator = By.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)");
	public static By contactLocator = By.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)");
	public static By newsLocator = By.cssSelector("#mainmenu > ul:nth-child(1) > li:nth-child(7) > a:nth-child(1)");
	public static By blogspotLocator = By.cssSelector("#followme > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)");
	public static By rssLocator = By.cssSelector("#followme > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)");
	public static By twitterLocator = By.cssSelector("#followme > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)");
	public static By googleSearchBoxLocator = By.cssSelector(".searchbox");
	public static By googleFindButtonLocator = By.cssSelector(".searchbutton");
	public static By googlePlusLocator = By.cssSelector(".uzlpSb");
	public static By facebookLikeLocator = By.cssSelector(
			"div.pluginButton:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)");

	public Header(WebDriver driver) {
		this.driver = driver;
	}
		//get default background 
	public String getQAElementBackground() {
		return driver.findElement(Header.qualityAssuranceLocator).getCssValue("background");
	}

	public String moveToQAandClick() {
		System.setProperty("webdriver.chrome.driver", "D:/Java/Chrome/chromedriver.exe");
		driver.manage().window().maximize();
		// waiting for page load
		wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Header.qualityAssuranceLocator));
		// find element
		element = driver.findElement(Header.qualityAssuranceLocator);
		// performing action
		actions = new Actions(driver);
		actions.moveToElement(element).click(element).perform();
		return driver.findElement(Header.qualityAssuranceLocator).getCssValue("background");
	}
}
