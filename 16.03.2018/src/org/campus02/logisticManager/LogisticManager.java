package org.campus02.logisticManager;

import java.util.ArrayList;

public class LogisticManager {
	private ArrayList<IMoveable> moveableObjects = new ArrayList<>(); 
	
	public void add(IMoveable moveableObject)
	{
		moveableObjects.add(moveableObject); 
	}
	
	public void moveAll(String destination)
	{
		for(IMoveable obj : moveableObjects)
		{
			obj.move(destination);
		}
	}
}
