package org.campus02.animals;

public abstract class Animal {
	private String color; 
	private int countEyes; 
	private String name; 
	
	public Animal(String name, String color, int countEyes) {
		this.name = name;
		this.color = color; 
		this.countEyes = countEyes; 
	}
	
	public String getColor() {
		return color;
	}

	public int getCountEyes() {
		return countEyes;
	}

	public String getName() {
		return name;
	}

	public abstract void walk(); 
	public abstract void makeNoise(); 
}
