package com.klindziuk.protesting.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public enum BrowserDriver {
	
    CHROME(1);

    public static final String BASEURL = "http://www.protesting.ru/automation/";
    private int index;
    BrowserDriver(int browserIndex) {
        this.index = browserIndex;
    }

    public  WebDriver selectDriver() {
        switch (index) {
            case 1: {
                System.setProperty("webdriver.chrome.driver", "D:/Java/Chrome/chromedriver.exe");
                return new ChromeDriver();
            }
            default: {
                System.setProperty("webdriver.chrome.driver", "D:/Java/Chrome/chromedriver.exe");
                return new ChromeDriver();
            }
        }
    }

    public void killDriver() {
        try {
            switch (index) {
                case 1: {
                    Runtime.getRuntime().exec("taskkill /f /IM chromedriver.exe");
                }
            }
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }
}