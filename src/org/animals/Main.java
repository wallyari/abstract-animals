package org.animals;

public class Main {
	public static void main(String[] args) {
		
	
		Dog d1 = new Dog();
		System.out.println("Dog:");
		d1.sleep();
		d1.eat();
		d1.verse();
		System.out.println("-------------------");
				
		Sparrow s1 = new Sparrow();
		System.out.println("Sparrow:");
		s1.sleep();
		s1.eat();
		s1.verse();
		System.out.println("-------------------");
		
		Eagle e1= new Eagle();	
		System.out.println("Eagle:");
		e1.sleep();
		e1.eat();
		e1.verse();
		System.out.println("-------------------");
		
		Dolphin dolph1 = new Dolphin();
		System.out.println("Dolphin:");
		dolph1.sleep();
		dolph1.eat();
		dolph1.verse();
		System.out.println("-------------------");
		

		faiVolare(s1);
		faiVolare(e1);
		faiNuotare(dolph1);
	}
	
	
	static void faiVolare(IVolante animal) {
		animal.fly();
	}
	
	static void faiNuotare(INuotante animal) {
		animal.swimming();
	}
}