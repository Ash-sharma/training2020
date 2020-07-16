
public class VariablesDiff {
	
	int i=0;                 // instance varaible , they can accesed buy all methods except static method
//								, in static method they can only be accessed through object
	static int j =0; //1 2	3	// static variable can beacces by any staic or non static method , doesn't need object
	
	public void method1()
	{
		int x = 0; // local variable
		i++;
		j++;
		System.out.println(i);
		System.out.println(j);
		System.out.println("new object");
	}
	
	public void method2() {
		i =10;
//		j =20;
		System.out.println(i);
	}
	
	public static void main (String args[])
	{
		VariablesDiff obj1 = new VariablesDiff();
		obj1.method1();
		VariablesDiff obj2 = new VariablesDiff();
		obj2.method1();
		VariablesDiff obj3 = new VariablesDiff();
		obj3.method1();
//		VariablesDiff obj4 = new VariablesDiff();
//		obj4.method1();
//		VariablesDiff obj5 = new VariablesDiff();
//		obj5.method1();
//		VariablesDiff obj6 = new VariablesDiff();
//		obj6.method1();
		
	}

}
