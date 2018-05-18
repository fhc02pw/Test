package org.campus02.logisticManager;

public class DemoLogisticManager {

	public static void main(String[] args) {
		LogisticManager manager = new LogisticManager(); 
		
		manager.add(new Car("Vw Golf", "Blue", "1500"));
		manager.add(new Shirt("Adidas", "medium", "red"));; 
		
		manager.moveAll("Graz"); 
	}

}
