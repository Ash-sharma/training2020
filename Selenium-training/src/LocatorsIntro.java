import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {

	public static void main(String[] args) throws InterruptedException {
		// to set the path for the browser
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
		
		// create web driver object
		WebDriver driver = new ChromeDriver();
		
//		String url = "https://www.amazon.com/";
		String url = "https://www.testandquiz.com/selenium/testing.html";
		
		// open a facebook page 
		driver.get(url);
		// by id
//		WebElement s =  driver.findElement(By.id("SignIn-submitButton"));
		
		Thread.sleep(3000);
		
		// by class name
//		WebElement s = driver.findElement(By.className("nav-cart-icon"));
//		s.click();
		
//		by name
//		WebElement s = driver.findElement(By.name("firstName"));
//		s.sendKeys("ash");
		
		//by tagname
		WebElement s = driver.findElement(By.tagName("input"));
		s.sendKeys("ash");
		
		// by link text
		WebElement linkelement = driver.findElement(By.partialLinkText("This is"));
		linkelement.click();
		
		//chaining
//		driver.findElement(By.partialLinkText("This is")).getText().contains("this");

	
		
		
		
		Thread.sleep(3000);
		
		
		
		System.out.println(s.getText());
		
		
		
		driver.quit();
	}
	
	/*VVIP
	 * 8 different ways to locate the web elements
	 * driver.findElement(By.)
	 * Locating by id  - #idname  // best way to locate 
	 * Loaction by ClassName -  .classname - okay
	 * locate by name  - 
	 * Tag Name - 
	 * by link
	 * partail link text -  recommended
	 * css   - recommended
	 * xpath - last choice (VI)
	 * */
}
