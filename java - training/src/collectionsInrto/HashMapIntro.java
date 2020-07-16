/*key and value pairs in hasMaps
 * maps cannot contain duplicate key
 *  no order
 * */

package collectionsInrto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIntro {
	
	public static void main (String args[]) {
		
		// Create hashmap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// add values
		hm.put(5, "ash");
		hm.put(1, "pen");
		hm.put(10, "study");
		hm.put(15, "fast");
		hm.put(5, "aaa");    // overided the previous value
		
		System.out.println(hm);
//		hm.remove(5);
		System.out.println(hm);
		hm.replace(15, "faster");
		
		System.out.println(hm.get(5));
		
		// Iterate through 
//		for(Map.Entry m : hm.entrySet()) {
//			System.out.println(m.getKey()+ " " + m.getValue());
//		}
		
		
		// iterarte through using an iterator
		 Iterator i = hm.entrySet().iterator();
		 while (i.hasNext()) {
			 Map.Entry m = (Map.Entry)i.next();
			 System.out.println(m.getKey()+ " " + m.getValue());
		 }
		
		
		
		
	}

}
