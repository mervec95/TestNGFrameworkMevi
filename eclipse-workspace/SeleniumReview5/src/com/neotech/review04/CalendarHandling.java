package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Go to this link: https://jqueryui.com/
// Click on Datepicker from the left menu
// Show the Calendar
// Select 12/25/2023 from the Calendar
// Verify that you have selected 12/25/2023
import com.neotech.utils.CommonMethods;

public class CalendarHandling extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		// 1st way, using Selenium click() method
		// driver.findElement(By.linkText("Datepicker"));

		// 2nd way, using Selenium click() method
		click(driver.findElement(By.linkText("Datepicker")));
		wait(1);

		// 1st way, using Selenium.switchTo().frame() method
		// driver.switchTo().frame(0);

		// 2nd way, using CommonMethods switchTo()frame() method (using index)
		// switchToFrame(0);

		// 3rd way, using CommonMethods switchTo()frame() method (using WebElement)
		switchToFrame(driver.findElement(By.tagName("iframe")));

		driver.findElement(By.id("datepicker")).click();
		wait(1);

		String expectedMonthYear = "December 2024";

		while (true) {
			WebElement monthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title"));
			String monthYearText = monthYear.getText();
			if (monthYearText.equals(expectedMonthYear)) {
				break;
			}
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		wait(1);

		// Now we need to click on the correct date
		String expectedDay = "25";
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

		// Iterate all the days until I find 25th and then click on it

		for (WebElement day : days) {
			if (day.getText().equals(expectedDay)) {
				// I have found the correct day
				day.click();
				break;
			}
		}

		wait(2);

		// Let's verify that we selected the correct date -> 12/25/2024
		String expectedDate = "12/25/2024";

		WebElement dateTextBox = driver.findElement(By.id("datepicker"));
		if (dateTextBox.getAttribute("value").equals(expectedDate)) {
			Sys("Test Passed");
		} else {
			Sys("Test Failed");
		}
		tearDown();

		// Extra practice
		// Go to this link:
		// https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html

		// Select 22/01/2022 in the first Calendar

		// Select a range of dates in the -> Date Range Example :
	}

}
