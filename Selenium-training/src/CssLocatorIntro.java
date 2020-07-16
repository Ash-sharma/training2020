import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorIntro {

	public static void main(String[] args) throws InterruptedException {
		// to set the path for the browser
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
		
		// create web driver object
		WebDriver driver = new ChromeDriver();
		
//		String url = "https://www.amazon.com/";
		String url = "https://www.testandquiz.com/selenium/testing.html";
		
		driver.get(url);
		
		WebElement a = driver.findElement(By.cssSelector("input#fname"));
		a.sendKeys("ash");
		Thread.sleep(2000);
		
		WebElement b = driver.findElement(By.cssSelector("input[type='text']"));
		b.clear();  // to clear any written text in the input field 
		b.sendKeys("ash1"); // used to input any vlaue to the text field
		
		WebElement c = driver.findElement(By.cssSelector("input[type^='te']"));
		c.clear();
		c.sendKeys("ash2");
		
		WebElement d = driver.findElement(By.cssSelector("input[type$='xt']"));
		d.clear();
		d.sendKeys("ash3");
		
		WebElement e = driver.findElement(By.cssSelector("input[type*='ex']"));
		e.clear();
		e.sendKeys("ash2");
				
		
//		driver.findElement(By.cssSelector("span.nav-cart-icon")).click();
		
		Thread.sleep(2000);
		
		
		
	driver.quit();	
	}		
}
/*Css selector - recomended
 * 1. locating by id - tag#id  // go to know
 * 2. locating by class - tag.class
 * 3. locating tag& attribute  - tag[attribute=value]
 * 4. sub string matches  - good know and they can be handy
 * 			a. starts with - ^
 * 			b. ends with - $
 * 			c. Contains  - *
 * */
