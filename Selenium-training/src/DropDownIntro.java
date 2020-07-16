import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownIntro {
		public static void main(String[] args) throws InterruptedException {
			// to set the path for the browser
			System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
			
			// create web driver object
			WebDriver driver = new ChromeDriver();
			
//			String url = "https://www.amazon.com/";
			String url = "https://www.testandquiz.com/selenium/testing.html";
			
			driver.get(url);
			
			WebElement dd = driver.findElement(By.id("testingDropdown"));
			// cast the webelement into the select datatype
			Select dropdown = new Select(dd);
			Thread.sleep(3000);
			
			//1 .  slecting by index
			dropdown.selectByIndex(2);
			
			Thread.sleep(3000);
			//2 .  selecting by value
			dropdown.selectByValue("Performance");
			
			Thread.sleep(3000);
			
			//3.	selecting by visibltText
			dropdown.selectByVisibleText("Database Testing");
			
			
			Thread.sleep(3000);
			
			
			driver.quit();	
	}

}
