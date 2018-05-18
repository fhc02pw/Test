package org.campus02.animals;

public class Dog extends Animal{

	public Dog(String name, String color, int countEyes) {
		super(name, color, countEyes);
	}

	@Override
	public void walk() {
		System.out.println("Run");
	}

	@Override
	public void makeNoise() {
		System.out.println("Bark");
	}

}
