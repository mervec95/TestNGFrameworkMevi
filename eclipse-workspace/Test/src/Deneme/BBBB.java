package Deneme;

import java.util.*;

public class BBBB {
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
	  
	  
Set<String> uniqueNumbers = new HashSet<>();
   for(int i=0; i<uniqueNumbers.size(); i++){
      if(!uniqueNumbers.contains(nums));
    }
    uniqueNumbers.add(nums);
    System.out.println(nums);
				

    
    
  }
}