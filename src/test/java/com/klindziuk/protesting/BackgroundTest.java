package com.klindziuk.protesting;
import org.testng.annotations.Test;

import com.klindziuk.protesting.page.Automation;
import com.klindziuk.protesting.util.BrowserDriver;
import com.klindziuk.protesting.util.Mail;
import com.klindziuk.protesting.util.SingletonDriver;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;


public class BackgroundTest {
	WebDriver driver;
	Automation automation;
	Mail mail;
	String beforeClickModel = "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box";
	String beforeClickModel1 = "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box";
	String afterClickModel = "rgb(240, 240, 240) url(\"http://www.protesting.ru/img/menuhover.jpg\") repeat-x scroll 0% 0% / auto padding-box border-box";
	
    @BeforeClass
  public void beforeSuite() {
    	mail = new Mail();
    	mail.sendMail();
    	driver = SingletonDriver.getInstance().getDriver();
    	automation = new Automation(driver);
    	driver.get(BrowserDriver.BASEURL +"automation/");
  	  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
	  driver.quit();
	//  SingletonDriver.destroy();
  }
  
  
  @Test
  public void backgroundImageTest() {
	Assert.assertEquals(automation.getMainMenu().getQAElementBackground(), beforeClickModel);  
	Assert.assertEquals(automation.getMainMenu().moveToQAandClick(), afterClickModel);
	  }
 }
