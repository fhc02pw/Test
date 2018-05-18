package org.campus02.animals;

public class Frog extends Animal{

	
	public Frog(String name, String color, int countEyes) {
		super(name, color, countEyes);
	}

	@Override
	public void walk() {
		System.out.println("Jumping");
	}

	@Override
	public void makeNoise() {
		System.out.println("Quak");
	}

}
