package org.animals;


public class Eagle extends Animal implements IVolante{

	@Override
	public void verse() {
		System.out.println("iiIIIIIii");
	}

	@Override
	public void eat() {
		System.out.println("Meet");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}