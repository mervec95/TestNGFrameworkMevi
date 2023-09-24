package replitt;


import java.util.*;

class Main {
 
  
	  public static int timesTwo(ArrayList<Integer> nums) {
	
	  
	  return timesTwo(nums);

	  }


	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    ArrayList<Integer> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.nextInt());
	    }

	    System.out.print(timesTwo(list));

	  } 

	}
