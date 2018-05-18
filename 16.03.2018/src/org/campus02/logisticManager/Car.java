package org.campus02.logisticManager;

public class Car implements IMoveable{
	private String type, color, weight;

	public Car(String type, String color, String weight) {
		super();
		this.type = type;
		this.color = color;
		this.weight = weight;
	}

	@Override
	public void move(String destination) {
		System.out.println(getColor() + " " + getType() + " will be moved to " + destination);
		
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public String getWeight() {
		return weight;
	} 
}
