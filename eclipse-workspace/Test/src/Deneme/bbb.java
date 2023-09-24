package Deneme;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bbb {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    for(int i=0; i < size; i++){
		      nums[i] = scan.nextInt();
		    }
		    printUniqueNumbers(nums);
		  }
		  
		  public static void printUniqueNumbers(int[] nums){
		    //WRITE YOUR CODE HERE
		
			  HashSet<Integer> h = new HashSet<Integer>();
			  for(int i=0; i<nums; i++)h.add(nums[i]);
			  for