package com.klindziuk.protesting.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
	WebDriver driver;
	public static By mainSignLocator = By.cssSelector(
			"#sitename > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > a:nth-child(1)");

	public Header(WebDriver driver) {
		this.driver = driver;
	}

	public void openMainPage()
	{/* Main page will be implemented ASAP */ }

	public String getMainSingLinkText() {
		return driver.findElement(mainSignLocator).getText();
	}
}
