package Homework01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//HW1: Amazon Page Title Verification: 
//Open chrome browser
//Go to “https://www.amazon.com/”
//Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//End the Session (close the browser).

public class HW01Part01 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println(driver.getTitle());
		}
		else
		{
			System.out.println("The title is wrong!!!");
		}
		
		Thread.sleep(15000);
		
		
		driver.quit();
		
	}

}
