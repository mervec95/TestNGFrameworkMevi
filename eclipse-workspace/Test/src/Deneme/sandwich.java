package Deneme;

import java.util.Scanner;

public class sandwich {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	    //Write your code here

	     int count = 0;
	     for(int i=0; i<str.length()-4; i++){
	       if(str.substring(i, i+5).equalsIgnoreCase("bread"))
	       {
	         count++;
	       }  
	     }{
	       if (str.indexOf("bread") == str.lastIndexOf("bread")){
	         System.out.println("bread");
	       }else{
	         System.out.println("nothing");
	       }
	     }
	     
	   }
	 }