package sorting.ue.carts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DemoCartSort {

	public static void main(String[] args) {
		
		Cart c1 = new Cart("c", 2, 5, 1.2); 
		Cart c2 = new Cart("b", 6, 9, 5.2); 
		Cart c3 = new Cart("a", 7, 3, 3.2); 
		
		ArrayList<Cart> carts = new ArrayList<>(); 
		carts.add(c1); 
		carts.add(c2); 
		carts.add(c3); 
		
		System.out.println("Before sort"); 
		System.out.println(Arrays.toString(carts.toArray()));
		
		Collections.sort(carts);
		
		System.out.println("After sort comparable"); 
		System.out.println(Arrays.toString(carts.toArray()));
		
		Collections.sort(carts, new CartUsernameComparator());
		
		System.out.println("After sort CartUsernameComparator"); 
		System.out.println(Arrays.toString(carts.toArray()));
		
		Collections.sort(carts, new CartTotalItemsComparator());
		
		System.out.println("After sort CartTotalItemsComparator"); 
		System.out.println(Arrays.toString(carts.toArray()));
		
		Collections.sort(carts, new Comparator<Cart>() {

			@Override
			public int compare(Cart o1, Cart o2) {
				double val1 = o1.getTotalAmount() / o1.getTotalItems();
				double val2 = o2.getTotalAmount() / o2.getTotalItems();
				
				if(val1 < val2) return -1; 
				if(val1 == val2) return 0; 
				return 1; 
			}
			
		});
		
		System.out.println("After sort Anonyme comparator class"); 
		System.out.println(Arrays.toString(carts.toArray()));
	}

}
