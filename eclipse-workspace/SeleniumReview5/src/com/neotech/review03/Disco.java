package com.neotech.review03;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

// BREAK & TASK Until 12:40
// Open https://neotech.vercel.app/windows
// Click on the button that opens NeoTech Academy page
// Switch the focus back and forth 10 times
// Hint: You switch the two handles that you have in the set

// Find the time for the best disco movement :D
public class Disco extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	//https://neotech.vercel.app/windows
		
		setUp();
		
		driver.findElement(By.id("neo")).click();
		Thread.sleep(1000);
		
		Set<String> allHandles = driver.getWindowHandles();
		
		Iterator<String> it = allHandles.iterator();
		String handle1 = it.next();
		String handle2 = it.next();
		
		for(int i=0; i<10; i++) {
			driver.switchTo().window(handle1);
			Thread.sleep(400);
			driver.switchTo().window(handle2);
			Thread.sleep(400);
		}
		
		driver.close(); // Will close ONLY the current tab/window
		// driver.quit(); // Will close ALL the open tabs/windows

		tearDown(); // Here we are using --> driver.quit();

		// HW only for good students
		// Click on all the buttons
		// Then close them, one by one

	}

}
