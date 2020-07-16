package com.mavenpractice.selenium;
import org.testng.annotations.Test;

import com.mavenpractice.selenium.HomePage;
public class Test1 {
	
	HomePage hp = new HomePage();
	
	@Test
	public void runTest1() {
		hp.launchBrowser();
	}

}
