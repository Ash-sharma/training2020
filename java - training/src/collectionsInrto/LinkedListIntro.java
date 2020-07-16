package collectionsInrto;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIntro {
	
	public static void main (String args[]) {
		
		
		// Create linked list
		LinkedList <String> l = new LinkedList<String>();
		
		
		//adding elements
		l.add("ash");
		l.add("Day");
		l.add("Night");
		l.add("ash");
		
		System.out.println(l);
		
		//to add on specific position
		l.add(2, "Lucy");
		
		l.addFirst("aaa");
		l.addLast("last element");
		
		l.removeLast();
		
		System.out.println(l);
		
		
		// loops 
//		for loop
		for(int i=0 ; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		//2. for each
				for(String i: l) {
					System.out.println("by for each loop");
					System.out.println(i);
				}
				
				//3. while loop
				int i = 0;
				while(l.size()>i) {
					System.out.println(l.get(i));
				i++;
			}
				// 4.Iteratot
				Iterator it1 = l.iterator();  // creating iterator
				while(it1.hasNext()) {
					System.out.println(it1.next());
				}
	}

}

/* 		    Array List 									LinkedList
 * Search   faster 											slower 
 * Deletion slower											Faster
 * Insertion slower											Faster
 * memory	consume less memory								consume more memory
 * */
