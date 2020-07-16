package oopsConcepts;
// 4 kinds of access modifiers 
/*1. Public - access in the same class,in the same package, subclass , other packages
 *2. Protected - access in the same class,in the same package, subclass, dosen't provide access the other package
 *3. default -  access in the same class,in the same package, 
 *4. private - access in the same class
 * */
/*OOPs
 * Class   -
 * objects  - 
 * Inheritence - super  - you can access parent class methods and variables , this, single, multilevel, hierarchical
 * Polymorphism - Over loading - for the same class, over riding - inheretence
 * Abstraction  -  abstract classes , interfaces
 * Encapsulation - it's a way data hiding
 * super - done
 * this - done
 * Final - done
 * */
public class OopsConcept {
	 int i =10;
	 int j =20;
	 int k =300;
	 
	 public OopsConcept() {}
	 
	 public void method1() {
		 System.out.println("I am in parent class method 1");
	 }
	 public void method2() {
		 System.out.println("I am in parent class method 2");
	 }

}
