package com.neotech.review03;
//Open https://neotech.vercel.app/windows

// Click on the button that opens NeoTech Academy page
// Switch the focus back and forth 10 times
// Hint: You switch the two handles that you have in the set

//BENIM YAPTIGIM

import java.util.Set;
import org.openqa.selenium.By;
import com.neotech.utils.BaseClass;

public class Task extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://www.neotechacademy.com/

		setUp();

		String window1 = driver.getWindowHandle();
		System.out.println(window1);

		for (int i = 1; i <= 10; i++) {

			driver.findElement(By.cssSelector("#neo")).click();
			Thread.sleep(500);
			Set<String> allWindows = driver.getWindowHandles();

			for (String windowId : allWindows) {
				System.out.println(windowId);

					driver.switchTo().window(windowId);
					Thread.sleep(500);
				
			}

			Thread.sleep(1000);
			driver.close();
			Thread.sleep(500);
			driver.switchTo().window(window1);

		}

		Thread.sleep(1000);
		tearDown();
	}
}