

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise {

	public static void main(String args []) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.com/";
		driver.get(url);
	
		WebElement a = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		a.sendKeys("fan");
		
		WebElement a1 = driver.findElement(By.cssSelector("input[type='submit']"));
		a1.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)");
		
		WebElement a2 = driver.findElement(By.id("p_89/Lasko"));
		System.out.println(a2);
		System.out.println(a2.getText());
		
		
		
		//List<WebElement> brand = driver.findElements(By.xpath("//*[@id='p_89/Lasko']/span"));
		
	
		
		
	
			//select brand
			//List<WebElement> brand = driver.findElements(By.xpath("//*[@id=\"p_89/Honeywell\"]/span/a/div/label/i"));
			//List<WebElement> brand = driver.findElements(By.id("brandsRefinements"));
			//List<WebElement> brand = driver.findElements(By.xpath("//input[@id='p_89/Holmes' and @aria-label='Holmes']"));
			//List<WebElement> brand = driver.findElements(By.className("a-list-item"));
			//List<WebElement> brand = driver.findElements(By.className("a-unordered-list a-nostyle a-vertical a-spacing-medium"));
			//List<WebElement> brand = driver.findElements(By.xpath("//html/body/div[1]/div[2]/div[1]/div[1]/div/div[3]/span/div[1]/span/div/div/div[5]"));
			//List<WebElement> brand = driver.findElements(By.xpath("//html/body/div[1]/div[2]/div[1]/div[1]/div/div[3]/span/div[1]/span/div/div/div[5]/ul/li[1]/span/a/div"));
		
			//List<WebElement> brand = driver.findElements(By.xpath("//*[@id='p_89/Honeywell']/span/a/div/label/input"));	
			
		
			List<WebElement> brand = driver.findElements(By.xpath("//div[@id='brandsRefinements']/ul/li/span/a/span"));	
//			System.out.println(brand);
//				int s=brand.size();
//				for(int i=1;i<s;i++){
//					String ss = brand.get(i).getText();
//					System.out.println(brand.get(i).getText());
//					if(ss.equalsIgnoreCase("Holmes")) {
//						brand.get(i).click();
//						break;
//					}
//			   brand = driver.findElements(By.xpath("//*[@id=\"brandsRefinements\"]/ul/li"));
//			   brand.get(i).click();
//			 }
			
			for(WebElement x1: brand) {
//			System.out.println(x1);
			String ee = x1.getText();
			System.out.println(ee);
			if(ee.equalsIgnoreCase("Holmes")) {
			System.out.println(ee);
			x1.click();
			}
			else {
				System.out.println("not found");
			}
			}
			
			Thread.sleep(5000);

//			//oscillation
//			
//			WebElement osci = driver.findElement(By.xpath("//*[@id=\"p_n_feature_browse-bin/2245210011\"]/span/a/span"));
//			osci.click();
//			
//			Thread.sleep(3000);
//			
//
//			//price high to low
//			
//			WebElement fi = driver.findElement(By.id("a-autoid-0-announce"));
//			fi.click();
//			
//			List<WebElement> ai = driver.findElements(By.xpath("html/body/div[3]/div/div"));
//			
//			
//				System.out.println(ai.size());
//				for(WebElement x: ai) {
//				System.out.println("ai");
//				String dd = x.getText();
//				if(dd.equalsIgnoreCase("Price: High to Low"));
//				x.click();
//				Thread.sleep(5000);
//				
//				}		
//				//	select item
//				
//				WebElement selecitem = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/h2/a/span"));
//				selecitem.click();
//				
//				//get name
//				WebElement n1 = driver.findElement(By.xpath("//*[@id=\'productTitle\']"));
//						n1.getAttribute("");
//						System.out.println(n1);
				
			
						
		driver.quit();
	}	
		}


