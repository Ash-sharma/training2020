package oopsConcepts;
/*Overloading  -  you can use same method name and use it with different functionality
 * two ways of overloading -
 * 1. Change number of parameters 
 * 2. Changing the data type of parameters
 * */
public class OverloadingIntro {
	
	
	public int sum (int a , int b) {
		return (a+b);
	}
	
	public int sum(int a, int b, int c) { // overloaded the method by changing the parameter
		return a+b+c;
		
	}
	
	public double sum(double a, double b, double c) { // overloaded by changing the data type
		return a+b+c;
	}
	
	public int sum(int a) {        // overloaded the method by changing the parameter
		return a;
	}
	
	public String sum (String a) {   // changing the datatype of the parameter
		return a;
	}
	
	
	
	// Q - if you change the retrun type of the method no impact on the overloading
//	public int sum1(int a, int b) {
//		return a+b;
//	}
//	
//	public void sum1(int a, int b) {
//		System.out.println(a+b);
//	}
	
	public static void print(String a) {
		System.out.println(a);
	}
	public static void print(String a, String b) {
		System.out.println(a+ b);
	}

	// Can we overload the main method in java?
	public static void main (String args[]) {
	OverloadingIntro o = new OverloadingIntro();
	System.out.println(o.sum(2));
	System.out.println(o.sum(2, 3,5));
	System.out.println(o.sum(2,2));
	System.out.println(o.sum("Hi"));
	System.out.println(o.sum(4.0 , 5.1, 6.5));
	}
	
	public static void main(String arg) {
		System.out.println("Hi");
	}
	public static void main() {
		System.out.println("Hi");
	}
	

}
