import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsIntro {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
		
		// create web driver object
		WebDriver driver = new ChromeDriver();
		
//		String url = "https://www.amazon.com/";
//		String url = "https://www.testandquiz.com/selenium/testing.html";
		String url = "https://mu.ac.in/";
		
		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("HOME")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.linkText("ABOUT US")).click();
		
		
//		// implicit wait - 
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		
//		
		// explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement a = wait.until(ExpectedConditions.elementToBeClickable(By.id("fname")));
//		a.sendKeys("a");
//		
//		WebElement inputfield = driver.findElement(By.id("fname"));
//		wait.until(ExpectedConditions.elementToBeClickable(inputfield));
		
//		
//		
//		//fluent wait
////		Wait wait1 = new FluentWait<WebDriver>(driver)
////				.withTimeout(10, TimeUnit.SECONDS)
////				.pollingEvery(2, TimeUnit.SECONDS)
////				.ignoring(NoSuchElementException.class);
////		
////		WebElement b = wait1.until(new Function<WebDriver, WebElement>(){
////			public WebElement m1(WebDriver driver) {
////				return driver.findElement(By.id("fname"));
////			}
////		});
////		
//		
//		// to inout values 
//		inputfield.sendKeys("ash");
		Thread.sleep(2000);
			
	
	driver.quit();
	
	}	
}
/* thread.sleep -  wait for the java   - not recommended
 * selenium waits -
 *1. implicit wait  - is almost similar to thread.sleep ()
 * 2. explicit wait  - is the mostly used recommended
 * 3. fluent wait  -  good know , bit intricate and not widly used
 */

/*Implcit wait 										Explicit wait
 * deafult time between each step or script			halt the execution untul particular condition is met
 * subsequent script will only be executed
 * after waiting for the deafult time				script will execute as soon as your condition is me
 * you can call directly through function			 you have to invoke object of webdriverwait to access it
 * */