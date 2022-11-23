package org.animals;


public class Dolphin extends Animal implements INuotante{

	@Override
	public void verse() {
		System.out.println("Sonarr Wavess");
	}

	@Override
	public void eat() {
		System.out.println("Fish");
	}

	@Override
	public void swimming() {
		System.out.println("I'm swimming");
	}

}
