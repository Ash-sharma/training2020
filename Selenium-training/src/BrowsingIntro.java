import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsingIntro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
	
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com/";
		
		// navigate to url  - similar to the get command
		driver.navigate().to(url);
//		Thread.sleep(5000);
		driver.navigate().back();
//		Thread.sleep(5000);
		driver.navigate().forward();
//		Thread.sleep(5000);
		driver.navigate().refresh();
//		Thread.sleep(5000);
		
		
		
	
	
		driver.quit();
	}
	
}
