package Deneme;

import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grader!");
		Scanner input = new Scanner(System.in);
		String[] Object = new String[5];
		double[] Grade = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter subject name number " + (i + 1) + " and score for this subject");
			Object[i] = input.next();
			Grade[i] = input.nextDouble();
		}
		System.out.println(
				"Summary: " + Object[0] + " - " + Grade[0] + ", " + Object[1] + " - " + Grade[1] + ", " + Object[2]
						+ " - " + Grade[2] + ", " + Object[3] + " - " + Grade[3] + ", " + Object[4] + " - " + Grade[4]);
		double ave = (Grade[0] + Grade[1] + Grade[2] + Grade[3] + Grade[4]) / 5;
		System.out.println("Your average score is: " + ave);
		System.out.println("Thank you for using Grader!" + " Goodbye!");

	}

}
