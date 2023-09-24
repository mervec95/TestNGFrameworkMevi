package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		String url = "https://www.instagram.com/";

		// driver.get(url);
		// will wait for the page and elements to be loaded
		// will NOT keep the history

		driver.navigate().to(url);
		// will NOT wait for the page and elements to be loaded
		// will keep the history

		//driver.manage().window().fullscreen(); // Will make full screen
		Thread.sleep(100);
		
		driver.manage().window().maximize(); // will make maximize the screen
		Thread.sleep(100);
		
		driver.manage().window().minimize(); // will make minimize the screen
		Thread.sleep(100);
		
		driver.navigate().to("https://www.mlssoccer.com/");
		Thread.sleep(100);
		
		driver.navigate().to("https://www.fifa.com/");
		Thread.sleep(100);
		
		driver.navigate().back(); //will bring us back to the second page
		Thread.sleep(100);
		
		driver.navigate().back(); //will bring us back to the first page
		Thread.sleep(100);
		
		driver.navigate().forward(); //will bring us forward to the second page
		Thread.sleep(100);
		
		driver.navigate().refresh();
		Thread.sleep(100);
		
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
