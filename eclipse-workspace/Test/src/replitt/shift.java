package replitt;

import java.util.Scanner;

public class shift {

	 public static void main(String[] args) {  
	      
	        
		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] nums = new int[size];
		    
	          
	      
	        for (int i = 0; i < nums.length; i++) {   
	            System.out.print(nums[i] + " ");   
	        }    
	          
	        //Rotate the given array by n times toward left  
	        for(int i = 0; i < size; i++){  
	            int j, first;  
	            //Stores the first element of the array  
	            first = nums[0];  
	          
	            for(j = 0; j < nums.length-1; j++){  
	                //Shift element of array by one  
	                nums[j] = nums[j+1];  
	            }  
	            //First element of array will be added to the end  
	            nums[j] = first;  
	        }  
	          
	        System.out.println();  
	          
	        //Displays resulting array after rotation  
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< nums.length; i++){  
	            System.out.print(nums[i] + " ");  
	        }  
	    }  
	}  