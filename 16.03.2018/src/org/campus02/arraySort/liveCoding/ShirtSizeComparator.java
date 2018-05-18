package org.campus02.arraySort.liveCoding;

import java.util.Comparator;

public class ShirtSizeComparator implements Comparator<Shirt>{


	@Override
	public int compare(Shirt o1, Shirt o2) {
		int tmp = o1.size.compareTo(o2.size);
		
		if(tmp == 0)
			return o2.color.compareTo(o1.color); 
		
		return tmp; 
	}

}
