package Deneme;

import java.util.Scanner;

public class Shape {
	//A= π*r*r
	
	double area;
	void circles(double radius)
	
	{
		area = 3.14 * radius * radius;
	}
	class Circle extends Shape {
		
		public void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter radius: ");
			double radius = input.nextDouble();
			Circle c = new Circle();
			c.area(radius);
			
		System.out.println("Area: " + area);
		}

		private void area(double radius) {
			// TODO Auto-generated method stub
			
		}
	}

}
