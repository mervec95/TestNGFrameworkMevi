package com.neotech.review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class CheckBoxDemo extends BaseClass {
	// Go to https://demoqa.com/automation-practice-form
	// Check Female
	// Select all the Hobbies

	public static void main(String[] args) throws InterruptedException {

		setUp();

		Thread.sleep(1000);

		// Cannot click on the Input, because the Label does not allow
		// driver.findElement(By.id("gender-radio-1")).click();

		// We are able to click on the Label
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		Thread.sleep(1000);

		// findElement vs findElements
		// findElement returns the first WebElement with that xPath
		// findElements returns all the WebElements with that xPath inside a List

		// It will return the first WebElement with that xpath
		// WebElement element =
		// driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));

		// It will return all the WebElements with that xpath in List
		// List<WebElement> elements =
		// driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));

		List<WebElement> checkBoxList = driver.findElements(By.xpath("//div[@id='hobbiesWrapper']/div[2]//label"));

		// I want to click them one-by-one
		for (WebElement checkBox : checkBoxList) {
			checkBox.click();
			Thread.sleep(1000);
		}

		tearDown();

	}

}