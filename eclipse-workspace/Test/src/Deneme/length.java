package Deneme;

import java.util.Scanner;

public class length {

	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //Write code here

		    if(word.charAt(0)=='x' && word.charAt(word.length()-1)=='x'){
		     word = word.substring(1, word.length()-1);
		     System.out.println(word);
		    }else if(word.charAt(0)!='x' && word.charAt(word.length()-1)!='x') {
		    	System.out.println(word);
		    }else if(word.charAt(0)=='X' && word.charAt(word.length()-1)=='X') {
		    	word = word.substring(1, word.length()-1);
			     System.out.println(word);
		    }
		    else if(word.charAt(0)=='x' && word.charAt(word.length()-1)=='X') {
		    	word = word.substring(1, word.length()-1);
			     System.out.println(word);
		    }
		    else if(word.charAt(0)=='X' && word.charAt(word.length()-1)=='x') {
		    	word = word.substring(1, word.length()-1);
			     System.out.println(word);
		    }else if(word.charAt(0)=='x'){
		    	word = word.substring(1, word.length());
		    	System.out.println(word);
		    }else if(word.charAt(0)=='X'){
		    	word = word.substring(1, word.length());
		    	System.out.println(word);
		    }else if(word.charAt(word.length()-1)=='x'){
		    	word = word.substring(0, word.length()-1);
		    	System.out.println(word);
		    }
		    else if(word.charAt(word.length()-1)=='X'){
		    	word = word.substring(0, word.length()-1);
		    	System.out.println(word);
		    }
		  }
		}