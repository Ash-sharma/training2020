import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsIntro {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
		
		// create web driver object
		WebDriver driver = new ChromeDriver();
		
//		String url = "https://www.amazon.com/";
		String url = "https://www.testandquiz.com/selenium/testing.html";
		
		
		driver.get(url);
		
		WebElement a = driver.findElement(By.xpath("/html/body/div/div[11]/div/p/button"));
		a.click();
		
		Thread.sleep(2000);
		
//		driver.switchTo().alert().accept();
		
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.xpath("/html/body/div/div[12]/div/p[1]/button"));
		b.click();
		Thread.sleep(2000);
		System.out.println(a1.getText());
		a1.dismiss();
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
/*4 methods to work with alerts 
 * 1. accept()
 * 2. dismiss()
 * 3. getText()
 * 4. sendKeys()
 * */
