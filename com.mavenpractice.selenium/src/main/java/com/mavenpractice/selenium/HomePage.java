package com.mavenpractice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.com/";
		driver.get(url);
		
		driver.quit();
	}
}
