package com.klindziuk.protesting.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Automation {
	WebDriver driver;
	static By basicConceptsLocator = By.cssSelector("");
	static By loadTestingLocator = By.cssSelector("a.nav:nth-child(2)");
	static By automationFuncLocator = By.cssSelector("a.nav:nth-child(3)");
	static By practiceLocator = By.cssSelector("a.nav:nth-child(4)");
	static By toBookMarksLocator = By.cssSelector("#bookmarkLink");
	static By toUpLocator = By.cssSelector(".linktop > a:nth-child(1)");

	public Automation(WebDriver driver) {
		this.driver = driver;
	}
}
