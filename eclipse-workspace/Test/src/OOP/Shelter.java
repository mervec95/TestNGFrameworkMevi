package OOP;

public class Shelter {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat ();
		cat1.type = "Scotish";
		cat1.color = "Gray";
		cat1.age = 1;
		
		Cat cat2 = new Cat();
		cat2.type = "Persian";
		cat2.color = "white";
		cat2.age = 3;
		
		Cat cat3 = new Cat();
		cat3.type = "Himalayan";
		cat3.color = "White";
		cat3.age = 2;
		
		cat1.eat();
		cat1.sleep();
		cat1.movement();
		
		System.out.println();
		
		cat2.eat();
		cat2.sleep();
		cat2.movement();
		
		System.out.println();
		
		cat3.eat();
		cat3.sleep();
		cat3.movement();
		

	}

}
