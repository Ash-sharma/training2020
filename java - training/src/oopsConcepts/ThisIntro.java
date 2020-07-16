package oopsConcepts;

public class ThisIntro {
	int age ;               //variables
	String firstName;
	String lastName;
	
	public ThisIntro(){         //default constructor
		System.out.println("I am in first constructor");
	}
	 
	public ThisIntro(int age, String firstName, String lastName) //make constructos
	{  //this refers to instance variables of the class
		this();                          // you expilicitly call constructor only in the very first line of the code after constructor is defined
		this.age = age;
		this.firstName =firstName;
		this.lastName = lastName;
		System.out.println("I am in 2nd constructor");
		}
	
	public ThisIntro(int age, String firstName) {    
		this(10, "ash", "ash");
		this.age = age;
		this.firstName = firstName;
		System.out.println("I am in third constructor");
	}
	
	public ThisIntro(String name) {
		this(10, "ash");
	}
	
	public  void method1() {                     // methods par
		System.out.println("Method 1");
	}
	
	public void method2() {
		this.method1();
	}
	

	
	public static void main(String srgs[]) {            // call methods
//		  ThisIntro obj1 = new ThisIntro();
	ThisIntro obj1 = 	new ThisIntro(10,"Jhon", "Smith");
	System.out.println(obj1.age + obj1.firstName + obj1.lastName);
	
	ThisIntro  obj2 = new ThisIntro(11, "Rob");
	System.out.println(obj2.age + obj2.firstName);
	
//	obj1.method1();
//	obj1.method2();
//	
	

		
	}
	

}

/*this - can be used to refrence multiple things in the class
 * 1. refer to current class instance variable
 * 2. used to invoke current class methods
 * 3. invoke current class constructor
 * */
