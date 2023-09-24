package Deneme;

import java.util.LinkedList;
import java.util.Scanner;

public class Poly2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	}

	private static void isPalindrome(int num) {
		
		LinkedList<Poly2> p = new LinkedList<Poly2>();
		
		for(int i>p.length()-1; i>=0; i--) {
			Object reverse = p.charAt(i);
			System.out.println(reverse);
		}
		
		boolean po = true;
		for(int i=0; i<p.length(); i++) {
			System.out.println(i);
			
		}
		
	}

}
