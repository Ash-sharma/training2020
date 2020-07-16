package oopsConcepts;

public class InterIntro implements InterfaceA, InterfaceB {
	
	public void method1() {
		System.out.println("this is method 1");
	}

	
     public void method2() {
    	 System.out.println("this is method 2");
	}
     
     public void method10() {
    	 System.out.println("this is method 10");
	}
     
     public void method11() {
    	 System.out.println("this is method 11");
	}
     
     
     public static void main (String args[])
     {
    	 InterIntro i = new InterIntro();
    	 i.method1();
    	 i.method2();
    	 i.method10();
    	 i.method11();
     }
}
