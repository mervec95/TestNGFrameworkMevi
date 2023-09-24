package com02.Variables;

import java.util.Scanner;

/*
 * Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total `seconds`.

- Create a Scanner object
- Declare int variables `inputSeconds, hours, minutes, seconds`
- Ask user enter seconds by printing:

    "Enter seconds:"

- Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in  `inputSeconds`.

- Assign values to the hours, minutes, seconds variables

- Display the result.

Example:
```
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
 */
public class SecondsConverter {

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    
	   int seconds;
	    int minutes;
	    int hours;
	    System.out.println("Enter seconds:");
	    seconds = scan.nextInt();
	    hours = seconds / 3600;
	    minutes = (seconds % 3600)/60;
	    int seconds_output = (seconds %3600)%60;
	    
	System.out.println(hours + " hours, " + minutes + " minutes, and " +  seconds_output + " seconds");

	}

}
