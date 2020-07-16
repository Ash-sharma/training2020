/* compile time error and run time 
 * exceptions
 * 1. checked - compile time execptions
 * 2. unchecked - run time execption
 * keywords- 
 * try               try{}catch(){}
 * catch
 * finally
 * throw   - allows you to create a custom error - unchecked exception
 * throws  - declare an execption / checked exception
 * */

package oopsConcepts;

import java.io.IOException;

public class ExecptionIntro {
	
	static void m1(int i) {
		if (i <10)
		{
			throw new ArithmeticException("number is too small");
		}
		else {
			System.out.println("Number is within range");
		}
	}
	
	static void m2() throws IOException{
		throw new IOException("there is an error");
	}
	
	static void m3() {
		int i = 50/0;
//		throw new java.io.IOException("unpropogated error"); // checked exception
	}
	
	static void m4() {
		m3();
	}
	
	static void m5() {
		try {
			m4();
		} catch (Exception e) {System.out.println("exception handled");}
	}
	
public static void main (String [] args) 
{
	m5();
	
	m1(11);
	
	try{m2();}
	catch(Exception e) {System.out.println("exception handeled");}
	
	try {
	int [] n = {1,2,3};
	System.out.println(n[3]);
	}
	catch(Exception e) {
		System.out.println(" Your is of length 3, please provide a valid input");
	}
	
	try {
	int i =100/0;
	} catch (Exception e) {
		System.out.println(" you are dividing a number by 0");
	}
	
	String s = null;
	
	try {
	System.out.println(s.length());
	}  catch (Exception e){
		System.out.println(" value of your string is null");
	}
	
	
	try {
		String s1 = "abc";
	} catch(Exception e) {
		System.out.println(" cannot convert string into integer");
	}
	
//	finally {
//		System.out.println(" This will be printed no matter what");
//	}

}

}

/*  throw									throws
 * exlicitly throw an execption				declare an exception
 * it cannot be propagated					propogated
 * followed by an instance					is follwoed by a class
 * used within the method					used with the method
 * cannot throw multiple execptions			decalare multiple execptions
 * */
