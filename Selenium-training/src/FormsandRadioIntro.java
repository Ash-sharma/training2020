import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormsandRadioIntro {
	public static void main(String[] args) throws InterruptedException {
		// to set the path for the browser
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
		
		// create web driver object
		WebDriver driver = new ChromeDriver();
		
//		String url = "https://www.amazon.com/";
		String url = "https://www.testandquiz.com/selenium/testing.html";
		
		driver.get(url);
		// radio button using with the value
				WebElement rdbtn = driver.findElements(By.name("gender")).get(1);
				System.out.println(rdbtn.getText());
				rdbtn.click();
				
				List<WebElement> radbtn = driver.findElements(By.xpath("//input[@type = 'radio']"));
				
				System.out.println(radbtn.size());
				for (int i = 0; i<radbtn.size(); i++) {
				String s = radbtn.get(i).getAttribute("value");
					if(s.equalsIgnoreCase("male")) {
						radbtn.get(i).click();
					}
				}
				
			// check boxes
				WebElement checkbox = driver.findElement(By.className("Automation"));
				checkbox.click();
				
				WebElement checkbox1 = driver.findElements(By.xpath("//input[@type = 'checkbox']"))
										.get(1);
				checkbox1.click();
				
				List <WebElement> cb = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
				for(int i=0; i<cb.size(); i++) {
					System.out.println(cb.get(i).isSelected());
				}
				
				
				Thread.sleep(3000);
				
				
			driver.quit();	
	}
}
