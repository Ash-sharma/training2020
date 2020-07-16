import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleIntro2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
				
				// create web driver object
				WebDriver driver = new ChromeDriver();
				
				String url = "https://demo.guru99.com/popup.php";
//				String url = "https://www.testandquiz.com/selenium/testing.html";
				
				
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				String parentWindow = driver.getWindowHandle();
				System.out.println(parentWindow);
				
				driver.findElement(By.linkText("Click Here")).click();
				Set<String> allWindows = driver.getWindowHandles();
				System.out.println(allWindows);
				
				// conerted set into the arraylist
				ArrayList <String> a1 = new ArrayList(allWindows);
				
				driver.switchTo().window(a1.get(0));
				WebElement c = driver.findElement(By.className("barone"));
				System.out.println(c.getText());
				
				driver.switchTo().window(a1.get(2));
				WebElement gmail = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div/div[1]/a"));
				System.out.println(gmail.getText());
				
				driver.switchTo().window(a1.get(1));
				WebElement b = driver.findElement(By.xpath("//input[@name = 'emailid']"));
				b.sendKeys("ash@g.com");
				
//				for(int i=0; i<a1.size(); i++) {
//					System.out.println(a1.get(i));
//				}
				
				Thread.sleep(2000);
				driver.quit();
	}
}
