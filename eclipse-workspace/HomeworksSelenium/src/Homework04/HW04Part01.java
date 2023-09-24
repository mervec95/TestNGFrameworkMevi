package Homework04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//===========HW-1==========
//		Open chrome browser
//		Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		Enter valid username
//		Clear username and enter again valid username
//		Leave password field empty
//		Click on login button
//		Verify error message with text "Invalid Login or Password." is displayed.

public class HW04Part01 {

	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String username = "Tester";
	public static String password = "test";
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys(username);
		Thread.sleep(100);

		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).clear();	
		Thread.sleep(100);
		
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
		Thread.sleep(100);
		
		driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		Thread.sleep(200);
		
		WebElement verify = driver.findElement(By.xpath("//span[@id='ctl00_MainContent_status']"));
		if (verify.isDisplayed()) {
			System.out.println("Invalid Login or Password.");
		}else
		{
			System.out.println("Successful");
		}

	}

}
