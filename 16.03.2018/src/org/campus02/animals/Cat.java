package org.campus02.animals;

public class Cat extends Animal{

	public Cat(String name, String color, int countEyes) {
		super(name, color, countEyes);
	}

	@Override
	public void walk() {
		System.out.println("Schleichen");
	}

	@Override
	public void makeNoise() {
		System.out.println("Miau");
	}

}
