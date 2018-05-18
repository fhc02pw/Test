package org.campus02.arraySort.liveCoding;

public class Shirt implements Comparable<Shirt>{

	public String color;
	public String size;
	
	public Shirt(String color, String size) {
		super();
		this.color = color;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Shirt [color=" + color + ", size=" + size + "]";
	}

	@Override
	public int compareTo(Shirt arg0) {
		return color.compareTo(arg0.color); 
	} 
	
	
}
