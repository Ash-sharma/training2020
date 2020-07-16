package TestNGIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertIntro {
	WebDriver driver;
	@BeforeClass
	public void setup() {
System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
		
		 driver = new ChromeDriver();
	}
	
	
	@Test
		public void testCase1() throws InterruptedException {
		String url = "https://www.amazon.com/";
		driver.get(url);
		
		SoftAssert sa = new SoftAssert();
	
		WebElement logo = driver.findElement(By.id("glow-ingress-line1"));
		String logoText = logo.getText();
		System.out.println(logoText);
		sa.assertEquals(logoText,"deliver to", "Not able to see deliver text");
//		 Assert.assertEquals(logoText, "deliver to", "Not able to see deliver text");
		 
		 WebElement a = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
			a.sendKeys("fan");
			
		//SoftAssert sa = new SoftAssert();
			sa.assertAll();
			Thread.sleep(3000);
		}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
