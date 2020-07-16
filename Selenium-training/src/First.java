import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		// to set the path for the browser
		System.setProperty("webdriver.chrome.driver", "/Users/ash/eclipse-workspace/Selenium-training/Driver/chromedriver");
		
		// create web driver object
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com/";
		String pageTitle = "Facebook";
		
		// open a facebook page 
		driver.get(url);
		
		// get title
		if(driver.getTitle().contains(pageTitle))
		{
			System.out.println("Our test entered the correct url");
			
		}
		else{
				System.out.println("incorrect url");
		}
		System.out.println(driver.getTitle());
		
		// to get url
		if(driver.getCurrentUrl().equals(url)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		System.out.println(driver.getCurrentUrl());
		
		
		
		// close the browser
//		driver.close();
		
		// to quit the browser 
		driver.quit();	
	}
	
	
}

 /*driver.close  - will only close the current window
  * driver.quit -  will close all the windows
  * */
