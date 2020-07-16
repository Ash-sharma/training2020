
public class VariableIntro {

		
		static int  a = 10; /// variable               
		static  String  name = "ash"; /// variable
		
		//variable declaration inlcude datatype varablenName ;  ------declartion
		int n1 =100; 
		
		// variableName = value       ---- initialization
		
		// 1 Boolean
		boolean b1 = true;
		boolean b2 = false;
		
		//2 Character
		char c1 = 'a';
		char c2 = '3';
		
		//3 byte -128 to 127   1byte Ram
		byte by1 =10;
		byte by2 = -12;
		
		// 4 short  -32,768 to 32,767 2bytes Ram
		short sh1 = 327;
		
		//5 integer 4bytes RAM -20M - 20M
		int i1 = 50;
		int i2 = 30;
		
		//6 for long  8 bytes  
		
		long l1 = 1000000000000000000L;
		
		//7  float decimals 8 bytes
		float f1 = 1.1f;            // 1.1000001
		float f2 = 2.2f;			//  2.20000001	
		
		//8 double 16byte
		double d1 = 123.1;
		double d2 = 1.5;
		
		// Non primitive String
		String s1 = "ash is on laptop";
		
		//Java Type casting 
		double dd = 100.5;
		int aa = (int) dd;  // narrowing casting , you have to expilicitly do it
		char i = (char)dd;
		
		int ab = 99;						// Widening casting byte>short>char>int>long>float>double
		double dv =ab;
		
		
		public void sum()
		{
			System.out.println(i1/i2);
		}
		
		public void increment()
		{
			System.out.println(--i1);
		}
		
		public void roperators()
		{
			System.out.println(i1!=i2);
			
		}
		
		public void logicaloperators()
		{
			int x = 40;
			System.out.println(x<i2 && x<i1); // both the conditions needs to be true 
			System.out.println(x<i2 || x<i1); // one  conditions needs to be true for the output to be true
			System.out.println(!(x<i2 && x<i1)); // not operator
			System.out.println(!(x<i2 || x<i1));
		}
		
		public void compoundop()
		{ 
		int	x = i2+i1;
		x = x +i1; //x += i1;  //x = x +i1
		x -= i2; //x = x-i2
			System.out.println(x);
		}

		
		
		
		public static void main(String args[]) { //main method 
//			System.out.println(name);
			VariableIntro obj1 = new VariableIntro();
//			System.out.println(obj1.b1);
//			System.out.println(obj1.b2);
//			System.out.println(obj1.c1);
//			System.out.println(obj1.s1);
//			System.out.println(obj1.ab);
//			System.out.println(obj1.dv);
//			System.out.println(obj1.dd);
//			System.out.println(obj1.aa);
//			obj1.sum();
//			obj1.increment();
//			obj1.roperators();
//			obj1.logicaloperators();
			obj1.compoundop();
			
			
			String s3  = "123";
			int mm = Integer.parseInt(s3);
			System.out.println(mm);
			
		
		}

	}
	/*
	 * variables 
	 * data types  8 primitive 
	 * data type casting casting 
	 * 
	 * Operator
	 * 1. Assignment operator : =
	 * 2. Arthemetic operators : + - *  / % ++ --   (placing oif the increment on left and right has different meaning)
	 * 3. Relational Operator: > < >= <= ==(checks if both values are equal) !=(checks if both values are not equal) output is true/false
	 * 4. Logical Operators: && || & |  ! 
	 * 5. Bitwise operator & | ^ ~ << >> >>>
	 * a = 00111100 , a&b = 0000 1100
	 * b = 00001101 , a|b = 0011 1101 ~a = 11000011
	 * 6. compund assignment operators +=, -=, *=, /=, %= 
	 * 
	 * 
	 * Non-primitive
	 * int - Integer
	 * boolean - Boolean 
	 * char - Character
	 * 
	 * 
	 * */
	
	
