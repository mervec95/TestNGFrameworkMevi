package Deneme;


import java.util.LinkedList;
import java.util.Scanner;

public class poly3 {

		public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int num = scan.nextInt();
	        P(num);
	    }

	    private static void P(int num) {
	        
	        int num2 = 0;
	        int number = num;
	       
	        LinkedList<Integer> in = new LinkedList<>();
	       
	        while (num > 0) {
	            in.add(num % 10);
	            num /= 10;
	        }
	       
	        for (Integer i : in) {
	            num2 = 10 * num2 + i;
	        }
	        
	        if (number == num2) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	    }
}