package replitt;

import java.util.Scanner;

public class GIFT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  String item = scan.nextLine();
	    int balance = 100;
	    if(item.equals("Blanket")) {
	      balance -= 60;
	    }
	    else if(item.equals("Charger")) {
	      balance -= 25;
	    }
	    else if(item.equals("Hat")) {
	      balance -= 25;
	    }
	    else if(item.equals("Headphones")) {
	      balance -= 30;
	    }
	    else if(item.equals("Laptop")) {
	      balance -= 200;
	    }
	    else if(item.equals("Pants")) {
	      balance -= 50;
	    }
	    else if(item.equals("Pillow")) {
	      balance -= 40;
	    }
	    else if(item.equals("Smartphone")) {
	      balance -= 1000;
	    }
	    else if(item.equals("Socks")) {
	      balance -= 5;
	    }
	    else if(item.equals("USB cable")) {
	      balance -= 10;
	    }
	    else {
	      System.out.println("Invalid item!");
	    }
	    System.out.println("Thank you for your purchase!");
	    if(balance < 0) {
	      System.out.println("Sorry, not enough funds on your gift card!");
	    }
	    else {
	      System.out.println("Your current balance is: " + balance + "$");
	    }
	  }
	}