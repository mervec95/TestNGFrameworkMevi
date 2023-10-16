package com.neotech.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public static void setUp() throws InterruptedException {
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

		String browser = ConfigsReader.getProperty("browser");
		// System.out.println(browser);

		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;

		default:
			break;
		}

//		if(browser.toLowerCase() == "chrome") {
//			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
//			driver = new ChromeDriver();
//		} else if (browser.toLowerCase() == "firefox") {
//			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
//			driver = new FirefoxDriver();
//		}

		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));
		driver.manage().window().maximize();
		String website = ConfigsReader.getProperty("url");
		driver.get(website);
	}

	@AfterMethod(alwaysRun = true)
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	public static void quit(int second) throws InterruptedException {
		if(driver != null) {
			Thread.sleep(second*1000);
			driver.quit();
		}
}
}