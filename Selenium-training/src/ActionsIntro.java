import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsIntro {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
				
				// create web driver object
				WebDriver driver = new ChromeDriver();
				
//				String url = "https://demo.guru99.com/popup.php";
				String url = "https://www.testandquiz.com/selenium/testing.html";
				
				
				driver.get(url);
				WebElement gbox = driver.findElement(By.id("dblClkBtn"));
				WebElement g1 = driver.findElement(By.xpath("/html/body/div/div[11]/div/p/button"));
				WebElement image = driver.findElement(By.id("sourceImage"));
				WebElement dropbox = driver.findElement(By.id("targetDiv"));
				WebElement input = driver.findElement(By.id("fname"));
				WebElement submitbtn = driver.findElement(By.id("idOfButton"));
				// define action object
				Actions a1 = new Actions(driver);
				Thread.sleep(2000);
				
				a1.doubleClick(gbox).perform();
				
				driver.switchTo().alert().accept();
				
				a1.contextClick(g1).perform();
				
				Thread.sleep(2000);
				//perform squencital action
				a1.click(input).sendKeys("abcj").build().perform();
				Thread.sleep(4000);
				
				// mouse over action
				a1.moveToElement(submitbtn).perform();
				Thread.sleep(3000);
				
				// to perform darg drop
				a1.dragAndDrop(image, dropbox).perform();
				
				Thread.sleep(2000);
				driver.quit();
	}
}
/*Action class/interface
 * */
