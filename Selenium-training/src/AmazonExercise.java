import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmazonExercise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
				
				// create web driver object
				WebDriver driver = new ChromeDriver();
				
//				String url = "https://demo.guru99.com/popup.php";
//				String url = "https://www.testandquiz.com/selenium/testing.html";
				String url = "https://www.amazon.com/";
				driver.get(url);
				
				WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
				WebElement search =driver.findElement(By.className("nav-input"));
				
				searchbar.sendKeys("fan");
				search.click();
				
				WebElement sf = driver.findElement(By.id("a-autoid-0-announce"));
//				WebElement lowToHighfilter = driver.findElement(By.xpath("//*[@class = 'a-popover-inner']//ul//li[2]"));
				sf.click();
				
				List<WebElement> filter = driver.findElements(By.xpath("//*[@class='a-popover-inner']//ul//li//a"));
				System.out.println(filter);
				
//				lowToHighfilter.click();
				
				for(WebElement x: filter) {
					String s = x.getText();
//					System.out.println(s);
					if(s.equalsIgnoreCase("Price: Low to High")) {
						x.click();
						break;
					}
				}
				
				Thread.sleep(3000);	
				
		
				
				driver.quit();
	}
}
