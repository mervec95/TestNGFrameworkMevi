package Homework01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//HW2: Opening Page on Firefox Browser
//Open Firefox browser
//Navigate to “https://www.redfin.com/”
//Verify that you have navigated to (https://www.redfin.com/)
//End the Session (close the browser).

public class HW01Part02 {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redfin.com/");
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.redfin.com/";
		
		if(actualURL.equalsIgnoreCase(expectedURL))
		{
			System.out.println("The URL " + driver.getCurrentUrl() + " is correct!");
		}
		else
		{
			System.out.println("The URL is wrong!!");
		}
		Thread.sleep(15000);
		
		driver.close();
		
		
	}

}
