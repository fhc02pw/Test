package sorting.ue.carts;

import java.util.Comparator;

public class CartUsernameComparator implements Comparator<Cart>{

	@Override
	public int compare(Cart arg0, Cart arg1) {
		return arg0.getUsername().compareTo(arg1.getUsername()); 
	}

}
