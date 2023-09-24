package Deneme;

import java.util.Scanner;

public class AverageTemperature {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), 
				scan.nextDouble(), scan.nextDouble()};
		
		
		
		
		double sumArr = 0;
		
		for (int i=0; i<temps.length; i++) {
			sumArr += temps[i];}
		System.out.println(sumArr/temps.length);

	}

}
