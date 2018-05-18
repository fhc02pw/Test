package org.campus02.animals;
import java.util.ArrayList;

public class Nature {
	private ArrayList<Animal> animals = new ArrayList<>(); 
	
	public void addAnimal(Animal a)
	{
		animals.add(a); 
	}
	
	public int countColor(String color)
	{
		int countColor = 0; 
		
		for(Animal a : animals)
		{
			if(a.getColor().equals(color))
				countColor++; 
		}
		
		return countColor; 
	}
}
