package Homework04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//===========HW-2==========
//Radio Button Practice  
//Open chrome browser
//Go to "https://demoqa.com/radio-button"
//Verify if all radio buttons are displayed and clickable
//Click on all radio buttons
//Verify radio buttons has been clicked successfully
//Quit browser

public class HW04Part022 {

	public static String url = "https://demoqa.com/radio-button";

	public static void main(String[] args) throws InterruptedException {	

//		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.get(url);
//		Thread.sleep(500);
//		
//		WebElement YesRB = driver.findElement(By.xpath("//label[@for='yesRadio']"));
//		YesRB.click();
//		Thread.sleep(200);
//		boolean YesRB1 = driver.findElement(By.xpath("//input[@id='yesRadio']")).isEnabled();
//		if(YesRB.isEnabled()) {
//			System.out.println("Yes Radio Button is clickable");
//		}else {
//			System.out.println("Yes Radio Button is NOT clickable");
//		}
//		
//		WebElement ImpressiveRB = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
//		ImpressiveRB.click();
//		Thread.sleep(200);
//		boolean ImpressiveRB1 = driver.findElement(By.xpath("//input[@id='impressiveRadio']")).isSelected();
//		Thread.sleep(200);
//		if(ImpressiveRB1 == true) {
//			System.out.println("Impressive Radio Button is clickable");
//		}else {
//			System.out.println("Impressive Radio Button is NOT clickable");
//		}
//		
//		WebElement NoRB = driver.findElement(By.xpath("//label[@for='noRadio']"));
//		NoRB.click();
//		Thread.sleep(200);
//		boolean NoRB1 = driver.findElement(By.xpath("//input[@id='noRadio']")).isSelected();
//		Thread.sleep(200);
//		if(NoRB1 == true) {
//			System.out.println("No Radio Button is clickable");
//		}else {
//			System.out.println("No Radio Button is NOT clickable");
		}
		
		}
//		
//		List<WebElement> elements = driver.findElements(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]"));
//
//		for (WebElement e : elements) {
//          if(e.isDisplayed())
//          {
//          System.out.println("All radio buttons are displayed");
//          }else {
//        	  System.out.println("Failed!");
//          }
//
//		}
//		Thread.sleep(200);
//		
//		List<WebElement> elements1 = driver.findElements(By.cssSelector("input.custom-control-input[type='radio']"));
//		for(WebElement el : elements1) {
//			if(el.isEnabled())
//			{
//				 System.out.println("All radio buttons are enabled");
//	          }else {
//	        	  System.out.println("Failed!");
//	          }
//			}
//		Thread.sleep(200);
//		
//		List<WebElement> elements2 = driver.findElements(By.cssSelector("input.radio[class='custom-control-input']"));
//		for(WebElement el : elements2) {
//			if(el.isSelected())
//			{
//				 System.out.println("All radio buttons are clickable");
//	          }else {
//	        	  System.out.println("Failed!");
//	          }
//			}
//		Thread.sleep(200);
//		
	//driver.quit();
//}
//
//}

