package oopsConcepts;

// Hierarchical
public class InhIntro3 extends SubClass1{
	
	void method4()
	{
		System.out.println("I am in hierarchial method");
	}
	
	public static void main (String args[]) {
	InhIntro3 obj1 = new InhIntro3(); 
	obj1.method4();
	obj1.method2();
	}

}
