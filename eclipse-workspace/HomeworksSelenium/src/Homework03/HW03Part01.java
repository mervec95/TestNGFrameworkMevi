package Homework03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Homework 1:
//    Using xPath ONLY
//    TC 2: Mercury Tours Registration: 
//        Open chrome browser
//        Go to “http://demo.guru99.com/test/newtours/”
//        Click on Register Link
//        Fill out all required info
//        Click Submit
//        User successfully registered

public class HW03Part01 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		String url = "http://demo.guru99.com/test/newtours/";
		driver.get(url);

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@href='register.php']")).click();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//input[@name= 'firstName']")).sendKeys("Merve");
		driver.findElement(By.xpath("//input[@name= 'lastName']")).sendKeys("Cuvan");
	    driver.findElement(By.xpath("//input[@name= 'phone']")).sendKeys("000-000-00");
		driver.findElement(By.xpath("//input[@id= 'userName']")).sendKeys("mervec@yahoo.com");
		driver.findElement(By.xpath("//input[@name= 'address1']")).sendKeys("Waterloo, CA");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Waterloo");
	    driver.findElement(By.xpath("//input[@name= 'state']")).sendKeys("Ontario");
		driver.findElement(By.xpath("//input[@name= 'postalCode']")).sendKeys("0000");
		driver.findElement(By.xpath("//select[@name= 'country']")).sendKeys("CANADA");
		driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys("Mevi");
		driver.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name= 'confirmPassword']")).sendKeys("12345");
		
		//WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
		//submitButton.click();
		
		Thread.sleep(3000);
		//driver.quit();
		
	}
}

