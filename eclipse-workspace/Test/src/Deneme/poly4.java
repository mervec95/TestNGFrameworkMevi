package Deneme;

import java.util.LinkedList;
import java.util.Scanner;

public class poly4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    private static void isPalindrome(int num) {
        //create 2 extra integers
        int new_num = 0;
        int number = num;// copy the num value into number
        // create a new list 
        LinkedList<Integer> lst = new LinkedList<>();
        //Reverse the number and add the number into the list one by one
        while (num > 0) {
            lst.add(num % 10);
            num /= 10;
        }
        // convert list of integers into single int.
        for (Integer i : lst) {
            new_num = 10 * new_num + i;
        }
        System.out.println("new_num ==> " + new_num);
        System.out.println("num ==> " + number);
        // Check if number is equal to new_num
        if (number == new_num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}