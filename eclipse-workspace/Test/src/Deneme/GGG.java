package Deneme;

import java.util.Scanner;

public class GGG {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	  
	    int catCount = 0;
			int dogCount = 0;
			String word = scan.next();

			for (int i = 0; i <= word.length()-3; i++) {
				if (word.substring(i, (i + 3)).equals("cat"))
					catCount += 1;
					if (word.substring(i, (i + 3)).equals("dog"))
						dogCount += 1;
				}

			if (catCount != dogCount) {
				System.out.println("false");
			} else {
				System.out.println("true");
			}
		}
	}