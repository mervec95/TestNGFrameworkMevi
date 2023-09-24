package Homework04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW04Part02ShaneCozumu {

	
		// Radio Button Practice
		// Open chrome browser
		// Go to "https://demoqa.com/radio-button"
		// Verify if all radio buttons are displayed and clickable
		// Click on all radio buttons
		// Verify radio buttons has been clicked successfully
		// Quit the browser

		public static String url = "https://demoqa.com/radio-button";

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get(url);

			List<WebElement> radioList = driver.findElements(By.xpath("//input[@type='radio']"));
			for (WebElement radio : radioList) {
				if (radio.isEnabled()) {
					System.out.println("Radio is enabled!");
				} else {
					System.out.println("Radio is NOT enabled!");
				}
			}

			List<WebElement> labelList = driver.findElements(By.xpath("//label[starts-with(@class, 'custom-control-label')]"));
			for (WebElement label : labelList) {
				if (label.isDisplayed()) {
					System.out.println("Label is displayed!");
				} else {
					System.out.println("Label is NOT displayed!");
				}
			}

			System.out.println("------------------------------");
			WebElement yesLabel = driver.findElement(By.xpath("//label[@for='yesRadio']"));
			yesLabel.click();

			WebElement yesRadio = driver.findElement(By.id("yesRadio"));
			if (yesRadio.isSelected()) {
				System.out.println("Yes is Selected");
			} else {
				System.out.println("Yes is NOT Selected");
			}
			System.out.println("------------------------------");

			WebElement noLabel = driver.findElement(By.xpath("//label[@for='noRadio']"));
			noLabel.click();

			WebElement noRadio = driver.findElement(By.id("noRadio"));
			if (noRadio.isSelected()) {
				System.out.println("No is Selected");
			} else {
				System.out.println("No is NOT Selected");
			}

			driver.quit();
		}
	}