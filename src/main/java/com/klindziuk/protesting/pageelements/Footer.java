package com.klindziuk.protesting.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footer {
	WebDriver driver;
	public static By liveInternetLocator = By
			.cssSelector("#footer > p:nth-child(2) > a:nth-child(2) > img:nth-child(1)");
	public static By feedbackQuestionLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1) > a:nth-child(1)");
	public static By feedbackErrorMessageLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > a:nth-child(1)");
	public static By feedbackPublicationLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(5) > td:nth-child(1) > a:nth-child(1)");
	public static By feedbackLinkExchangeLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(6) > td:nth-child(1) > a:nth-child(1)");
	public static By copyrightLinkLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > a:nth-child(4)");
	public static By ramblertop100Locator = By.cssSelector("#footer > a:nth-child(3)");
	public static By serviceDocumentationLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(1) > a:nth-child(1)");
	public static By serviceTestingLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > a:nth-child(1)");
	public static By serviceConsultingLocator = By.cssSelector(
			"#footer > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(3) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(5) > td:nth-child(1) > a:nth-child(1)");

	public Footer(WebDriver driver) {
		this.driver = driver;
	}
}
