package oopsConcepts;

/*Overrding  -  inheretence 
 * 1. method must have the same name as the parent class
 * 2. method must have the same parameters as the parent class
 * 3. there must be a inheritence
 * 
 * Cannot over ride static methods
 * cannot override main method
 * */
class parent{
	
	int i  =10;
	public void age(int a) {
		System.out.println(a);
	}
	
	final void name (String name) {
		System.out.println(name);
	}
}

public class OverridingIntro extends parent{
	
	int j = 20;
	
	public void age(int a) {
		System.out.println(" Hi " + a );
	}
//	void name (String name) {
//		System.out.println("Hi " + name);
//	}
	
	void ft() {
		System.out.println("I am a child method");
	}
	
 
	public static void main(String args[]) {
		OverridingIntro o = new OverridingIntro();
		System.out.println(o.i);
		o.name("ash");
		System.out.println(o.j);
		o.ft();
		o.age(50);
	}
}

class subclass extends OverridingIntro{
public subclass() {
	// TODO Auto-generated constructor stub
}
 public static void main (String args[]) {
 subclass o1 = new subclass();
    o1.ft();
    o1.name("ash");
 }
}

/* Overloading 											Overriding
 * used to increase readability 				provide specific implementation of the method
 * within class									two classes are having inheritence
 * parameters mnust be different				parameters must be same
 * compile time polymorphism					run time polymorphism
 * return type has no effect 					return type should be the same as the parent class
 * */
