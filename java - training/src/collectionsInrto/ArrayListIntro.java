package collectionsInrto;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntro {

	public static void main (String args[]) {
		
		// To create an array list 
		ArrayList<String> alist = new ArrayList<String>();
		
		// to add elements at last postion in list
		alist.add("ash");
		alist.add("mike");
		alist.add("Lucy");
	    alist.add("Pat");
	    alist.add("Angela");
	    
	    // to add elements at specific position 
	    alist.add(1, "ash1");
	    
	    // to change an element in list
	    alist.set(1, "ash2");
	    
	    // to remove an element using index
	    alist.remove(1);
	    
	    // to remove an elemnet using name
	    alist.remove("mike");
	    
	    System.out.println(alist);
	    
	    // to iterate over the array list use for each loop
	    for (String s : alist) {
	    	System.out.println(s);
	    }
	    
	    // to sort any collections use
	    Collections.sort(alist);
	    
	    for (String s : alist) {
	    	System.out.println(s);
	    }
	    
	    // How to convert array to array list and vise a versa
	} 	
}
/*
 * ArrayList is a resizable-array implementation of the List interface. 
 * It implements all optional list operations, and permits all elements, including null.
 * */
