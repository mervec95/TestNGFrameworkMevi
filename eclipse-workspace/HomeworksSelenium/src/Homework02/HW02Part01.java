package Homework02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//HW1:
//Open chrome browser
//Go to "https://demo.guru99.com/test/newtours/"
//Click on Register Link
//Fill out ALL required info
//Click Submit
//User successfully registered
//(Create the script using different locators)

public class HW02Part01 {

	public static void main(String[] args) throws InterruptedException {
		

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		//driver.manage().window().maximize();
		Thread.sleep(300);
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(200);
		
		driver.findElement(By.name("firstName")).sendKeys("Merve");
		driver.findElement(By.name("lastName")).sendKeys("Cuvan");
		driver.findElement(By.name("phone")).sendKeys("000-000-000"); 
		driver.findElement(By.id("userName")).sendKeys("mervec@yahoo.com");
		driver.findElement(By.name("address1")).sendKeys("Waterloo, Canada"); 
		driver.findElement(By.name("city")).sendKeys("Waterloo"); 
		driver.findElement(By.name("state")).sendKeys("Ontario"); 
		driver.findElement(By.name("postalCode")).sendKeys("000");
		driver.findElement(By.name("country")).sendKeys("CANADA");
		driver.findElement(By.id("email")).sendKeys("mevi");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		Thread.sleep(15000);
		
		//driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		
		driver.quit();
	}

}
