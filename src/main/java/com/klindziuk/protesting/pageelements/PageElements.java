package com.klindziuk.protesting.pageelements;

import com.klindziuk.protesting.util.SingletonDriver;

public abstract class PageElements {
	public static final Header HEADER = new Header(SingletonDriver.getInstance().getDriver());
	public static final MainMenu MAINMENU = new MainMenu(SingletonDriver.getInstance().getDriver());
	public static final SearchPanel SEARCHPANEL = new SearchPanel(SingletonDriver.getInstance().getDriver());
	public static final Footer FOOTER = new Footer(SingletonDriver.getInstance().getDriver());
}
