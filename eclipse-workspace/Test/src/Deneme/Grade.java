package Deneme;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		

		int i, s=0, n=0;
		double avg;
		{ System.out.println("Welcome to the Grader!");}
		{
			System.out.println("Please enter subject name number: ");
		}

		for(i=0; i<=5; i++)
		{
			Scanner in = new Scanner(System.in);
			n=in.nextInt();
			
			s+=n;
			
		}
		avg = s/5;
		System.out.println(avg);
		System.out.println("Thank you for using Grader! Goodbye!");
	}
	

}
