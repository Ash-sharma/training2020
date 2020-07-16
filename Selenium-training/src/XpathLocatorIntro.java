import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorIntro {

	public static void main(String[] args) throws InterruptedException {
		// to set the path for the browser
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
		
		// create web driver object
		WebDriver driver = new ChromeDriver();
		
//		String url = "https://www.amazon.com/";
		String url = "https://www.testandquiz.com/selenium/testing.html";
		
		driver.get(url);
		
		WebElement a = driver.findElement(By.xpath("/html/body/div/div[5]/div/p/input")); // absolute path
		a.sendKeys("input");
		
		WebElement b = driver.findElement(By.xpath("//div/div[5]/div/p/input")); // relative path
		b.clear();
		b.sendKeys("input 1");
		
		WebElement c = driver.findElement(By.xpath("//*[@name='firstName']")); // associating the attribute
		c.clear();
		c.sendKeys("ash");
		
		WebElement d = driver.findElement(By.xpath("//*[@type ='text' and @name = 'firstName']"));
		d.clear();
		d.sendKeys("input 2");
		
		WebElement e = driver.findElement(By.xpath("//b[text()=\"Radio button : \"]"));
		System.out.println(e.getText());
		
		WebElement f = driver.findElement(By.xpath("//b[contains(text(), 'This is ')]"));
		System.out.println(f.getText());
		
		WebElement g = driver.findElement(By.xpath("//input[contains(@name, 'firstName')]"));
		g.clear();
		g.sendKeys("abkdf");
		
		WebElement h = driver.findElement(By.xpath("//input[starts-with(@name, 'first')]"));
		h.clear();
		h.sendKeys("ab");
		
		WebElement i = driver.findElement(By.xpath("//input[ends-with(@name, 'ame')]"));
		i.clear();
		i.sendKeys("abkdf");
		
		Thread.sleep(1500);
		
		
		driver.quit();
	}
}
/*x path - VI
 * absolute x paths - /
 * relative x path - //
 *  associating the attribute to xpath - //*[@tag = value ]
 *  multiple attributes - //*[@tag = value and @tag = value]
 *  With text   //a[text()=“8 GB”]  - remcomended
 *  With contains. //span[contains(text(),'12 GB')] path
 *  Statrs with //span[starts-with(@id=“gg”)]
6. Ends with //span[ends-with(@id=“kk”)] // find it Traversing //div[@class=“abc”]//button[@input=“”hfa]

 *  
*/
