package Homework02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//HW2: Facebook sign up:
//Open chrome browser
//Go to "https://www.facebook.com/"
//Click on Sign Up link
//Enter first name
//Enter last name
//Enter email address
//Re-enter email address
//Click on Sign Up button

public class HW02Part02 {

	public static void main(String[] args) throws InterruptedException {
		

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		//driver.manage().window().maximize();
		Thread.sleep(100);
		
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(100);
		
		driver.findElement(By.name("firstname")).sendKeys("Merve");
		Thread.sleep(100);
		driver.findElement(By.name("lastname")).sendKeys("Cuvan");
		driver.findElement(By.name("reg_email__")).sendKeys("mervec@yahoo.com"); 
		Thread.sleep(100);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mervec@yahoo.com"); 
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
		driver.findElement(By.name("birthday_month")).sendKeys("Jan");
		driver.findElement(By.name("birthday_day")).sendKeys("23"); 
		driver.findElement(By.name("birthday_year")).sendKeys("1995");
		driver.findElement(By.xpath("//input[@type='radio'and@value='1']")).click();
	
		
		
		//driver.findElement(By.name("websubmit")).click();
		Thread.sleep(15000);
		
		//driver.quit();

	}

}
