package com.klindziuk.protesting.page;

import org.openqa.selenium.WebDriver;

import com.klindziuk.protesting.pageelements.Footer;
import com.klindziuk.protesting.pageelements.Header;
import com.klindziuk.protesting.pageelements.MainMenu;
import com.klindziuk.protesting.pageelements.SearchPanel;

public class BasePage {
   WebDriver driver;
   
public BasePage(WebDriver driver){
	this.driver = driver;
}

public Footer getFooter() {
	return new Footer(driver);
}

public Header getHeader() {
	return new Header(driver);
}

public MainMenu getMainMenu() {
	return new MainMenu(driver);
}
 
public SearchPanel getSeatchPanel() {
	return new SearchPanel(driver);
}
}
