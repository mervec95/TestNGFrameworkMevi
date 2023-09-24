package Homework03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Homework 2:
//    Using Css ONLY
//    TC 2: Mercury Tours Registration: 
//        Open chrome browser
//        Go to “http://demo.guru99.com/test/newtours/”
//        Click on Register Link
//        Fill out all required info
//        Click Submit
//        User successfully registered
//        
public class HW03Part02 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		String url = "http://demo.guru99.com/test/newtours/";
		driver.get(url);

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("a[href='register.php'")).click();
		Thread.sleep(300);

		driver.findElement(By.cssSelector("input[name='firstName'")).sendKeys("Merve");
		driver.findElement(By.cssSelector("input[name='lastName'")).sendKeys("Cuvan");
		driver.findElement(By.cssSelector("input[name='phone'")).sendKeys("000-000-00");
		driver.findElement(By.cssSelector("#userName")).sendKeys("mervec@yahoo.com");
		driver.findElement(By.cssSelector("input[name='address1'")).sendKeys("Waterloo, CA");
		driver.findElement(By.cssSelector("input[name='city'")).sendKeys("Waterloo");
		driver.findElement(By.cssSelector("input[name='state'")).sendKeys("Ontario");
		driver.findElement(By.cssSelector("input[name='postalCode'")).sendKeys("0000");
		driver.findElement(By.cssSelector("select[name='country'")).sendKeys("CANADA");
		driver.findElement(By.cssSelector("#email")).sendKeys("Mevi");
		driver.findElement(By.cssSelector("input[name='password'")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[name='confirmPassword'")).sendKeys("12345");

//		WebElement submitButton = driver.findElement(By.cssSelector("//input[name='submit']"));
//		submitButton.click();

		Thread.sleep(3000);
//		driver.quit();

	}
	
}
