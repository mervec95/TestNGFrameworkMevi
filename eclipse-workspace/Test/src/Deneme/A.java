package Deneme;

public class Teste extends B{
	public Teste() {
		System.out.println("C");
	}
	public static void main(String[] args) {
		B obj = new B();
}

class A {
	
	public A() {
		System.out.println("A");
		
	}
}

class B extends A{
	public B() {
		System.out.println("B");
	}
}

