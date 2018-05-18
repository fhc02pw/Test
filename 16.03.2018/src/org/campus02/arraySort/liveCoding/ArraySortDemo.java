package org.campus02.arraySort.liveCoding;

import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] args) {
		
		Integer[] numbers = {5,8,1,96,4,37};
		
		System.out.println("Before sort");
		System.out.println(Arrays.toString(numbers)); 
		
		
		Arrays.sort(numbers);
		
		System.out.println("After sort (default)");
		System.out.println(Arrays.toString(numbers));
		
		Arrays.sort(numbers, new SortDown());
		
		System.out.println("After sort down");
		System.out.println(Arrays.toString(numbers));
		
		
		
		Shirt s1 = new Shirt("blue", "M"); 
		Shirt s2 = new Shirt("red", "S"); 
		Shirt s3 = new Shirt("yellow", "L"); 
		Shirt s4 = new Shirt("black", "S");  
		Shirt s5 = new Shirt("blue", "L");
		
		Shirt[] shirts = {s3, s1, s2, s4, s5}; 
		
		System.out.println("*** SHIRTS ***");
		System.out.println("Before sort");
		System.out.println(Arrays.toString(shirts)); 
		
		Arrays.sort(shirts);
		
		System.out.println("After sort (default)");
		System.out.println(Arrays.toString(shirts));
		
		Arrays.sort(shirts, new ShirtSizeComparator());
		
		System.out.println("After sort (ShirtSizeComparator)");
		System.out.println(Arrays.toString(shirts));
		
		
		
	}
	

}
