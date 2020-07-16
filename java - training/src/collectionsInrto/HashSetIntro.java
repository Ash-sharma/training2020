package collectionsInrto;

import java.util.HashSet;
import java.util.Iterator;

// Hash Set
/* no order 
 * no duplicates
 * allow null value - no two null values 
 * */
public class HashSetIntro {
	
	public static void main (String args[]) {
		
		// create a hash set
		HashSet<Integer> hs = new HashSet<Integer>();
		
		//adding data to hashset
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(2);  // doest take duplicate values
		hs.add(null);
		hs.add(null); // two null values not allowed
		
		System.out.println(hs);
		
		
//		two ways to iterate
//		1. Using iterator
		Iterator<Integer> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
//		2. for each loop
		for (Integer j : hs) {
			System.out.println(j);
		}
		
		
		
		
		
	}

}
