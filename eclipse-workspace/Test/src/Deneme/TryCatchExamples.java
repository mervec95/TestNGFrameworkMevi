package Deneme;

import java.util.Scanner;

public class TryCatchExamples {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		
		try { 
			int year = input.nextInt();
		    System.out.println(year);
		    System.out.println("TRUE!");
		} catch(Exception e) {
			System.out.println("WRONG!");
		}

	}

}
