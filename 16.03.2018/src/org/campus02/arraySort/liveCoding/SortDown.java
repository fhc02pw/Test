package org.campus02.arraySort.liveCoding;

import java.util.Comparator;

public class SortDown implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 > o2) return -1; 
		if(o1.equals(o2)) return 0; 
		return 1; 
	}

}
