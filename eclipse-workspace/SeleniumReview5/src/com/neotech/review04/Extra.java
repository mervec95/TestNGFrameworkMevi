package com.neotech.review04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

//Extra practice
// Go to this link:
// https://demo.seleniumeasy.com/bootstrap-date-picker-demo.html
// Select 22/01/2022 in the first Calendar
// Select a range of dates in the -> Date Range Example :
public class Extra extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();

		click(driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-th']")));
		
		String expectedMonthYear = "January 2022";

		while (true) {
			WebElement monthYear = driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']"));
			String monthYearText = monthYear.getText();
			if (monthYearText.equals(expectedMonthYear)) {
				break;
			}
			driver.findElement(By.xpath("//th[normalize-space()='January 2022']")).click();
		}
		wait(1);

		String expectedDay = "01";
		List<WebElement> days = driver.findElements(By.xpath("//div[@class='datepicker-days']/tbody/tr/td"));



		for (WebElement day : days) {
			if (day.getText().equals(expectedDay)) {
				
				day.click();
				break;
			}
		}

		wait(2);


		String expectedDate = "01/22/2022";

		WebElement dateTextBox = driver.findElement(By.xpath("//td[@class='day'][normalize-space()='1']"));
		if (dateTextBox.getAttribute("value").equals(expectedDate)) {
			Sys("Test Passed");
		} else {
			Sys("Test Failed");
		}
		
		
		click(driver.findElement(By.cssSelector("input[placeholder='Start date']")));
		
		tearDown();

	}

}
