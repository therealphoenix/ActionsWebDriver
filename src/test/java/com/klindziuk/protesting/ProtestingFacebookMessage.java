package com.klindziuk.protesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.klindziuk.protesting.page.FacebookPage;
import com.klindziuk.protesting.page.СontactPage;
import com.klindziuk.protesting.util.BrowserDriver;
import com.klindziuk.protesting.util.SingletonDriver;

public class ProtestingFacebookMessage {
	WebDriver driver;
	СontactPage contactPage;
	FacebookPage facebookPage;
	String login = "fennya@gmail.com";
	String password = "nexusp29";
	String message = "ПроТестинг! Мы решаем вопросы тестирования и обеспечения качества программного обеспечения.";

	@BeforeClass
	public void beforeSuite() {
		driver = SingletonDriver.getInstance().getDriver();
		contactPage = new СontactPage(driver);
		driver.get(BrowserDriver.BASEURL + "contact/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void FacebookMessage() {
		facebookPage = contactPage.openQuestionPage(driver)
				.openFacebookPage(driver);
		facebookPage.cancelClick()
			.loginAs(login, password);
			Assert.assertTrue(facebookPage.findMessage(message));
	}
	 @AfterSuite
	  public void afterSuite() {
		  driver.close();
		  driver.quit();
		  SingletonDriver.destroy();
	  }

	}
