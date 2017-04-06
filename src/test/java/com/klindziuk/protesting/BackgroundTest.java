package com.klindziuk.protesting;
import org.testng.annotations.Test;

import com.klindziuk.protesting.page.Automation;
import com.klindziuk.protesting.pageelements.Footer;
import com.klindziuk.protesting.pageelements.Header;
import com.klindziuk.protesting.pageelements.MainMenu;
import com.klindziuk.protesting.pageelements.PageElements;
import com.klindziuk.protesting.util.BrowserDriver;
import com.klindziuk.protesting.util.SingletonDriver;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BackgroundTest {
	WebDriver driver;
	Footer footer;
	Header header;
	MainMenu mainMenu;
	Automation automation;
	String beforeClickModel = "rgba(0, 0, 0, 0) none repeat scroll 0% 0% / auto padding-box border-box";
	String afterClickModel = "rgb(240, 240, 240) url(\"http://www.protesting.ru/img/menuhover.jpg\") repeat-x scroll 0% 0% / auto padding-box border-box";
	
    @BeforeSuite
  public void beforeSuite() {
    	driver = SingletonDriver.getInstance().getDriver();
    	automation = new Automation(driver);
  	  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
	  driver.quit();
	  SingletonDriver.destroy();
  }
  
  @BeforeClass
  public void beforeClass() {
	  driver.get(BrowserDriver.BASEURL); 
  }

  @Test
  public void backgroundImageTest() {
	Assert.assertEquals(PageElements.MAINMENU.getQAElementBackground(), beforeClickModel);  
	Assert.assertEquals(PageElements.MAINMENU.moveToQAandClick(), afterClickModel);
	  }
 }
