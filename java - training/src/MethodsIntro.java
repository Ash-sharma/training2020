
public class MethodsIntro {
	
	String [] args = {}; // array decalartion , parameter for the main method
	
	// methods  - bloc of code it runs when it i called 
	// you can pass any data into it which is called the parameter of it
	// create method syntax access modifier of method , return type,  method name
	// parameters - set of arguments used by the method
	
	
	public void Method1() {
		System.out.println("method 1");
		}
	
	public int method2() {
		int i =1;
		return i;
	}
	
	public String method3() {
		String i= "Hi";
		return i;
	}
	
	public int sum(int x, int y) {
		return x+y;
	}
	public int method5(int y, String s) {
		System.out.println(s);
		return y;
	}
	
	public static void method4() {
		System.out.println("I am a static method");
	}
	
	// recursion 
	public static int sum1(int x) {
		if(x>0) {
			return x + sum1(x-1);  //5+(4+(3+(2+1)))
		}
		else {
			return 0;
			}
	}
	
	
	public static void main (String args[]) {  // main method
		// recursion method
		System.out.println(sum1(5));
		 
//		MethodsIntro obj1 = new MethodsIntro();
//		obj1.Method1();        // to access any non staic method you have to make an object
//		method4();             // object is not needed to access an ststic method
////		System.out.println(obj1.method2());
//		int j =2; 
//		System.out.println(obj1.method2() + j);
////		System.out.println(obj1.method3());
//		
//		System.out.println(obj1.sum(5, 10));
//		System.out.println(obj1.method5(100, "my method is just retruning whatever value i gave"));
		
	}

}
