import java.util.Scanner;

public class jkdfgksjd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    // Write your code here
	   
	    int hiCount = 0;
	    for (int index = 0; index < str.length()-5; index++) {
	      if(str.substring(index, index+5).equals("merve")) {
	        hiCount++;
	      }
	    }
	    System.out.println(hiCount);
	  }
	}