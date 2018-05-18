package org.campus02.animals;

public class FlyingDog extends Animal implements IFly{

	public FlyingDog(String name, String color, int countEyes) {
		super(name, color, countEyes);
		
	}

	@Override
	public void fly() {
		System.out.println("Flying Dog " + getName() + " flies"); 
	}

	@Override
	public void walk() {
		System.out.println("Flying Dog " + getName() + " walks"); 
		
	}

	@Override
	public void makeNoise() {
		System.out.println("Flying Dog " + getName() + " barks"); 
	}

	
}
