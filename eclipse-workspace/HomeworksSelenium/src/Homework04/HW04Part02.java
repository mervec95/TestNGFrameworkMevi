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

public class HW04Part02 {

	public static String url = "https://demoqa.com/radio-button";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		Thread.sleep(200);

		WebElement ImpressiveRB = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		ImpressiveRB.click();
		Thread.sleep(200);

		WebElement NoRB = driver.findElement(By.xpath("//label[@for='noRadio']"));
		NoRB.click();
		Thread.sleep(200);
		
		boolean YesRB1 = driver.findElement(By.xpath("//input[@id='yesRadio']")).isEnabled();
		if (YesRB1 == true) {
			System.out.println("Yes Radio button has been clicked successfully");
		} else if (YesRB1 == false){
			System.out.println("Yes button -> Failed to click radio button");
		}else {
			System.out.println("Something went wrong");
		}
		Thread.sleep(200);

		boolean ImpressiveRB1 = driver.findElement(By.xpath("//input[@id='impressiveRadio']")).isEnabled();    
		if (ImpressiveRB1 == true) {
			System.out.println("Impressive Radio button has been clicked successfully");
		} else if (ImpressiveRB1 == false){
			System.out.println("Impressive button -> Failed to click radio button");
		}else {
			System.out.println("Something went wrong");
		}
		Thread.sleep(200);

		
		boolean NoRB1 = driver.findElement(By.xpath("//input[@id='noRadio']")).isEnabled();
		if (NoRB1 == true) {
			System.out.println("No Radio button has been clicked successfully");
		} else if (NoRB1 == false){
			System.out.println("No Radio button -> Failed to click radio button");
		}else {
			System.out.println("Something went wrong");
		}
		Thread.sleep(200);

		
		List<WebElement> elements = driver.findElements(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]"));

		for (WebElement e : elements) {
          if(e.isDisplayed())
          {
          System.out.println("All radio buttons are displayed");
          }else {
        	  System.out.println("Failed!");
          }

		}

	//driver.quit();

}

}


//List<WebElement> NoRB = driver.findElements(By.cssSelector("input.custom-control-input[type='radio']"));
//System.out.println(NoRB.size());
//Thread.sleep(200);



//select yap clear yap hepsini tek tek yap ya da for loopa koy hepsini dongu yap