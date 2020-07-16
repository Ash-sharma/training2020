package oopsConcepts;

public class EncapIntro2 {
	
	public static void main (String args[]) {
		
	EncapIntro1	o = new EncapIntro1();
//	encap1.name;  because variable is private 
	 o.setName("ash");
	 System.out.println(o.getName());
	 
	o.setAge(10);
	 System.out.println(o.getAge());
	System.out.println(o.getAddress());
	System.out.println(o.getLastName());
	
	}

}
