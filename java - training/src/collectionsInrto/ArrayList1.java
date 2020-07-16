/*array  - was fixed length 
 * arrayList - dynamically grows , shrinks
 * already has built in methods to sort, dlete, add 
 * */
package collectionsInrto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

	public static void main (String args[]) {
		
		// how to create an array list 
		ArrayList<String> lista = new ArrayList<String>();
		
		//how to add elements to an array list add();
		lista.add("ash");
		lista.add("mike");
		lista.add("tom");
		lista.add("smith");
		lista.add("jill");
		System.out.println(lista);

		
		//to add on specific position
//		lista.add(2, "Lucy");
//		
//		System.out.println(lista);
		
		// remove the elements
//		
//		lista.remove(2);  // by using index
//		System.out.println(lista);
//		
//		lista.remove("ash"); // by value
//		System.out.println(lista);
//		System.out.println(lista.size()); // size method to see the size of array list
//	
		Collections.sort(lista);
		System.out.println(lista);
		
		// get method 
//		System.out.println(lista.get(1));
		
		
		//Loops in array list 
		//1. for loop
		for(int i=0 ; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//2. for each
		for(String i: lista) {
			System.out.println("by for each loop");
			System.out.println(i);
		}
		
		//3. while loop
//		int i = 0;
//		while(lista.size()>i) {
//			System.out.println(lista.get(i));
//			i++;
//		}
		
		//4. Iterator
		Iterator it1 = lista.iterator();  // creating iterator
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		for (int i =0 ; i<lista.size(); i++) {
			if(lista.get(i) == "jill") {
				System.out.println("found jill, exiting the loop");
				break;
			}
			System.out.println("still searching");
		}
		 // index of 
		System.out.println(lista.indexOf("jill"));
		
		
	}
	
	
	
	
	
}
