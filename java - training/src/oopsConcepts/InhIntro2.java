package oopsConcepts;


public class InhIntro2 extends SubClass1{
	
	void method3() {
		System.out.println("I am in the child class of the subclass");
	}
	
	public static void main (String args[]) {
		
		InhIntro2 obj = new InhIntro2();
		SubClass1 ob2 = new InhIntro2();
		
		obj.method3();
		obj.method2();
		obj.method1();
	}

}
