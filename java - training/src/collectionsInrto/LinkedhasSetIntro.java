package collectionsInrto;

import java.util.LinkedHashSet;

/*maintains the insertion order
 * elements gets sorted in the same sequence
 * */

public class LinkedhasSetIntro {
	
	public static void main (String args[]) {
		
//		Crete link has set
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		// add
		lhs.add("z");
		lhs.add("a");
		lhs.add("kk");
		lhs.add("bcs");
		lhs.add("kk");  // no duplicates
		
		
		System.out.println(lhs);
		
		
		
		
		
	}

}
