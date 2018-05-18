package org.campus02.animals;

public class Bird extends Animal implements IFly{

	public Bird(String name, String color, int countEyes) {
		super(name, color, countEyes);
	}

	@Override
	public void walk() {
		System.out.println("Fly");
	}

	@Override
	public void makeNoise() {
		System.out.println("Tweet");
	}

	@Override
	public void fly() {
		System.out.println(getName() + " flies"); 
	}

}
