import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowshandleIntro {
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
				
				for(String s : allWindows) {
					if(!parentWindow.equalsIgnoreCase(s)) {
						driver.switchTo().window(s);
						WebElement b = driver.findElement(By.xpath("//input[@name = 'emailid']"));
						b.sendKeys("ash@g.com");
						Thread.sleep(3000);
						driver.close();
					}
				}
				driver.switchTo().window(parentWindow);
				WebElement c = driver.findElement(By.className("barone"));
				System.out.println(c.getText());
				
//				WebElement b = driver.findElement(By.xpath("//input[@name = 'emailid']"));
//				b.sendKeys("ash@g.com");
				
				
				Thread.sleep(2000);
				driver.quit();
	}
	/*get windows handle  - returns you the unique id of that particular window/tab - only 1 id
	 * getwindoshandles  - will return all the unique id of all the open tabs/windos - return set of id's  
	 * */
}
