/* abstraction is a process of hiding the implementatoin details and showing only finctionality to the user
 * two ways to achieve abstraction
 * 1. Abstratct classes 
 * 2. Interface
 * */
/* Abstratct classes
 * Use abstract key word to declare a class as abstrtact
 * They can have both abstract and non abstract methods
 * It cannot be instantiated
 * It can have constructors and static methods
 * It can also final methods
 * 
 * Subclass can use non- abstract methods but it is mandatory to implememnt the abstract method
 * */

package oopsConcepts;

abstract class A{
	
//	abstract void inpoutemail();
//	abstract void inpoutpassword();
//	abstract void clicksubmit();
	
	final int subtract(int a, int b) {
		return a-b;
	}
	 
	abstract void percentage();  // abstract method , no body is provided in the abstract method

	
	public int sum(int a, int b) {             // non-abstract method
		return a+b;}
}

public class AbsIntro extends A{
	
void percentage() {
	System.out.println("lets calculate percentage");
}

public int sum (int a, int b) {
	System.out.println( "your sum is " );
	return  a+b;
}

public static void main (String args []) {
	AbsIntro o = new AbsIntro();
	o.percentage();
	System.out.println(o.sum(10, 10));
	System.out.println(o.subtract(10, 5));
}

}
/*abstract class login (general)
 * login page for amazon extends login  -  email , pass (8 char upper and lower), submit 
 * login page for kroger -   pass(4 char )
 * login page for chase - 
 * */
