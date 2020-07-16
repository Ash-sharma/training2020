import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommandsIntro {
	public static void main(String[] args) throws InterruptedException {
		// to set the path for the browser
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
		
		// create web driver object
		WebDriver driver = new ChromeDriver();
		
//		String url = "https://www.amazon.com/";
		String url = "https://www.testandquiz.com/selenium/testing.html";
		
		driver.get(url);
		
		WebElement inputfield = driver.findElement(By.id("fname"));
		// to inout values 
		inputfield.sendKeys("ash");
		
		// to clear the already existing value 
		inputfield.clear();
		
		WebElement submitbtn = driver.findElement(By.id("idOfButton"));
		// to click on the element use .click()
		submitbtn.click();
		
		//to check id webelement is present in the webpage or not - isDisplayed() - returns boolean value
		System.out.println(submitbtn.isDisplayed());
		
		// to check if webelement is enabled or not,  return the boolean value
		WebElement radiobtn = driver.findElement(By.id("male"));
		System.out.println(radiobtn.isEnabled());
		
		//to check if webelement is selected or not, returns the boolean value
		System.out.println(radiobtn.isSelected());
		
		// submit function to submit the form
		//submit();
		
		// if you want to get any text from the webelement 
		System.out.println(submitbtn.getText());
		
		// if you want ot get the tag name
		System.out.println(submitbtn.getTagName());
		
		// if you want ot get the css value of the webelement  - not very imp
		System.out.println(submitbtn.getCssValue("style"));
		
		// if you want to know the size of the webelement  - getSize
		System.out.println(submitbtn.getSize());
		
		// if you want to find the location of the webelement - getlocation
		Point p = 	submitbtn.getLocation();
		System.out.println(p);
		System.out.println("x coordinate is "+ p.x + " y coordinate is " + p.y);
		
		
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
		
		
		
		Thread.sleep(3000);
		
		
	driver.quit();	
	}
}
