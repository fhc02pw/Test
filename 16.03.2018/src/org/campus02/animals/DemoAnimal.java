package org.campus02.animals;

public class DemoAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frog frog = new Frog("quaxi", "Green", 2);
		Animal frogAsAnimal = frog; 
		Frog recastedFrog = (Frog) frogAsAnimal; 
		
		frogAsAnimal.walk(); 
		recastedFrog.walk(); 
		
		Nature nature = new Nature(); 
		nature.addAnimal(frog);
		nature.addAnimal(new Frog("Quaxi2", "Green", 2));
		
		int greenCount = nature.countColor("Green"); 
		System.out.println("Green animal are counted " + greenCount + " times");
		
		
		IFly flyingDog = new FlyingDog("Flyfly", "Brown", 2); 
		flyingDog.fly();
		
		FlyingDog castedFlyingDog = (FlyingDog) flyingDog; 
		castedFlyingDog.walk(); 
		castedFlyingDog.makeNoise();
	}

}
