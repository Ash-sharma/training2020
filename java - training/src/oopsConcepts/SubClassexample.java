package oopsConcepts;
// inhereitence 
public class SubClassexample extends OopsConcept{
	int k =30;
	int i =50;
	 public void method3() {
		 System.out.println("I am inside subclass method 1");
	 }
	 public void method2() {
		 System.out.println("I am inside subclass method 2");
	 }
	 
	 public void method4 () {
		 super.method2();
		 method2();
		System.out.println(super.i);
		 
	 }
	public static void main (String [] args)
	{
		SubClassexample obj = new SubClassexample();
		System.out.println(obj.i);
	
//		obj.method1();
		obj.method2();
		obj.method4();
//		System.out.println(obj.i);\
//		obj.method3();
		System.out.println(obj.k);
		
		//this keyword
		
	
	}
	

}
