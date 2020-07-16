package oopsConcepts;
/*Final -  it cannot be changed 
 * Variable - cannot be assigned anew value 
 * method  - cannot be overrided anymore
 * class  - it cannopt be extended
 * */
final public class FinalIntro{
	
	// final variable
	final int i = 10;
	
	public void s() {
//		i =12; 
		System.out.println(i);
	}
	
	public void s(int a) {
//		i =113; 
		System.out.println(i);
	}
	
	
	public static void main (String args[]) {
		FinalIntro o = new FinalIntro();
		o.s();
		System.out.println(o.i);;
	}

}



