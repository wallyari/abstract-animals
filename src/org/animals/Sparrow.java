package org.animals;


public class Sparrow extends Animal implements IVolante {

	@Override
	public void verse() {
		System.out.println("Cip cip");
	}
	
	@Override
	public void eat() {
		System.out.println("Insects");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}