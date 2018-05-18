package org.campus02.logisticManager;

public class Shirt implements IMoveable{
	private String brand, size, color;

	public Shirt(String brand, String size, String color) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
	}

	@Override
	public void move(String destination) {
		System.out.println("Shirt " + getBrand() + " will be moved to " + destination);
		
	}

	public String getBrand() {
		return brand;
	}

	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	} 
	
	
}
