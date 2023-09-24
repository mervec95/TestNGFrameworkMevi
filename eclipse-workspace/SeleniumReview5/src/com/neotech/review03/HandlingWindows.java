package com.neotech.review03;

import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class HandlingWindows extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/windows

		setUp();

		String window1 = driver.getWindowHandle();
		System.out.println(window1);

		Thread.sleep(1000);

		System.out.println("--------------------------------");

		// I am NOT able to Locate elements. The focus is still on the first page
		// driver.findElement(By.name("q")).sendKeys("Como estas?");

		
		Set<String> allWindows = driver.getWindowHandles();
		
		for (String windowId : allWindows) {
			System.out.println(windowId);
			
			if(!windowId.equals(window1)) {
				//If the windowId is NOT equal to the first Window ID
				driver.switchTo().window(window1);
			}
		}
		//Now I am able to Locate elements. The focus is on the second page
		driver.findElement(By.name("q")).sendKeys("Como estas?");
		Thread.sleep(2000);
		
		
		
		tearDown();

	}

}
